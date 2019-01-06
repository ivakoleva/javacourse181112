package com.musala.javacourse181112.tasks.VotingApp;

public class VoteMain {
    public static void main(String[] args) {
        Voters variables1 = new Voters(true,15,randomGenerator(),randomEgnGenerator());
        String[] stringName = new String[5];
        String[] egn = new String[10];

        for (int i = 0; i < stringName.length; i++) {
            stringName[i] = (randomGenerator() + randomGenerator());
            egn[i] = randomEgnGenerator();
            System.out.println(stringName[i] + "\n" + egn[i]);
        }




    }

    private static String randomGenerator() {
        String resultName = " ";
        char[] arrayChar = new char[7];


        arrayChar[0] = (char) ((Math.random() * ((90 - 65) + 1)) + 65);

        for (int i = 1; i < arrayChar.length; i++) {
            arrayChar[i] = (char) ((Math.random() * ((122 - 97) + 1)) + 97);
        }

        for (int i = 0; i < arrayChar.length; i++) {
            resultName = (resultName + arrayChar[i]);
        }

        return resultName;
    }

    private static String randomEgnGenerator() {
        String resultEgn = " ";
        int[] charEgn = new int[10];

        for (int i = 0; i < charEgn.length; i++) {
            charEgn[i] = (int) (Math.random() * (10));
            resultEgn +=  charEgn[i];


        }
        return resultEgn;

    }
}



