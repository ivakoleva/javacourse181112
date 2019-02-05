package Paw_Inc;

import Paw_Inc.Classes.Animals.Animal;
import Paw_Inc.Classes.Animals.Cat;
import Paw_Inc.Classes.Animals.Dog;
import Paw_Inc.Classes.Centers.AdoptionCenter;
import Paw_Inc.Classes.Centers.Center;
import Paw_Inc.Classes.Centers.CleansingCenter;
import Paw_Inc.Classes.Centers.TypeOfCenter;

import java.util.*;

/**
 * Created by Aykut Ismailov on 4.2.2019 г.
 */
public class AnimalCenterManager {
    private final EnumMap<TypeOfCenter, List<Center>> centersEnumMap = new EnumMap<>(TypeOfCenter.class);
    private final List<Animal> adoptedAnimals;
    private final List<Animal> cleansedAnimals;

    public AnimalCenterManager() {
        Arrays.stream(TypeOfCenter.values()).forEach(center -> centersEnumMap.put(center, new ArrayList<>()));
        adoptedAnimals = new ArrayList<>();
        cleansedAnimals = new ArrayList<>();
    }

    public void registerCleansingCenter(String name) {
        CleansingCenter cleansingCenter = new CleansingCenter();
        cleansingCenter.setName(name);
        cleansingCenter.setAnimals(new ArrayList<>());
        centersEnumMap.get(TypeOfCenter.CLEANSING).add(cleansingCenter);
    }

    public void registerAdoptionCenter(String name) {
        AdoptionCenter adoptionCenter = new AdoptionCenter();
        adoptionCenter.setName(name);
        adoptionCenter.setAnimals(new ArrayList<>());
        centersEnumMap.get(TypeOfCenter.ADOPTION).add(adoptionCenter);
    }

    public void registerDog(String name, int age, int learnedCommands, String adoptionCenterName) {
        final AdoptionCenter adoptionCenter = findAdoptionCenter(adoptionCenterName);

        if (adoptionCenter != null) {
            final Dog dog = new Dog(name, age, learnedCommands, adoptionCenter);
            adoptionCenter.getAnimals().add(dog);
        } else {
            System.err.println("ADOPTION Center not found!");
            System.exit(1);
        }

    }

    public void registerCat(String name, int age, int intelligenceCoefficient, String adoptionCenterName) {
        AdoptionCenter adoptionCenter = findAdoptionCenter(adoptionCenterName);

        if (adoptionCenter != null) {
            final Cat cat = new Cat(name, age, intelligenceCoefficient, adoptionCenter);
            adoptionCenter.getAnimals().add(cat);
        } else {
            System.err.println("ADOPTION Center not found!");
            System.exit(1);
        }
    }

    public void sendForCleansing(String adoptionCenterName, String cleansingCenterName) {
        AdoptionCenter adoptionCenter = findAdoptionCenter(adoptionCenterName);
        CleansingCenter cleansingCenter = findCleansingCenter(cleansingCenterName);

        if (adoptionCenter != null && cleansingCenter != null) {
            adoptionCenter.sendForCleansing(cleansingCenter);
        } else {
            System.err.println("Center not found!");
            System.exit(1);
        }
    }

    public void cleanse(String cleansingCenterName) {
        CleansingCenter cleansingCenter = findCleansingCenter(cleansingCenterName);

        if (cleansingCenter != null) {
            cleansedAnimals.addAll(cleansingCenter.cleanseAnimals());
        } else {
            System.err.println("CLEANSING Center not found!");
            System.exit(1);
        }
    }

    public void adopt(String adoptionCenterName) {
        AdoptionCenter adoptionCenter = findAdoptionCenter(adoptionCenterName);

        if (adoptionCenter != null) {
            adoptedAnimals.addAll(adoptionCenter.adopt());
        } else {
            System.err.println("ADOPTION Center not found!");
            System.exit(1);
        }
    }

    public void printStatistics() {
        System.out.println("Paw Incorporation Regular Statistics");

        System.out.println("ADOPTION TypeOfCenter: " + centersEnumMap.get(TypeOfCenter.ADOPTION).size());
        System.out.println("CLEANSING TypeOfCenter: " + centersEnumMap.get(TypeOfCenter.CLEANSING).size());

        adoptedAnimals.sort(Comparator.comparing(Animal::getName));
        System.out.println("Adopted Animals: " + printAnimalList(adoptedAnimals));

        cleansedAnimals.sort(Comparator.comparing(Animal::getName));
        System.out.println("Cleansed Animal: " + printAnimalList(cleansedAnimals));

        int toBeAdopted = 0, toBeCleansed = 0;
        for (Center center : centersEnumMap.get(TypeOfCenter.ADOPTION)) {
            for (Animal animal : center.getAnimals()) {
                if (animal.isCleansed()) {
                    toBeAdopted++;
                }
            }
        }
        for (Center center : centersEnumMap.get(TypeOfCenter.CLEANSING)) {
            toBeCleansed += center.getAnimals().size();
        }

        System.out.println("Animals Awaiting ADOPTION: " + toBeAdopted);
        System.out.println("Animals Awaiting CLEANSING: " + toBeCleansed);


    }

    private String printAnimalList(List<Animal> animals) {
        if (animals.size() == 0) {
            return "None";
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < animals.size() - 1; i++) {
                stringBuilder.append(animals.get(i).getName());
                stringBuilder.append(", ");
            }
            stringBuilder.append(animals.get(animals.size() - 1).getName());
            return stringBuilder.toString();
        }
    }

    private AdoptionCenter findAdoptionCenter(String adoptionCenterName) {
        AdoptionCenter adoptionCenter = null;
        for (Center curAdoptionCenter : centersEnumMap.get(TypeOfCenter.ADOPTION)) {
            if (curAdoptionCenter.getName().equals(adoptionCenterName)) {
                adoptionCenter = (AdoptionCenter) curAdoptionCenter;
                break;
            }
        }
        return adoptionCenter;
    }

    private CleansingCenter findCleansingCenter(String cleansingCenterCenterName) {
        CleansingCenter cleansingCenter = null;

        for (Center curAdoptionCenter : centersEnumMap.get(TypeOfCenter.CLEANSING)) {
            if (curAdoptionCenter.getName().equals(cleansingCenterCenterName)) {
                cleansingCenter = (CleansingCenter) curAdoptionCenter;
                break;
            }
        }
        return cleansingCenter;
    }

}
