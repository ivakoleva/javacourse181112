package com.musala.javacourse181112.FirstPartJava.oop;

import java.util.Arrays;

/**
 * Created by Iva Koleva on 15.01.2019
 */
public class ExtendedEnumSample {
    private enum ExtendedEnum {
        MALE("male", 1),
        FEMALE("female", 1);

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

        ExtendedEnum(final String label, final int order) {
            this.label = label;
            this.order = order;
        }

        @Override
        public String toString() {
            return name() + " " + label + " " + order;
        }


        public static ExtendedEnum fromString(final String label) {
            return Arrays.stream(values())
                    .filter(extendedEnumSample -> extendedEnumSample.getLabel().equals(label))
                    .findAny()
                    .orElseGet(null);
        }
    }

    public static void main(final String[] args) {
        /*System.out.println(ExtendedEnumSample.FEMALE.name());

        ExtendedEnumSample.MALE.getLabel();
        ExtendedEnumSample.FEMALE.getLabel();*/

        //Arrays.stream(ExtendedEnumSample.values()).forEach(System.out::println);
        try {
            final ExtendedEnum extendedEnum = ExtendedEnum.fromString("asd");
        } catch (NullPointerException e) {
            System.out.println("Cannot find such enum value");
        }

        // static method
        System.out.println(ExtendedEnum.fromString("female"));
        // non-static method
        System.out.println(ExtendedEnum.MALE.getLabel());
    }
}
