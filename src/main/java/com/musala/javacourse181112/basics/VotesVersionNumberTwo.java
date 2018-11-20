package com.musala.javacourse181112.basics;

import static com.musala.javacourse181112.basics.EnumForVotes.NO;
import static com.musala.javacourse181112.basics.EnumForVotes.YES;

public class VotesVersionNumberTwo {
    public static void countAndPrintVote(Enum answerForVote) {
        int counterYes = 0;
        int counterNo = 0;


        if (EnumForVotes.YES.equals(answerForVote)) {
            counterYes++;

        } else if (EnumForVotes.NO.equals(answerForVote)) {
            counterNo++;

        }

        System.out.println("Total Yes answers:" + counterYes);
        System.out.println("Total No answers:" + counterNo);
    }

  public static void writingDataInArray(String name[],String numbers[],String data[][],Enum vote ){
        for(int columb=0;columb < data.length;columb++){
           data[0][columb]=name[columb];
           data[1][columb]=numbers[columb];
           data[2][columb]= String.valueOf(vote);
            System.out.println("Data for every person: " + data[0][columb]+" " + data[1][columb]+" " + data[2][columb]);

        }
    }


    public static void main(String[] args) {
        /**String[] answers = new String[]{ "YES","NO","YES"
        };*/
        String[] names=new String[]{
                "Iva",
                "Petur",
                "Toni"
        };
        String[] egn=new String[]{
          "2005254022",
          "9906092260",
          "9711113322"
        };
        String[][] personalData=new String[3][3];

        EnumForVotes answer = NO;
        answer= YES;
        countAndPrintVote(answer);//
        writingDataInArray(names,egn,personalData,answer);


    }
}