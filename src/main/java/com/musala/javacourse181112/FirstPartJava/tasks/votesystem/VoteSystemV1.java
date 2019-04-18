package com.musala.javacourse181112.FirstPartJava.tasks.votesystem;

public class VoteSystemV1 {
    public static void main(String[] args) {
        System.out.println("Welcome to Vote System");
        String[][] dataArray = new String[3][30];
        int question,person;
        for (question = 0;question<3;question++) {
            System.out.println("Please Answer to the Question"+ (question+1));
            for (person=0; person < 30;person++){
                if (person%2 == 0){
                    dataArray[question][person] = "Yes";
                }else {
                    dataArray[question][person] = "No";
                }
                System.out.println("Person: "+ (person+1)+" Voted for: "
                        + dataArray[question][0]+ " on question: "+ (question+1));
            }
        }
    }
}
