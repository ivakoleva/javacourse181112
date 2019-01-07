package com.musala.javacourse181112.tasks.vote40;

public class Voter extends Vote {
    String Name;
    String EGN;

    public Voter(boolean answer, int questionNumber, String Name, String EGN) {
        super(answer, questionNumber);
        this.Name = Name;
        this.EGN = EGN;
    }

    public Voter(int questionNumber, String Name, String EGN) {
        super(questionNumber);
        this.Name = Name;
        this.EGN = EGN;
    }

    public Voter(int questionNumber) {
        super(questionNumber);
        
        this.Name = randomNameGenerator();
        this.EGN = randomEGNGenerator();
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getEGN() {
        return EGN;
    }

    public void setEGN(String EGN) {
        this.EGN = EGN;
    }

    public void randomName() {
        this.Name = (randomNameGenerator());
    }

    public void randomEGN() {
        this.EGN = randomEGNGenerator();
    }

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
