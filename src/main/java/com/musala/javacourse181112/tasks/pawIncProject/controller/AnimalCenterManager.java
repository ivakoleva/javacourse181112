package com.musala.javacourse181112.tasks.pawIncProject.controller;

import com.musala.javacourse181112.tasks.pawIncProject.model.animals.Animal;
import com.musala.javacourse181112.tasks.pawIncProject.model.animals.Cat;
import com.musala.javacourse181112.tasks.pawIncProject.model.animals.Dog;
import com.musala.javacourse181112.tasks.pawIncProject.model.animals.SpecialTalent;
import com.musala.javacourse181112.tasks.pawIncProject.model.centers.*;
import com.musala.javacourse181112.tasks.pawIncProject.model.exceptions.InvalidInputException;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AnimalCenterManager {
    private EnumMap<CenterType, List<Center>> centerMap = new EnumMap<>(CenterType.class);

    public AnimalCenterManager() {
        Arrays.stream(CenterType.values()).forEach(activity -> centerMap.put(activity, new ArrayList<>()));
    }

    /**Registers a Adoption center with the given name.*/
    public void registerAdoptionCenter  (final String name) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvalidInputException {
        registerGivenCenter(AdoptionCenter.class, CenterType.ADOPTION, name);
    }

    /**Registers a Cleansing center with the given name.*/
    public void registerCleansingCenter (final String name) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvalidInputException {
        registerGivenCenter(CleansingCenter.class, CenterType.CLEANSING, name);
    }

    /**Registers a Castration center with the given name.*/
    public void registerCastrationCenter(final String name) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvalidInputException {
        registerGivenCenter(CastrationCenter.class, CenterType.CASTRATION, name);
    }

    /**Registers a dog with the given name, age and
     * learned commands in the given Adoption center.
     * */
    public void registerDog(final String dogName, final int dogAge, final int dogLearnedCommands , final String adoptionCenterName) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvalidInputException {
        registerGivenAnimal(Dog.class,CenterType.ADOPTION,adoptionCenterName, dogName, dogAge, dogLearnedCommands);
    }

    /**Registers a cat with the given name, age and
     * intelligence coefficient in the given Adoption center.
     * */
    public void registerCat(final String catName, final int catAge, final int catIntelligenceCoef, final String adoptionCenterName) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvalidInputException {
        registerGivenAnimal(Cat.class,CenterType.ADOPTION, adoptionCenterName,catName,catAge, catIntelligenceCoef);
    }

    /**Sends all UNCLEANSED animals from the given Adoption center
     *  to the given Cleansing center
     */
    public void sendForCleansing(final String adoptionCenterName,final String cleansingCenterName) throws InvalidInputException {

        if (adoptionCenterName == null || cleansingCenterName == null) throw new InvalidInputException();

        final AdoptionCenter adoptionCenter     = getCenterByType(CenterType.ADOPTION  , adoptionCenterName  );
        final CleansingCenter cleansingCenter = getCenterByType(CenterType.CLEANSING, cleansingCenterName);

        assert adoptionCenter != null && cleansingCenter != null;


        adoptionCenter.sendForCleansing(cleansingCenter);


        //final List<Animal> uncleansedAnimals = new ArrayList<>();
        /*= adoptionCenter.getAnimalList().stream()
            .filter(isUncleansed)
            .collect(Collectors.toList());
        adoptionCenter.getAnimalList().removeIf(isUncleansed);
        cleansingCenter.getAnimalList().addAll(uncleansedAnimals);*/
    }

    /** Sends all uncleansed animals from the given Adoption center
     *  to the given Castration center.
     *  */
    public void sendForCastration(final String adoptionCenterName, final String castrationCenterName) throws InvalidInputException {

        if (adoptionCenterName == null || castrationCenterName == null) throw new InvalidInputException();

        final AdoptionCenter adoptionCenter     = getCenterByType(CenterType.ADOPTION  , adoptionCenterName  );
        final CastrationCenter castrationCenter = getCenterByType(CenterType.CASTRATION, castrationCenterName);

        assert adoptionCenter != null && castrationCenter != null;

       adoptionCenter.sendForCastration(castrationCenter);
    }

    /**
     * Cleanses all animals from the given Cleansing center and returns them to
     * their corresponding Adoption centers.
     * */
    public void cleanse(final String cleansingCenterName) throws InvalidInputException {
        if (cleansingCenterName == null) throw new InvalidInputException();

        final CleansingCenter cleansingCenter     = getCenterByType(CenterType.CLEANSING  , cleansingCenterName  );

        assert cleansingCenter != null;

        cleansingCenter.onCleansingCommand();

    }

    /**
     * All CLEANSED animals from the given Adoption center get adopted, and
     * removed from the stored animals.
     * */
    public void adopt(final String adoptionCenterName) throws InvalidInputException {
        if (adoptionCenterName == null) throw new InvalidInputException();

        final AdoptionCenter adoptionCenter= getCenterByType(CenterType.ADOPTION  , adoptionCenterName  );

        assert adoptionCenter != null;

        adoptionCenter.onAdoptionCommand();
    }

    /**
     * Castrates all animals from the given Castration center and
     * returns them to their corresponding Adoption centers.
     * */
    public void castrate(final String castrationCenterName) throws InvalidInputException {
        if (castrationCenterName == null) throw new InvalidInputException();

        final CastrationCenter castrationCenter= getCenterByType(CenterType.CASTRATION  , castrationCenterName  );

        assert castrationCenter != null;

        castrationCenter.onCastrateCommand();

    }


    public void printStatistics(){
        System.out.println("Paw Incorporation Regular Statistics");

        System.out.println("Adoption Centers: " + centerMap.get(CenterType.ADOPTION).size());
        System.out.println("Cleansing Centers: " + centerMap.get(CenterType.CLEANSING).size());
        Set<Animal> sortedHistoryAdoptionAnimals = getAnimalsFiltered(animal -> animal.isAdopted(),getAllAnimals());
        ArrayList<Animal> cleansedAnimals = new ArrayList<>(getAnimalsFiltered(CleansingCenter.isCleansed, getAllAnimals()));

        System.out.println("Adopted animal: " + sortedHistoryAdoptionAnimals);//Animal.animalToString(sortedHistoryAdoptionAnimals));
        System.out.println("Cleansed animal: "+ Animal.animalToString(cleansedAnimals));

        System.out.println("Animals Awaiting Adoption: "  + getAllSortedAnimalsFromCenterByType(CenterType.ADOPTION,CleansingCenter.dontFilter, false).size());
        System.out.println("Animals Awaiting Cleansing: " + cleansedAnimals.size());

        //List<List<Animal>> allAdoptedAnimals = centerMap.get(CenterType.ADOPTION).stream().map(center -> center.getAnimalList()).collect(Collectors.toList());
        //List<Animal> collect = allAdoptedAnimals.stream().flatMap(Collection::stream).collect(Collectors.toList());
        //List<Animal> sortedHistoryAdoptionAnimals = getAllSortedAnimalsFromCenterByType(CenterType.ADOPTION, CleansingCenter.dontFilter, true);

        //List<Animal> sortedAdoptionAnimals = getAllSortedAnimalsFromCenterByType(CenterType.ADOPTION, CleansingCenter.isCleansed , false);
        //List<Animal> sortedCleansedAnimals = getAllSortedAnimalsFromCenterByType(CenterType.ADOPTION, CleansingCenter.dontFilter,false);

           }


    public void printCastrationStatistics(final String castrationCenter){
        getCenterByType(CenterType.CASTRATION, castrationCenter);

        System.out.println(castrationCenter);

        System.out.println("Paw Incorporation Regular Castration Statistics");

        System.out.println("Castration Centers: " + centerMap.get(CenterType.CASTRATION).size());


        List<Animal> allSortedAnimalsFromCastration = (new ArrayList<>(getAnimalsFiltered(CastrationCenter.isCastrated, getAllAnimals())));

        List<Animal> animalStream = getAnimalStreamByCenterType(CenterType.CASTRATION).flatMap(center -> center.getHistoryAnimalSet().stream()).collect(Collectors.toList());

        System.out.println("Castrated Animal: " + Animal.animalToString(animalStream));
    }

    public <T extends Animal & SpecialTalent> void registerGivenAnimal(final Class<T> animalClazz, final CenterType centerType,
                                                                       final String centerName,    final String animalName,
                                                                       final int animalAge,        final int animalSpecialTalent)
            throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, InvalidInputException {

        final AdoptionCenter adoptionCenter = getCenterByType(centerType, centerName);

        if (adoptionCenter == null || animalAge < 0 || animalName == null || animalSpecialTalent < 0) {
            throw new InvalidInputException();
        }

        final Constructor<T> constructor = animalClazz.getConstructor(String.class, Integer.TYPE);
        try {
            T animal = constructor.newInstance(animalName, animalAge);
            animal.setSpecialTalent(animalSpecialTalent);
            animal.setAdoptionCenter(adoptionCenter);
            adoptionCenter.addAnimal(animal);
        }catch (InvalidInputException e){
            System.err.println("wrong animal input data");
        }
    }


    public <T extends Center> void registerGivenCenter(final Class<T> centerClazz, final CenterType centerType, final String name)
            throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, InvalidInputException {

        if (name == null || centerType == null) throw new InvalidInputException();

        Constructor<T> constructor = centerClazz.getConstructor(String.class, java.lang.Integer.TYPE);
        final T centerInstance = constructor.newInstance(name,0);
        centerInstance.setName(name);
        centerInstance.setAnimalList(new ArrayList<>());
        centerMap.get(centerType).add(centerInstance);

    }


    private <T extends Center> T getCenterByType(final CenterType centerType, final String centerName) {
        List<T> centers = (List<T>) centerMap.get(centerType);

        Predicate<T> isRightCenter = center -> center.getName().equals(centerName);
        Optional<T> optionalT = centers.stream().filter(isRightCenter).findFirst();
        if (optionalT.isPresent()){
            return optionalT.get();
        }else{
            System.err.println(centerName + " not found");
            return null;
        }
    }

    private Set<Animal> getAllAnimals(){
     /*   return centerMap.forEach((centerType, centers) -> {
            getAllSortedAnimalsFromCenterByType(centerType,CleansingCenter.dontFilter,false);
        });*/
        Set<Animal> result = new HashSet<>();
        EnumMap<CenterType, List<Center>> centerMap = this.centerMap;

        for (Map.Entry<CenterType, List<Center>> set: centerMap.entrySet()) {

            if (true/*CenterType.ADOPTION.equals(set.getKey().getType())*/){
                set.getValue().forEach(center -> result.addAll(center.getHistoryAnimalSet()));
            }
            set.getValue().forEach(center -> result.addAll(center.getAnimalList()));
        }
        return result;
    }

    private Set<Animal> getAnimalsFiltered(final Predicate<Animal> animalPredicate,final Set<Animal> animals){
        return animals.stream()
                .filter(animalPredicate)
                .collect(Collectors.toSet());
    }

    private List<Animal> getAllSortedAnimalsFromCenterByType(final CenterType centerType, final Predicate<Animal> filterPredicate,final boolean willGetAdoptedList) {
        return getAnimalStreamByCenterType(centerType)
                .flatMap(center -> {
                    // for now only Adoption center have history
                    if (willGetAdoptedList /*&& CenterType.ADOPTION.equals(centerType)*/) {
                        return center.getHistoryAnimalSet().stream();
                    }
                    return center.getAnimalList().stream();
                })
                .filter(filterPredicate)
                .distinct()
                .sorted(Comparator.comparing(Animal::getName))
                .collect(Collectors.toList());
        /*   if (CenterType.ADOPTION){

                        if (willGetAdoptedList){
                            return Stream.concat(center.getHistoryAnimalSet().stream(),center.getAnimalList().stream());
                        }else return center.getHistoryAnimalSet();
                    }
                    */
    }
   /* private List<Animal> getAllSortedHistAnimalsFrom(CenterType centerType) {
        return getAnimalStreamByCenterType(centerType)
                .flatMap(center -> center.getAnimalList().stream() )
                .sorted(Comparator.comparing(Animal::getName))
                .collect(Collectors.toList());

        /*List<Center> collect = centerMap.get(centerType);
        collect.stream().flatMap(center -> center.getAnimalList().stream());

    }*/

    private Stream<Center> getAnimalStreamByCenterType(final CenterType centerType) {
         return  centerMap.get(centerType).stream();
    }

   /* private List<Animal> ss(CenterType centerType) {
        return (centerMap.get(centerType)).stream()
                .flatMap(center -> center.stream() )
                .sorted(Comparator.comparing(Animal::getName))
                .collect(Collectors.toList());

        /*List<Center> collect = centerMap.get(centerType);
        collect.stream().flatMap(center -> center.getAnimalList().stream());

    }*/

    //DEBUG
    public static void main(String[] args) {
        AnimalCenterManager centerManager = new AnimalCenterManager();
        //registerGivenCenter(CenterType.ADOPTION.getType(), "sss");
        try {
            Command sassa = Command.getCommand("RegisterAdoptionCenter");
            sassa.invoke(centerManager,"RegisterAdoptionCenter | Destiny".split("[ ][|][ ]]"));
            //centerManager.registerAdoptionCenter("registeredAdoptionCenter");
            centerManager.registerGivenCenter(CleansingCenter.class, CenterType.CLEANSING, "ssaas");
            CleansingCenter ssaas = centerManager.getCenterByType(CenterType.CLEANSING, "ssaas");
            centerManager.registerGivenAnimal(Cat.class,CenterType.ADOPTION,"registeredAdoptionCenter","gosho",2,2);
            //System.out.println(ssaas.toString());
            //registerGivenCenter(.class, "sss");
        } catch (NullPointerException n) {
            System.err.println("Not found command");
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException | NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvalidInputException e) {
            System.err.println("Bad Input");
        }

    }
}
