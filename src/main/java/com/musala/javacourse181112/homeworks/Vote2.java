package com.musala.javacourse181112.homeworks;

public class Vote2 {
    public static final int QUESTION = 2;
    public static final int MAX_VOTERS = 30;

    public static void main(String[] args) {
        VoteEnum[][] voteArr = new VoteEnum[QUESTION][MAX_VOTERS];
        int yesCount = 0;
        int noCount = 0;
        for (int i = 0; i < QUESTION; i++) {
            for (int j = 0; j < MAX_VOTERS; j++) {
                voteArr[i][j] = (i % 2) == 0 ? VoteEnum.YES : VoteEnum.NO;
                if (voteArr[i][j] == VoteEnum.YES) {
                    yesCount++;
                } else {
                    noCount++;
                }
            }
        }
        System.out.println(yesCount);
        System.out.println(noCount);
    }
}
