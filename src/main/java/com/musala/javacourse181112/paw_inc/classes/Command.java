package com.musala.javacourse181112.paw_inc.classes;

import com.musala.javacourse181112.paw_inc.AnimalCenterManager;

/**
 * Created by Aykut Ismailov on 5.2.2019 г.
 */
public enum Command {
    REGISTER_CLEANSING_CENTER("RegisterCleansingCenter") {
        @Override
        public void invoke(AnimalCenterManager animalCenterManager, String[] arguments) {
            assert arguments.length == 2;
            assert animalCenterManager != null;

            animalCenterManager.registerCleansingCenter(arguments[1]);
        }
    },
    REGISTER_ADOPTION_CENTER("RegisterAdoptionCenter") {
        @Override
        public void invoke(AnimalCenterManager animalCenterManager, String[] arguments) {
            assert arguments.length == 2;
            assert animalCenterManager != null;

            animalCenterManager.registerAdoptionCenter(arguments[1]);
        }
    },
    REGISTER_CASTRATION_CENTER("RegisterCastrationCenter") {
        @Override
        public void invoke(AnimalCenterManager animalCenterManager, String[] arguments) {
            assert arguments.length == 2;
            assert animalCenterManager != null;

            animalCenterManager.registerCastrationCenter(arguments[1]);
        }
    },
    REGISTER_DOG("RegisterDog") {
        @Override
        public void invoke(AnimalCenterManager animalCenterManager, String[] arguments) {
            assert arguments.length == 5;
            assert animalCenterManager != null;

            animalCenterManager.registerDog(arguments[1], Integer.valueOf(arguments[2]), Integer.valueOf(arguments[3]), arguments[4]);
        }
    },
    REGISTER_CAT("RegisterCat") {
        @Override
        public void invoke(AnimalCenterManager animalCenterManager, String[] arguments) {
            assert arguments.length == 5;
            assert animalCenterManager != null;

            animalCenterManager.registerCat(arguments[1], Integer.valueOf(arguments[2]), Integer.valueOf(arguments[3]), arguments[4]);
        }
    },
    SEND_FOR_CLEANSING("SendForCleansing") {
        @Override
        public void invoke(AnimalCenterManager animalCenterManager, String[] arguments) {
            assert arguments.length == 3;
            assert animalCenterManager != null;

            animalCenterManager.sendForCleansing(arguments[1], arguments[2]);
        }
    },
    SEND_FOR_CASTRATION("SendForCastration") {
        @Override
        public void invoke(AnimalCenterManager animalCenterManager, String[] arguments) {
            assert arguments.length == 3;
            assert animalCenterManager != null;

            animalCenterManager.sendForCastration(arguments[1], arguments[2]);
        }
    },
    CLEANSE("Cleanse") {
        @Override
        public void invoke(AnimalCenterManager animalCenterManager, String[] arguments) {
            assert arguments.length == 2;
            assert animalCenterManager != null;

            animalCenterManager.cleanse(arguments[1]);
        }
    },
    ADOPT("Adopt") {
        @Override
        public void invoke(AnimalCenterManager animalCenterManager, String[] arguments) {
            assert arguments.length == 2;
            assert animalCenterManager != null;

            animalCenterManager.adopt(arguments[1]);
        }
    },
    CASTRATE("Castrate") {
        @Override
        public void invoke(AnimalCenterManager animalCenterManager, String[] arguments) {
            assert arguments.length == 2;
            assert animalCenterManager != null;

            animalCenterManager.castrate(arguments[1]);
        }
    },
    CASTRATION_STATISTICS("CastrationStatistics") {
        @Override
        public void invoke(AnimalCenterManager animalCenterManager, String[] arguments) {
            assert arguments.length == 0;
            assert animalCenterManager != null;

            animalCenterManager.castrationStatistics();
        }
    },
    PAW_PAW_PAWAH("Paw Paw Pawah") {
        @Override
        public void invoke(AnimalCenterManager animalCenterManager, String[] arguments) {
            assert arguments.length == 0;
            assert animalCenterManager != null;

            animalCenterManager.printStatistics();
            System.exit(0);
        }
    };
    private String label;

    Command(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    public abstract void invoke(AnimalCenterManager animalCenterManager, String[] arguments);
}
