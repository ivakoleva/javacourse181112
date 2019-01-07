package com.musala.javacourse181112.tasks.votes_v04;

public class Voters extends Vote {
    private String randomName;
    private String randomEgn;

    public Voters(int questionNum) {
        super(questionNum);
        this.randomName = fullNameGenerator();
        this.randomEgn = egnGenerator();
    }

    public String getRandomName() {
        return randomName;
    }

    public void setRandomName(String randomName) {
        this.randomName = randomName;
    }

    public String getRandomEgn() {
        return randomEgn;
    }

    public void setRandomEgn(String randomEgn) {
        this.randomEgn = randomEgn;
    }

    public void randomName() {
        this.randomName = fullNameGenerator();
    }

    public void randomEgn() {
        this.randomEgn = egnGenerator();
    }

    private static String firstNameGenerator() {
        String resultName = " ";
        char[] lettersArray = new char[6];

        lettersArray[0] = (char) (Math.random() * ((90 - 65) + 1) + 65);

        for (int i = 1; i < lettersArray.length; i++) {
            lettersArray[i] = (char) (Math.random() * ((122 - 97) + 1) + 97);
        }
        for (char c : lettersArray) {
            resultName = (resultName + c);
        }
        return resultName;
    }

    private static String fullNameGenerator() {
        String resultName = " ";
        char[] lettersArray = new char[7];

        lettersArray[0] = (char) (Math.random() * ((90 - 65) + 1) + 65);

        for (int i = 1; i < lettersArray.length; i++) {
            lettersArray[i] = (char) (Math.random() * ((122 - 97) + 1) + 97);
        }
        for (char c : lettersArray) {
            resultName = (resultName + c);
        }
        return resultName + firstNameGenerator();
    }

    private static String egnGenerator() {
        String resultEgn = " ";
        short[] egnArray = new short[10];
        for (int i = 0; i < egnArray.length; i++) {
            egnArray[i] = (short) (Math.random() * (10));
            resultEgn += egnArray[i];
        }
        return resultEgn;
    }
}
