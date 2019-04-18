package com.musala.javacourse181112.FirstPartJava.tasks.pawIncProject.controller;

import com.musala.javacourse181112.FirstPartJava.tasks.pawIncProject.model.exceptions.InvalidInputException;

import java.lang.reflect.InvocationTargetException;

public enum Command {
    registerAdoptionCenter("RegisterAdoptionCenter") {
        @Override
        public void invoke(final AnimalCenterManager animalCenterManager, final String[] arguments) {
            try {
                animalCenterManager.registerAdoptionCenter(arguments[1]);

            } catch (InvocationTargetException | NoSuchMethodException | InstantiationException | IllegalAccessException e) {
                System.err.println("Error in " + this.name());
                //System.exit(1);
            } catch (InvalidInputException e) {
                System.err.println("Bad input");
            }
        }
    },
    registerCleansingCenter("RegisterCleansingCenter"){
        @Override
        public void invoke(final AnimalCenterManager animalCenterManager, final String[] arguments) {
        try {
            animalCenterManager.registerCleansingCenter(arguments[1]);

        } catch (InvocationTargetException | NoSuchMethodException | InstantiationException | IllegalAccessException e) {
            System.err.println("Error in " + this.name());
            //System.exit(1);
        }catch (InvalidInputException e) {
            System.err.println("Bad input");
        }
    }
    },
    registerCastrationCenter("RegisterCastrationCenter"){
        @Override
        public void invoke(final AnimalCenterManager animalCenterManager, String[] arguments) {
            try {
                animalCenterManager.registerCastrationCenter(arguments[1]);
            } catch (InvalidInputException e) {
                System.err.println("Bad input");
            } catch (InvocationTargetException | NoSuchMethodException | IllegalAccessException | InstantiationException e) {
                System.err.println("Error in " + this.name());
                //System.exit(1);
            }
        }
    },
    registerDog("RegisterDog") {
        @Override
        public void invoke(AnimalCenterManager animalCenterManager, String[] arguments) {
            try {
                animalCenterManager.registerDog(arguments[1],Integer.parseInt(arguments[2]),Integer.parseInt(arguments[3]),arguments[4]);
            } catch (InvalidInputException e) {
                System.err.println("Bad input");
            } catch (InvocationTargetException | NoSuchMethodException | IllegalAccessException | InstantiationException e) {
                System.err.println("Error in " + this.name());
                //System.exit(1);
            }
        }
    },
    registerCat("RegisterCat") {
        @Override
        public void invoke(AnimalCenterManager animalCenterManager, String[] arguments) {
            try {
                animalCenterManager.registerCat(arguments[1],Integer.parseInt(arguments[2]),Integer.parseInt(arguments[3]),arguments[4]);
            }catch (InvalidInputException e) {
                System.err.println("Bad input");
            }catch (InvocationTargetException | NoSuchMethodException | IllegalAccessException | InstantiationException e) {
                System.err.println("Error in " + this.name());
                //System.exit(1);
            }
        }
    },
    sendForCleansing("SendForCleansing") {
        @Override
        public void invoke(AnimalCenterManager animalCenterManager, String[] arguments) {
            try {
                animalCenterManager.sendForCleansing(arguments[1],arguments[2]);
            }catch (InvalidInputException e) {
                System.err.println("Bad input");
            }catch (Exception e){
                System.err.println("Something happened");
            }
        }
    },
    sendForCastration("SendForCastration") {
        @Override
        public void invoke(AnimalCenterManager animalCenterManager, String[] arguments) {
            try {
                animalCenterManager.sendForCastration(arguments[1],arguments[2]);
            }catch (InvalidInputException e) {
                System.err.println("Bad input");
            } catch (Exception e) {
                System.err.println("Error in " + this.name());
                //System.exit(1);
            }
        }
    },
    cleanse("Cleanse") {
        @Override
        public void invoke(AnimalCenterManager animalCenterManager, String[] arguments) {
            try {
                animalCenterManager.cleanse(arguments[1]);
            }catch (InvalidInputException e) {
                System.err.println("Bad input");
            } catch (Exception e) {
                System.err.println("Error in " + this.name());
                //System.exit(1);
            }
        }
    },
    adopt("Adopt") {
        @Override
        public void invoke(AnimalCenterManager animalCenterManager, String[] arguments) {
            try {
                animalCenterManager.adopt(arguments[1]);
            }catch (InvalidInputException e) {
                System.err.println("Bad input");
            } catch (Exception e) {
                System.err.println("Error in " + this.name());
                //System.exit(1);
            }
        }
    },
    castrate("Castrate") {
        @Override
        public void invoke(AnimalCenterManager animalCenterManager, String[] arguments) {
            try {
                animalCenterManager.castrate(arguments[1]);
            }catch (InvalidInputException e) {
                System.err.println("Bad input");
            } catch (Exception e) {
                System.err.println("Error in " + this.name());
                //System.exit(1);
            }
        }
    },
    printCastrationStatistics("CastrationStatistics") {
        @Override
        public void invoke(AnimalCenterManager animalCenterManager, String[] arguments) {
            try {
                animalCenterManager.printCastrationStatistics(arguments[1]);
            } catch (Exception e) {
                System.err.println("Error in " + this.name());
                //System.exit(1);
            }
        }
    },
    PAW_PAW_PAWAH("Paw Paw Pawah") {
        @Override
        public void invoke(final AnimalCenterManager animalCenterManager, final String[] arguments) {
            try {
                animalCenterManager.printStatistics();
                System.exit(0);
            }catch (Exception e){
                System.err.println("Error in " + this.name());
                System.exit(1);
            }
        }
    };

    private String value;

    Command(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static boolean contains(String test) {

        for (Command c : Command.values()) {
            if (c.getValue().equals(test)) {
                return true;
            }
        }

        return false;
    }

    public static Command getCommand(final String value) {
        for (Command command : Command.values()) {
            if (command.getValue().equals(value)) {
                return command;
            }
        }
        return null;
    }

    public abstract void invoke(AnimalCenterManager animalCenterManager, String[] arguments);
}
