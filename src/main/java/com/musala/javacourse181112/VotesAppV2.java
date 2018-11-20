package com.musala.javacourse181112;

public class VotesAppV2 {

    public static void main(String[] args) {
        Object[][] people = new Object[3][3];
        String[] question = {"Do you like java", "Do you drink coffee"};
        EnumVote voteEnumYes = EnumVote.YES;
        EnumVote voteEnumNo = EnumVote.NO;

        System.out.println(question[1]);

        people[0][0] = "9708070201";
        people[0][1] = "Dimitur";
        people[0][2] = voteEnumYes;

        people[1][0] = "9807210203";
        people[1][1] = "Petur";
        people[1][2] = voteEnumNo;

        people[2][0] = "9512010503";
        people[2][1] = "Ivan";
        people[2][2] = voteEnumYes;




    }
}
