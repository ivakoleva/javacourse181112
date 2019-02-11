package com.musala.javacourse181112.tasks.paw_Inc;

public enum Command {

    REGISTER_CLEANSING_CENTER("RegisterCleansingCenter") {
        @Override
        public void invoke(final AnimalCenterManager animalCenterManager, final String[] arguments) {
            if (validateArgumentsOfInvoke(animalCenterManager, arguments, 2) &&
                    validateArgumentsOfInvokedMethod(arguments, TypeOfValidation.IS_ASCII, TypeOfValidation.IS_ASCII)) {

                animalCenterManager.registerCleansingCenter(arguments[1]);
                System.gc();
            } else {
                System.err.println("Couldn't register cleansing center");
                System.exit(1);
            }
        }
    },
    REGISTER_ADOPTION_CENTER("RegisterAdoptionCenter") {
        @Override
        public void invoke(final AnimalCenterManager animalCenterManager, final String[] arguments) {
            if (validateArgumentsOfInvoke(animalCenterManager, arguments, 2) &&
                    validateArgumentsOfInvokedMethod(arguments, TypeOfValidation.IS_ASCII, TypeOfValidation.IS_ASCII)) {

                animalCenterManager.registerAdoptionCenter(arguments[1]);
                System.gc();
            } else {
                System.err.println("Couldn't register adoption center");
                System.exit(1);
            }
        }
    },
    REGISTER_CASTRATION_CENTER("RegisterCastrationCenter") {
        @Override
        public void invoke(final AnimalCenterManager animalCenterManager, final String[] arguments) {
            if (validateArgumentsOfInvoke(animalCenterManager, arguments, 2) &&
                    validateArgumentsOfInvokedMethod(arguments, TypeOfValidation.IS_ASCII, TypeOfValidation.IS_ASCII)) {

                animalCenterManager.registerCastrationCenter(arguments[1]);
                System.gc();
            } else {
                System.err.println("Couldn't register castration center");
                System.exit(1);
            }
        }
    },
    REGISTER_DOG("RegisterDog") {
        @Override
        public void invoke(final AnimalCenterManager animalCenterManager, final String[] arguments) {
            if (validateArgumentsOfInvoke(animalCenterManager, arguments, 5) &&
                    validateArgumentsOfInvokedMethod(arguments, TypeOfValidation.IS_ASCII, TypeOfValidation.IS_ASCII, TypeOfValidation.IS_INTEGER, TypeOfValidation.IS_INTEGER, TypeOfValidation.IS_ASCII)) {

                animalCenterManager.registerDog(arguments[1], Integer.valueOf(arguments[2]), Integer.valueOf(arguments[3]), arguments[4]);
                System.gc();
            } else {
                System.err.println("Couldn't register dog");
                System.exit(1);
            }
        }
    },
    REGISTER_CAT("RegisterCat") {
        @Override
        public void invoke(final AnimalCenterManager animalCenterManager, final String[] arguments) {
            if (validateArgumentsOfInvoke(animalCenterManager, arguments, 5) &&
                    validateArgumentsOfInvokedMethod(arguments, TypeOfValidation.IS_ASCII, TypeOfValidation.IS_ASCII, TypeOfValidation.IS_INTEGER, TypeOfValidation.IS_INTEGER, TypeOfValidation.IS_ASCII)) {

                animalCenterManager.registerCat(arguments[1], Integer.valueOf(arguments[2]), Integer.valueOf(arguments[3]), arguments[4]);
                System.gc();
            } else {
                System.err.println("Couldn't register cat");
                System.exit(1);
            }
        }
    },
    SEND_FOR_CLEANSING("SendForCleansing") {
        @Override
        public void invoke(final AnimalCenterManager animalCenterManager, final String[] arguments) {
            if (validateArgumentsOfInvoke(animalCenterManager, arguments, 3) &&
                    validateArgumentsOfInvokedMethod(arguments, TypeOfValidation.IS_ASCII, TypeOfValidation.IS_ASCII, TypeOfValidation.IS_ASCII)) {

                animalCenterManager.sendForCleansing(arguments[1], arguments[2]);
                System.gc();
            } else {
                System.err.println("Couldn't send for cleansing");
                System.exit(1);
            }
        }
    },
    SEND_FOR_CASTRATION("SendForCastration") {
        @Override
        public void invoke(final AnimalCenterManager animalCenterManager, final String[] arguments) {
            if (validateArgumentsOfInvoke(animalCenterManager, arguments, 3) &&
                    validateArgumentsOfInvokedMethod(arguments, TypeOfValidation.IS_ASCII, TypeOfValidation.IS_ASCII, TypeOfValidation.IS_ASCII)) {

                animalCenterManager.sendForCastration(arguments[1], arguments[2]);
                System.gc();
            } else {
                System.err.println("Couldn't send for castration");
                System.exit(1);
            }
        }
    },
    CLEANSE("Cleanse") {
        @Override
        public void invoke(final AnimalCenterManager animalCenterManager, final String[] arguments) {
            if (validateArgumentsOfInvoke(animalCenterManager, arguments, 2) &&
                    validateArgumentsOfInvokedMethod(arguments, TypeOfValidation.IS_ASCII, TypeOfValidation.IS_ASCII)) {

                animalCenterManager.cleanse(arguments[1]);
                System.gc();
            } else {
                System.err.println("Couldn't cleanse");
                System.exit(1);
            }
        }
    },
    ADOPT("Adopt") {
        @Override
        public void invoke(final AnimalCenterManager animalCenterManager, final String[] arguments) {
            if (validateArgumentsOfInvoke(animalCenterManager, arguments, 2) &&
                    validateArgumentsOfInvokedMethod(arguments, TypeOfValidation.IS_ASCII, TypeOfValidation.IS_ASCII)) {

                animalCenterManager.adopt(arguments[1]);
                System.gc();
            } else {
                System.err.println("Couldn't adopt");
                System.exit(1);
            }
        }
    },
    CASTRATE("Castrate") {
        @Override
        public void invoke(final AnimalCenterManager animalCenterManager, final String[] arguments) {
            if (validateArgumentsOfInvoke(animalCenterManager, arguments, 2) &&
                    validateArgumentsOfInvokedMethod(arguments, TypeOfValidation.IS_ASCII, TypeOfValidation.IS_ASCII)) {

                animalCenterManager.castrate(arguments[1]);
                System.gc();
            } else {
                System.err.println("Couldn't castrate");
                System.exit(1);
            }
        }
    },
    CASTRATION_STATISTICS("CastrationStatistics") {
        @Override
        public void invoke(final AnimalCenterManager animalCenterManager, final String[] arguments) {
            if (validateArgumentsOfInvoke(animalCenterManager, arguments, 1) &&
                    validateArgumentsOfInvokedMethod(arguments, TypeOfValidation.IS_ASCII)) {

                animalCenterManager.castrationStatistics();
                System.gc();
            } else {
                System.err.println("Something went wrong with castration statistics");
                System.exit(1);
            }
        }
    },
    PAW_PAW_PAWAH("Paw Paw Pawah") {
        @Override
        public void invoke(final AnimalCenterManager animalCenterManager, final String[] arguments) {
            if (validateArgumentsOfInvoke(animalCenterManager, arguments, 1) &&
                    validateArgumentsOfInvokedMethod(arguments, TypeOfValidation.IS_ASCII)) {

                animalCenterManager.printStatistics();
                //System.err.println(((double) Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / (1024 * 1024) + " MB");
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


    private static boolean validateArgumentsOfInvoke(final AnimalCenterManager animalCenterManager, final String[] arguments, int n) {
        return animalCenterManager != null && arguments != null && arguments.length == n;
    }

    private static boolean validateArgumentsOfInvokedMethod(final String[] arguments, final TypeOfValidation... typeOfValidations) {
        if (arguments.length != typeOfValidations.length) {
            return false;
        }
        boolean result = true;

        for (int i = 0; i < arguments.length; i++) {
            TypeOfValidation currentTypeOfValidation = TypeOfValidation.findTypeOrPredicate(typeOfValidations[i]);
            if (currentTypeOfValidation != null) {
                result = currentTypeOfValidation.test(arguments[i]);
            } else {
                return false;
            }
        }

        return result;
    }
}
