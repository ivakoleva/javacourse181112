package com.musala.javacourse181112.tasks.vote40;

// TODO: use composition in favor of inheritance in that case
public class Voter { // extends Vote {
    private String name;
    private String egn;
    //private Vote vote;

    public String getName() {
        return name;
    }

    public void setName(String Name) {
        this.name = Name;
    }

    public String getEgn() {
        return egn;
    }

    public void setEgn(String egn) {
        this.egn = egn;
    }

    /*public Vote getVote() {
        return vote;
    }

    public void setVote(Vote vote) {
        this.vote = vote;
    }*/

    // default constructor, anemic data model
    /*public Voter(boolean answer, int questionNumber, String name, String egn) {
        super(answer, questionNumber);
        this.name = name;
        this.egn = egn;
    }

    public Voter(int questionNumber, String name, String egn) {
        super(questionNumber);
        this.name = name;
        this.egn = egn;
    }

    public Voter(int questionNumber) {
        super(questionNumber);

        this.name = randomNameGenerator();
        this.egn = randomEGNGenerator();
    }*/

    // TODO: move to Controller
    public void randomName() {
        this.name = (randomNameGenerator());
    }

    public void randomEGN() {
        this.egn = randomEGNGenerator();
    }

    // TODO: extract into Generator class component
    // TODO: create a final Utils class (private constructor);
        // construct an opinionated NameGenerator & EgnGenerator,
        // then delegate generateName() & generateEgn() using constant generator instances
    private static String nameGenerator() {
        String result = "";
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

    private static String randomNameGenerator() {
        String result;
        result = (nameGenerator() + " " + nameGenerator());
        return result;
    }

    private static String randomEGNGenerator() {
        String result = "";
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
