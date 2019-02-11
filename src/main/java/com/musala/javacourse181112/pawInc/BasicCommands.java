package com.musala.javacourse181112.pawInc;

import com.musala.javacourse181112.oop.ExtendedEnumSample;

import java.util.Arrays;

public enum BasicCommands {
    YES("Yes"),
    NO("No"),
    ADOPT("Adopt"),
    CLEANSE("Cleanse"),
    SEND_FOR_CLEANSE("SendForCleansing"),
    REGISTER_ADOPTION_CENTER("RegisterAdoptionCenter"),
    REGISTER_CLEANSING_CENTER("RegisterCleansingCenter"),
    REGISTER_DOG("RegisterDog"),
    REGISTER_CAT("RegisterCat"),
    PRINT_STATS("PrintStats"),
    PAW_PAW_PAW("Paw_Paw_Paw");

    private  String label;

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

        /*ExtendedEnum(final String label) {
            this(label, 10);
        }*/

    BasicCommands(final String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return name() + " " + label + " " ;
    }


    public static BasicCommands fromString(final String label) {
        return Arrays.stream(values())
                .filter(BasicCommands -> BasicCommands.getLabel().equals(label))
                .findAny()
                .orElseThrow(() -> new RuntimeException("not found"));
    }
}
