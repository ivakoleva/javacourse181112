package com.musala.javacourse181112.paw_inc.model;

import com.musala.javacourse181112.paw_inc.AnimalCenterManager;

import static com.musala.javacourse181112.paw_inc.util.Utils.validateArgumentsOfInvoke;
import static com.musala.javacourse181112.paw_inc.util.Utils.validateTypeOfArguments;

/**
 * Created by Aykut Ismailov on 5.2.2019 г.
 */
public enum Command {
    REGISTER_CLEANSING_CENTER("RegisterCleansingCenter") {
        @Override
        public void invoke(final AnimalCenterManager animalCenterManager, final String[] arguments) {
            if (validateArgumentsOfInvoke(animalCenterManager, arguments, 2) &&
                    validateTypeOfArguments(arguments, new String[]{"word", "word"})) {

                animalCenterManager.registerCleansingCenter(arguments[1]);
            } else {
                System.err.println("Couldn\'t register cleansing center");
                System.exit(1);
            }
        }
    },
    REGISTER_ADOPTION_CENTER("RegisterAdoptionCenter") {
        @Override
        public void invoke(final AnimalCenterManager animalCenterManager, final String[] arguments) {
            if (validateArgumentsOfInvoke(animalCenterManager, arguments, 2) &&
                    validateTypeOfArguments(arguments, new String[]{"word", "word"})) {

                animalCenterManager.registerAdoptionCenter(arguments[1]);
            } else {
                System.err.println("Couldn\'t register adoption center");
                System.exit(1);
            }
        }
    },
    REGISTER_CASTRATION_CENTER("RegisterCastrationCenter") {
        @Override
        public void invoke(final AnimalCenterManager animalCenterManager, final String[] arguments) {
            if (validateArgumentsOfInvoke(animalCenterManager, arguments, 2) &&
                    validateTypeOfArguments(arguments, new String[]{"word", "word"})) {

                animalCenterManager.registerCastrationCenter(arguments[1]);
            } else {
                System.err.println("Couldn\'t register castration center");
                System.exit(1);
            }
        }
    },
    REGISTER_DOG("RegisterDog") {
        @Override
        public void invoke(final AnimalCenterManager animalCenterManager, final String[] arguments) {
            if (validateArgumentsOfInvoke(animalCenterManager, arguments, 5) &&
                    validateTypeOfArguments(arguments, new String[]{"word", "word", "integer", "integer", "word"})) {

                animalCenterManager.registerDog(arguments[1], Integer.valueOf(arguments[2]), Integer.valueOf(arguments[3]), arguments[4]);
            } else {
                System.err.println("Couldn\'t register dog");
                System.exit(1);
            }
        }
    },
    REGISTER_CAT("RegisterCat") {
        @Override
        public void invoke(final AnimalCenterManager animalCenterManager, final String[] arguments) {
            if (validateArgumentsOfInvoke(animalCenterManager, arguments, 5) &&
                    validateTypeOfArguments(arguments, new String[]{"word", "word", "integer", "integer", "word"})) {

                animalCenterManager.registerCat(arguments[1], Integer.valueOf(arguments[2]), Integer.valueOf(arguments[3]), arguments[4]);
            } else {
                System.err.println("Couldn\'t register cat");
                System.exit(1);
            }
        }
    },
    SEND_FOR_CLEANSING("SendForCleansing") {
        @Override
        public void invoke(final AnimalCenterManager animalCenterManager, final String[] arguments) {
            if (validateArgumentsOfInvoke(animalCenterManager, arguments, 3) &&
                    validateTypeOfArguments(arguments, new String[]{"word", "word", "word"})) {

                animalCenterManager.sendForCleansing(arguments[1], arguments[2]);
            } else {
                System.err.println("Couldn\'t send for cleansing");
                System.exit(1);
            }
        }
    },
    SEND_FOR_CASTRATION("SendForCastration") {
        @Override
        public void invoke(final AnimalCenterManager animalCenterManager, final String[] arguments) {
            if (validateArgumentsOfInvoke(animalCenterManager, arguments, 3) &&
                    validateTypeOfArguments(arguments, new String[]{"word", "word", "word"})) {

                animalCenterManager.sendForCastration(arguments[1], arguments[2]);
            } else {
                System.err.println("Couldn\'t send for castration");
                System.exit(1);
            }
        }
    },
    CLEANSE("Cleanse") {
        @Override
        public void invoke(final AnimalCenterManager animalCenterManager, final String[] arguments) {
            if (validateArgumentsOfInvoke(animalCenterManager, arguments, 2) &&
                    validateTypeOfArguments(arguments, new String[]{"word", "word"})) {

                animalCenterManager.cleanse(arguments[1]);
            } else {
                System.err.println("Couldn\'t cleanse");
                System.exit(1);
            }
        }
    },
    ADOPT("Adopt") {
        @Override
        public void invoke(final AnimalCenterManager animalCenterManager, final String[] arguments) {
            if (validateArgumentsOfInvoke(animalCenterManager, arguments, 2)) {

                animalCenterManager.adopt(arguments[1]);
            } else {
                System.err.println("Couldn\'t adopt");
                System.exit(1);
            }
        }
    },
    CASTRATE("Castrate") {
        @Override
        public void invoke(final AnimalCenterManager animalCenterManager, final String[] arguments) {
            if (validateArgumentsOfInvoke(animalCenterManager, arguments, 2) &&
                    validateTypeOfArguments(arguments, new String[]{"word", "word"})) {

                animalCenterManager.castrate(arguments[1]);
            } else {
                System.err.println("Couldn't castrate");
                System.exit(1);
            }
        }
    },
    CASTRATION_STATISTICS("CastrationStatistics") {
        @Override
        public void invoke(final AnimalCenterManager animalCenterManager, final String[] arguments) {
            if (validateArgumentsOfInvoke(animalCenterManager, arguments, 1)) {

                animalCenterManager.castrationStatistics();
            } else {
                System.err.println("Something went wrong with castration statistics");
                System.exit(1);
            }
        }
    },
    PAW_PAW_PAWAH("Paw Paw Pawah") {
        @Override
        public void invoke(final AnimalCenterManager animalCenterManager, final String[] arguments) {
            if (validateArgumentsOfInvoke(animalCenterManager, arguments, 1)) {

                animalCenterManager.printStatistics();
                //System.err.println((((double)Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory())/1024)/1024);
                //System.err.println(Duration.between(PawIncorporated.start, Instant.now()).toMillis());
                System.exit(0);
            } else {
                System.err.println("Something went wrong");
                System.exit(1);
            }
        }
    };


    private final String label;

    Command(final String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    public abstract void invoke(AnimalCenterManager animalCenterManager, String[] arguments);

}
