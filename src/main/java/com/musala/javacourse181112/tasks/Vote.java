package com.musala.javacourse181112.tasks;

public class Vote {
    public static void main(final String[] args) {
        System.out.println("Wellcome ,you can vote now");
        final String[][] voteArr = new String[2][30];
        // TODO : use more loop's logic !!!
        // ?????
        String v1 = "yes";
        String v2 = "no";
        String v3 = "no";
        String v4 = "no";
        String v5 = "no";
        String v6 = "yes";


        // populate data
        voteArr[0][0] = v1;
        voteArr[0][1] = v2;
        voteArr[0][2] = v3;
        voteArr[1][0] = v4;
        voteArr[1][1] = v5;
        voteArr[1][2] = v6;


        // print data
        System.out.println("Отговори на първи въпрос: ");

        for (int i = 0; i < voteArr.length + 1; i++) {
            System.out.println(voteArr[0][i]);
        }

        System.out.println("Отговори на втори въпрос");

        for (int i = 0; i < voteArr.length + 1; i++) {
            System.out.println(voteArr[1][i]);
        }
    }
}
