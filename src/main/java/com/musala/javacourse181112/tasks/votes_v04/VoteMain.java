package com.musala.javacourse181112.tasks.votes_v04;

/* Votes v0.4 - introduce OOP concepts
 *** subpackage, data model
 *** entry point class, with main method
 *** etc.*/
public class VoteMain {
    public static void main(String[] args) {
        Voters variables = new Voters(true, 15, nameGenerator(), egnGenerator());
        String[] names = new String[10];
        String[] egn = new String[10];
        for (int i = 0; i < names.length; i++) {
            names[i] = (nameGenerator() + nameGenerator());
            egn[i] = egnGenerator();
            System.out.println(names[i] + "\n" + egn[i]);
        }
    }

    private static String nameGenerator() {
        String resultName = " ";
        char[] letters = new char[6];

        letters[0] = (char) (Math.random() * ((90 - 65) + 1) + 65);

        for (int i = 1; i < letters.length; i++) {
            letters[i] = (char) (Math.random() * ((122 - 97) + 1) + 97);
        }
        for (int i = 0; i < letters.length; i++) {
            resultName = (resultName + letters[i]);
        }
        return resultName;
    }

    private static String egnGenerator() {
        String resultEgn = " ";
        short[] egn = new short[10];
        for (int i = 0; i < egn.length; i++) {
            egn[i] = (short) (Math.random() * (10));
            resultEgn += egn[i];
        }
        return resultEgn;
    }
}