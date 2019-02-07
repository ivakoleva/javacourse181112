package com.musala.javacourse181112.paw_inc;

import com.musala.javacourse181112.paw_inc.classes.animals.Animal;
import com.musala.javacourse181112.paw_inc.classes.animals.Cat;
import com.musala.javacourse181112.paw_inc.classes.animals.Dog;
import com.musala.javacourse181112.paw_inc.classes.centers.*;

import java.util.*;

/**
 * Created by Aykut Ismailov on 4.2.2019 г.
 */
public class AnimalCenterManager {
    private final EnumMap<TypeOfActivity, List<Center>> centersEnumMap = new EnumMap<>(TypeOfActivity.class);
    private final EnumMap<TypeOfActivity, List<Animal>> animalsEnumMap = new EnumMap<>(TypeOfActivity.class);

    public AnimalCenterManager() {
        Arrays.stream(TypeOfActivity.values()).forEach(activity -> {
            centersEnumMap.put(activity, new ArrayList<>());
            animalsEnumMap.put(activity, new ArrayList<>());
        });
    }

    public void registerCleansingCenter(final String name) {
        final CleansingCenter cleansingCenter = new CleansingCenter();
        cleansingCenter.setName(name);
        cleansingCenter.setAnimals(new ArrayList<>());
        centersEnumMap.get(TypeOfActivity.CLEANSING).add(cleansingCenter);
    }

    public void registerAdoptionCenter(final String name) {
        final AdoptionCenter adoptionCenter = new AdoptionCenter();
        adoptionCenter.setName(name);
        adoptionCenter.setAnimals(new ArrayList<>());
        centersEnumMap.get(TypeOfActivity.ADOPTION).add(adoptionCenter);
    }

    public void registerCastrationCenter(final String name) {
        final CastrationCenter castrationCenter = new CastrationCenter();
        castrationCenter.setName(name);
        castrationCenter.setAnimals(new ArrayList<>());
        centersEnumMap.get(TypeOfActivity.CASTRATION).add(castrationCenter);
    }

    public void registerDog(final String name, final int age, final int learnedCommands, final String adoptionCenterName) {
        final AdoptionCenter adoptionCenter = findAdoptionCenter(adoptionCenterName);

        if (adoptionCenter != null) {
            final Dog dog = new Dog(name, age, learnedCommands, adoptionCenter);
            adoptionCenter.getAnimals().add(dog);
        } else {
            System.err.println("Adoption Center not found!");
            System.exit(1);
        }
    }

    public void registerCat(final String name, final int age, final int intelligenceCoefficient, final String adoptionCenterName) {
        final AdoptionCenter adoptionCenter = findAdoptionCenter(adoptionCenterName);

        if (adoptionCenter != null) {
            final Cat cat = new Cat(name, age, intelligenceCoefficient, adoptionCenter);
            adoptionCenter.getAnimals().add(cat);
        } else {
            System.err.println("Adoption Center not found!");
            System.exit(1);
        }
    }

    public void sendForCleansing(final String adoptionCenterName, final String cleansingCenterName) {
        final AdoptionCenter adoptionCenter = findAdoptionCenter(adoptionCenterName);
        final CleansingCenter cleansingCenter = findCleansingCenter(cleansingCenterName);

        if (adoptionCenter != null && cleansingCenter != null) {
            adoptionCenter.sendForCleansing(cleansingCenter);
        } else {
            System.err.println("Center not found!");
            System.exit(1);
        }
    }

    public void sendForCastration(final String adoptionCenterName, final String castrationCenterName) {
        final AdoptionCenter adoptionCenter = findAdoptionCenter(adoptionCenterName);
        final CastrationCenter castrationCenter = findCastrationCenter(castrationCenterName);

        if (adoptionCenter != null && castrationCenter != null) {
            adoptionCenter.sendForCastration(castrationCenter);
        } else {
            System.err.println("Center not found!");
            System.exit(1);
        }
    }

    public void cleanse(final String cleansingCenterName) {
        final CleansingCenter cleansingCenter = findCleansingCenter(cleansingCenterName);

        if (cleansingCenter != null) {
            animalsEnumMap.get(TypeOfActivity.CLEANSING).addAll(cleansingCenter.cleanseAnimals());
        } else {
            System.err.println("Cleansing Center not found!");
            System.exit(1);
        }
    }

    public void adopt(final String adoptionCenterName) {
        final AdoptionCenter adoptionCenter = findAdoptionCenter(adoptionCenterName);

        if (adoptionCenter != null) {
            animalsEnumMap.get(TypeOfActivity.ADOPTION).addAll(adoptionCenter.adoptAnimals());
        } else {
            System.err.println("Adoption Center not found!");
            System.exit(1);
        }
    }

    public void castrate(final String castrationCenterName) {
        final CastrationCenter castrationCenter = findCastrationCenter(castrationCenterName);

        if (castrationCenter != null) {
            animalsEnumMap.get(TypeOfActivity.CASTRATION).addAll(castrationCenter.castrateAnimals());
        } else {
            System.err.println("Castration Center not found!");
        }
    }

    public void castrationStatistics() {
        System.out.println("Paw Incorporation Regular Castration Statistics");

        System.out.println("Castration Centers: " + centersEnumMap.get(TypeOfActivity.CASTRATION).size());

        animalsEnumMap.get(TypeOfActivity.CASTRATION).sort(Comparator.comparing(Animal::getName));
        System.out.println("Castrated Animal: " + printAnimalList(animalsEnumMap.get(TypeOfActivity.CASTRATION)));
    }

    public void printStatistics() {
        System.out.println("Paw Incorporation Regular Statistics");

        System.out.println("Adoption Centers: " + centersEnumMap.get(TypeOfActivity.ADOPTION).size());
        System.out.println("Cleansing Centers: " + centersEnumMap.get(TypeOfActivity.CLEANSING).size());


        animalsEnumMap.get(TypeOfActivity.ADOPTION).sort(Comparator.comparing(Animal::getName));
        System.out.println("Adopted animals: " + printAnimalList(animalsEnumMap.get(TypeOfActivity.ADOPTION)));

        animalsEnumMap.get(TypeOfActivity.CLEANSING).sort(Comparator.comparing(Animal::getName));
        System.out.println("Cleansed Animal: " + printAnimalList(animalsEnumMap.get(TypeOfActivity.CLEANSING)));

        int toBeAdopted = 0, toBeCleansed = 0;
        for (Center center : centersEnumMap.get(TypeOfActivity.ADOPTION)) {
            for (Animal animal : center.getAnimals()) {
                if (animal.isCleansed()) {
                    toBeAdopted++;
                }
            }
        }
        for (Center center : centersEnumMap.get(TypeOfActivity.CLEANSING)) {
            toBeCleansed += center.getAnimals().size();
        }

        System.out.println("Animals Awaiting Adoption: " + toBeAdopted);
        System.out.println("Animals Awaiting Cleansing: " + toBeCleansed);
    }

    private String printAnimalList(final List<Animal> animals) {
        if (animals == null || animals.size() == 0) {
            return "None";
        }
        final StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < animals.size() - 1; i++) {
            stringBuilder.append(animals.get(i).getName()).append(", ");
        }
        stringBuilder.append(animals.get(animals.size() - 1).getName());
        return stringBuilder.toString();
    }

    private AdoptionCenter findAdoptionCenter(final String adoptionCenterName) {
        for (Center curAdoptionCenter : centersEnumMap.get(TypeOfActivity.ADOPTION)) {
            if (curAdoptionCenter.getName().equals(adoptionCenterName)) {
                return (AdoptionCenter) curAdoptionCenter;

            }
        }
        return null;
    }

    private CleansingCenter findCleansingCenter(final String cleansingCenterCenterName) {
        for (Center curCleansingCenter : centersEnumMap.get(TypeOfActivity.CLEANSING)) {
            if (curCleansingCenter.getName().equals(cleansingCenterCenterName)) {
                return (CleansingCenter) curCleansingCenter;
            }
        }
        return null;
    }

    private CastrationCenter findCastrationCenter(final String castrationCenterName) {
        for (Center center : centersEnumMap.get(TypeOfActivity.CASTRATION)) {
            if (center.getName().equals(castrationCenterName)) {
                return (CastrationCenter) center;
            }
        }
        return null;
    }
}
