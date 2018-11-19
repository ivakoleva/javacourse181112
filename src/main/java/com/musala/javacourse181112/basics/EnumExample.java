package com.musala.javacourse181112.basics;

public class EnumExample {
    public static void main(String[] args) {
        Gender gender = Gender.FEMALE;
        gender = Gender.MALE;
        switch(gender){
            case MALE:
                System.out.println("Male found:" + gender);
                break;
            case FEMALE:
                System.out.println("Female found:" + gender);
                break;
        }
    }
}
