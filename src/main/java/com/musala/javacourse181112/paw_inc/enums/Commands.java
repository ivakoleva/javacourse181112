package com.musala.javacourse181112.paw_inc.enums;

import com.musala.javacourse181112.paw_inc.AnimalCenterManager;
import com.musala.javacourse181112.paw_inc.ValidationUtils;

public enum Commands {
    REGISTER_CLEANSING_CENTER("RegisterCleansingCenter") {
        @Override
        public void runCommand(String[] inputCommands) {

            AnimalCenterManager
                    .getInstance()
                    .registerCleansingCenter(inputCommands[1]);
        }
    },
    REGISTER_ADOPTION_CENTER("RegisterAdoptionCenter") {
        @Override
        public void runCommand(String[] inputCommands) {
            AnimalCenterManager
                    .getInstance()
                    .registerAdoptionCenter(inputCommands[1]);
        }
    },
    REGISTER_CASTRATION_CENTER("RegisterCastrationCenter"){
        @Override
        public void runCommand(String[] inputCommands) {
AnimalCenterManager.getInstance().registerCastrationCenter(inputCommands[1]);
        }
    },

    REGISTER_DOG("RegisterDog") {
        @Override
        public void runCommand(String[] inputCommands) {
            validateInteger(inputCommands);

            AnimalCenterManager
                    .getInstance()
                    .registerDog(inputCommands[1]
                            ,Integer.parseInt(inputCommands[2])
                            ,Integer.parseInt(inputCommands[3])
                            ,inputCommands[4]);
        }
    },
    REGISTER_CAT("RegisterCat") {

        @Override
        public void runCommand(String[] inputCommands) {
            validateInteger(inputCommands);
            AnimalCenterManager
                    .getInstance()
                    .registerCat(inputCommands[1]
                            ,Integer.parseInt(inputCommands[2])
                            ,Integer.parseInt(inputCommands[3])
                            ,inputCommands[4]);
        }
    },
    SEND_FOR_CLEANSING("SendForCleansing") {
        @Override
        public void runCommand(String[] inputCommands) {
            AnimalCenterManager
                    .getInstance()
                    .sendForCleansing(inputCommands[1],inputCommands[2]);
        }
    },
    SEND_FOR_CASTRATION("SendForCastration"){
        @Override
        public void runCommand(String[] inputCommands) {
            AnimalCenterManager.getInstance().sendForCastration(inputCommands[1],inputCommands[2]);
        }
    },
    CLEANSE("Cleanse") {
        @Override
        public void runCommand(String[] inputCommands) {
            AnimalCenterManager
                    .getInstance()
                    .cleanse(inputCommands[1]);
        }
    },
    ADOPT("Adopt") {
        @Override
        public void runCommand(String[] inputCommands) {
            AnimalCenterManager
                    .getInstance()
                    .adopt(inputCommands[1]);
        }
    },
    CASTRATE("Castrate"){
        @Override
        public void runCommand(String[] inputCommands) {
            AnimalCenterManager.getInstance().castrate(inputCommands[1]);
        }
    },
    CASTRATION_STATISTICS("CastrationStatistics"){
        @Override
        public void runCommand(String[] inputCommands) {
AnimalCenterManager.getInstance().castrationStatistics();
        }
    },
    PAW_PAW_PAWAH("Paw Paw Pawah") {
        @Override
        public void runCommand(String[] inputCommands) {
            AnimalCenterManager
                    .getInstance()
                    .printStatistics();
        }
    };

    private static void validateInteger(String[] inputCommands) {
        if(!ValidationUtils.isPositiveInt.test(Integer.parseInt(inputCommands[2]))
                ||
                !ValidationUtils.isPositiveInt.test(Integer.parseInt(inputCommands[3])))
        {
            System.out.println("Number is negative");
            System.exit(1);
        }
    }

    String label;

    Commands(String label) {
        this.label = label;
    }

    public java.lang.String getLabel() {
        return label;
    }

    public abstract void runCommand(String[] inputCommands);

}
