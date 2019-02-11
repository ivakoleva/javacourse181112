package com.musala.javacourse181112.pawInc;

import com.musala.javacourse181112.oop.ExtendedEnumSample;

import java.util.Arrays;

public enum BasicCommands {
    YES("Yes", 1),
    NO("No", 1),
    ADOPT("Adopt", 1),
    CLEANSE("Cleanse", 1),
    SEND_FOR_CLEANSE("SendForCleansing", 1),
    REGISTER_ADOPTION_CENTER("RegisterAdoptionCenter", 2),
    REGISTER_CLEANSING_CENTER("RegisterCleansingCenter", 1),
    REGISTER_DOG("RegisterDog", 1),
    REGISTER_CAT("RegisterCat", 1),
    PRINT_STATS("PrintStats", 1),
    PAW_PAW_PAW("End", 1);

    private String label;
    private int order;

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

        /*ExtendedEnum(final String label) {
            this(label, 10);
        }*/

    BasicCommands(final String label, final int order) {
        this.label = label;
        this.order = order;
    }

    @Override
    public String toString() {
        return name() + " " + label + " " + order;
    }


    public static BasicCommands fromString(final String label) {
        return Arrays.stream(values())
                .filter(BasicCommands -> BasicCommands.getLabel().equals(label))
                .findAny()
                .orElseThrow(() -> new RuntimeException("not found"));
    }
}
