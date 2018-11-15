package com.musala.javacourse181112;

public class VotesApplication {
    public static void main(String[] args) {
        String[][] questions = {{"Do you follow the news?"},
                {"Do you think that Valeri Simeonov should resign?" }
                        };
        String [][] votes = {{"yes"}, {"yes"},
                {"yes"}, {"yes"},
                {"yes"}, {"yes"},
                {"yes"}, {"yes"}};
        //didn't print, but yeah, it works :D

        //todo: design method for future votes counter implementation
       // voteCounter(); - not finished
    }
    public static void voteCounter(){
        int row=30;
        int column=1;

        String[][] alternativeVotes = new String[row][column];

        for (int i=0; i<=alternativeVotes.length; i++){
            for(int k=0; k<=alternativeVotes[row].length; k++){
                alternativeVotes[row][column] = "yes";
            }
        }
    }
}
