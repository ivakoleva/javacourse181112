/*
package com.musala.javacourse181112.tasks;

import com.musala.javacourse181112.pawinc.AnimalCenterManager;


 * Created by Kristina Stoyanova on 6.2.2019 г.


public enum CommandsValues {
    REGISTER_ADOPTION_CENTER("RegisterAdoptionCenter"){
        @Override
        public void makeItRainCatsAndDogs(AnimalCenterManager animalCenterManager, String[] commands) {
            animalCenterManager.registerAdoptionCenter(commands[1]);
        }
    },
    REGISTER_CLEANSING_CENTER("RegisterCleansingCenter"){
        @Override
        public void makeItRainCatsAndDogs(AnimalCenterManager animalCenterManager, String[] commands) {
            animalCenterManager.registerCleansingCenter(commands[1]);
        }
    },
    REGISTER_DOG("RegisterDog") {
        @Override
        public void makeItRainCatsAndDogs(AnimalCenterManager animalCenterManager, String[] commands) {
            animalCenterManager.registerDog(commands[1],
                    Integer.parseInt(commands[2]), Integer.parseInt(commands[3]), commands[4]);
        }
    },
    REGISTER_CAT("RegisterCat"){
        @Override
        public void makeItRainCatsAndDogs(AnimalCenterManager animalCenterManager, String []commands) {
            animalCenterManager.registerCat(commands[1],
                    Integer.parseInt(commands[2]),Integer.parseInt(commands[3]),commands[4]);
        }
    },
    SEND_FOR_CLEANSING("SendForCleansing"){
        @Override
        public void makeItRainCatsAndDogs(AnimalCenterManager animalCenterManager, String[] commands) {
            animalCenterManager.sendForCleansing(commands[1],commands[2]);
        }
    },
    CLEANSE("Cleanse"){
        @Override
        public void makeItRainCatsAndDogs(AnimalCenterManager animalCenterManager, String[] commands) {
            animalCenterManager.cleanse(commands[1]);
        }
    },
    ADOPT("Adopt"){
        @Override
        public void makeItRainCatsAndDogs(AnimalCenterManager animalCenterManager, String[] commands) {
            animalCenterManager.adopt(commands[1]);
        }
    },
    PAWPAWPAWAH("Paw Paw Pawah"){
        @Override
        public void makeItRainCatsAndDogs(AnimalCenterManager animalCenterManager, String[] commands) {
            animalCenterManager.printStatics();
        }
    };

    String label;
    CommandsValues(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    public abstract void makeItRainCatsAndDogs(AnimalCenterManager animalCenterManager, String []commands);
}
*/
