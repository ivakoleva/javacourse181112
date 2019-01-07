package com.musala.javacourse181112.tasks.VotingApp;

public class Voters extends Vote {

    public String  voterName;
    public String voterEgn;

    public Voters (int questionNumber) {
        super(questionNumber);
        this.voterName = voterRandomNameGen();
        this.voterEgn = voterRandomEgnGen();
    }

    public String getVoterName() {
        return voterName;
    }

    public void setVoterName(String voterName) {
        this.voterName = voterName;
    }

    public String getVoterEgn() {
        return voterEgn;
    }

    public void setVoterEgn(String voterEgn) {
        this.voterEgn = voterEgn;
    }

    public void randomName() {
        this.voterName = (voterRandomNameGen());
    }

    public void randomEGN() {
        this.voterEgn = voterRandomEgnGen();
    }

    private static String voterNameGenerator() {
        StringBuilder resultName = new StringBuilder();
        char[] arrayChar = new char[7];

        arrayChar[0] = (char) ((Math.random() * ((90 - 65) + 1)) + 65);

        for (int i = 1; i < arrayChar.length; i++) {
            arrayChar[i] = (char) ((Math.random() * ((122 - 97) + 1)) + 97);
        }

        for (char anArrayChar : arrayChar) {
            resultName.append(anArrayChar);
        }
        return resultName.toString();
    }

    private static String voterRandomNameGen() {
        String result;
        result = (voterNameGenerator() + " " + voterNameGenerator());
        return result;
    }

    private static String voterRandomEgnGen() {
        StringBuilder resultEgn = new StringBuilder(" ");
        int[] egnArray = new int[10];
        for (int i = 0; i < egnArray.length; i++) {
            egnArray[i] = (int) (Math.random() * (10));
        }

        for (int i = 0; i < egnArray.length; i++) {
            int anEgnArray;
            anEgnArray = egnArray[i];
            resultEgn.append(anEgnArray);
        }
        return resultEgn.toString();
    }


}
