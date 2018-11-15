package com.musala.javacourse181112;

public class Poll {
    public static void main(String[] args) {
        String[][] voters = new String[30][2];
        System.out.println("Welcome!!! \nThe first question is: \nDo you like pizza?");
        for(int i=0; i<30; i++){
            if((i%2)==0){
                    voters[i][0]="Yes";
            }
            {
                else voters[i][0]="No";
            }
            System.out.println("Voter " + i + " voted: " + voters[i][0]);
        }

        for(int i=0; i<30; i++){
            if(i/2==0) voters[i][1]="No";
            else voters[i][1]="Yes";

        }
        System.exit(0);
    }

}
