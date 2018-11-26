package com.musala.javacourse181112.MyStuff;

public class ChromosomesEnum {
    public static void main(final String[] args) {
        Gender gender = Gender.FEMALE; //promenliva . ime . stoinost
       // gender = Gender.MALE;
        String Chrome = "";

        switch (gender) {
            case FEMALE:
                System.out.println("Gender found: " + gender);
                 Chrome+= "x";
            case MALE:

                Chrome += "x";
                if(Chrome.length() == 2) {

                    break;
                }
            default:
                Chrome += "y";
        }
        System.out.println("Chromosomes for gender: " + gender);
        System.out.println(Chrome);
    }
}
