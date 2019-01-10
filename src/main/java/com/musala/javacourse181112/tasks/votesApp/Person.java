package com.musala.javacourse181112.tasks.votesApp;

public class Person extends Vote {
    private String randomName;
    private String randomEGN;

    public Person(int questionNumber) {
        super(questionNumber);
        this.randomName = randomFullNameGenerator();
        this.randomEGN = randomEGNGenerator();
    }

    public String getRandomName() {
        return randomName;
    }

    public void setRandomName(String randomName) {
        this.randomName = randomName;
    }

    public String getRandomEGN() {
        return randomEGN;
    }

    public void setRandomEGN(String randomEGN) {
        this.randomEGN = randomEGN;
    }

    public void randomName() {
        this.randomName = (randomFullNameGenerator());
    }

    public void randomEGN() {
        this.randomEGN = randomEGNGenerator();
    }

    private static String randomNameGenerator() {
        String result = " ";
        char[] arrayChar = new char[7];

        arrayChar[0] = (char) ((Math.random() * ((90 - 65) + 1)) + 65);

        for (int i = 1; i < arrayChar.length; i++) {
            arrayChar[i] = (char) ((Math.random() * ((122 - 97) + 1)) + 97);
        }

        for (int i = 0; i < arrayChar.length; i++) {
            result = (result + arrayChar[i]);
        }
        return result;
    }

    private static String randomFullNameGenerator() {
        return randomNameGenerator() + randomNameGenerator();
    }

    private static String randomEGNGenerator() {
        String result = " ";
        int[] egnArray = new int[10];
        for (int i = 0; i < egnArray.length; i++) {
            egnArray[i] = (int) (Math.random() * (10));
        }

        for (int i = 0; i < egnArray.length; i++) {
            result = result + egnArray[i];
        }
        return result;
    }

}