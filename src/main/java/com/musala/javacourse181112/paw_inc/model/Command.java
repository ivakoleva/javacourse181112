package com.musala.javacourse181112.paw_inc.model;

import com.musala.javacourse181112.paw_inc.AnimalCenterManager;

import static com.musala.javacourse181112.paw_inc.Utils.isInteger;
import static com.musala.javacourse181112.paw_inc.Utils.isValidInteger;

/**
 * Created by Aykut Ismailov on 5.2.2019 г.
 */
public enum Command {
    REGISTER_CLEANSING_CENTER("RegisterCleansingCenter") {
        @Override
        public void invoke(final AnimalCenterManager animalCenterManager, final String[] arguments) {
            assert arguments.length == 2;
            assert animalCenterManager != null;

            animalCenterManager.registerCleansingCenter(arguments[1]);
        }
    },
    REGISTER_ADOPTION_CENTER("RegisterAdoptionCenter") {
        @Override
        public void invoke(final AnimalCenterManager animalCenterManager, final String[] arguments) {
            assert arguments.length == 2;
            assert animalCenterManager != null;

            animalCenterManager.registerAdoptionCenter(arguments[1]);
        }
    },
    REGISTER_CASTRATION_CENTER("RegisterCastrationCenter") {
        @Override
        public void invoke(final AnimalCenterManager animalCenterManager, final String[] arguments) {
            assert arguments.length == 2;
            assert animalCenterManager != null;

            animalCenterManager.registerCastrationCenter(arguments[1]);
        }
    },
    REGISTER_DOG("RegisterDog") {
        @Override
        public void invoke(final AnimalCenterManager animalCenterManager, final String[] arguments) {
            assert arguments.length == 5;
            assert animalCenterManager != null;
            validate(arguments);

            animalCenterManager.registerDog(arguments[1], Integer.valueOf(arguments[2]), Integer.valueOf(arguments[3]), arguments[4]);
        }
    },
    REGISTER_CAT("RegisterCat") {
        @Override
        public void invoke(final AnimalCenterManager animalCenterManager, final String[] arguments) {
            assert arguments.length == 5;
            assert animalCenterManager != null;
            validate(arguments);

            animalCenterManager.registerCat(arguments[1], Integer.valueOf(arguments[2]), Integer.valueOf(arguments[3]), arguments[4]);
        }
    },
    SEND_FOR_CLEANSING("SendForCleansing") {
        @Override
        public void invoke(final AnimalCenterManager animalCenterManager, final String[] arguments) {
            assert arguments.length == 3;
            assert animalCenterManager != null;

            animalCenterManager.sendForCleansing(arguments[1], arguments[2]);
        }
    },
    SEND_FOR_CASTRATION("SendForCastration") {
        @Override
        public void invoke(final AnimalCenterManager animalCenterManager, final String[] arguments) {
            assert arguments.length == 3;
            assert animalCenterManager != null;

            animalCenterManager.sendForCastration(arguments[1], arguments[2]);
        }
    },
    CLEANSE("Cleanse") {
        @Override
        public void invoke(final AnimalCenterManager animalCenterManager, final String[] arguments) {
            assert arguments.length == 2;
            assert animalCenterManager != null;

            animalCenterManager.cleanse(arguments[1]);
        }
    },
    ADOPT("Adopt") {
        @Override
        public void invoke(final AnimalCenterManager animalCenterManager, final String[] arguments) {
            assert arguments.length == 2;
            assert animalCenterManager != null;

            animalCenterManager.adopt(arguments[1]);
        }
    },
    CASTRATE("Castrate") {
        @Override
        public void invoke(final AnimalCenterManager animalCenterManager, final String[] arguments) {
            assert arguments.length == 2;
            assert animalCenterManager != null;

            animalCenterManager.castrate(arguments[1]);
        }
    },
    CASTRATION_STATISTICS("CastrationStatistics") {
        @Override
        public void invoke(final AnimalCenterManager animalCenterManager, final String[] arguments) {
            assert arguments.length == 0;
            assert animalCenterManager != null;

            animalCenterManager.castrationStatistics();
        }
    },
    PAW_PAW_PAWAH("Paw Paw Pawah") {
        @Override
        public void invoke(final AnimalCenterManager animalCenterManager, final String[] arguments) {
            assert arguments.length == 0;
            assert animalCenterManager != null;

            animalCenterManager.printStatistics();
            System.exit(0);
        }
    };

    private static void validate(String[] arguments) {
        assert isInteger.test(arguments[2]);
        assert isInteger.test(arguments[3]);
        assert isValidInteger.test(Integer.parseInt(arguments[2]));
        assert isValidInteger.test(Integer.parseInt(arguments[3]));
    }

    private final String label;

    Command(final String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    public abstract void invoke(AnimalCenterManager animalCenterManager, String[] arguments);

}
