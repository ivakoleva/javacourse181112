package com.musala.javacourse181112.tasks;

// OKI
public class Voting {
    public static final int QUESTIONS_COUNT = 2;
    public static final int VOTES_COUNT = 30;
    public static final String QUESTION_PREFIX = "Question ";
    public static final String QUESTION_SEPARATOR = ": ";
//   public static final String YES = "yes";
  //  public static final String NO = "no";

    public static void main(final String[] args) {
        final Vote[][] votes = new Vote[QUESTIONS_COUNT][VOTES_COUNT];

        int qIndex = 0; // TODO: use loops

        // populate data
        final String q0 = "Do You like snow?";
        votes[qIndex][0] = Vote.NO;
        votes[qIndex][1] = Vote.YES;
        votes[qIndex][2] = Vote.NO;

        // print data
        printQuestion(qIndex, q0);
        printVotes(votes, qIndex);

        // populate data
        final String q1 = "Do you want it to snow today?";
        votes[++qIndex][0] = Vote.YES;
        votes[qIndex][1] = Vote.NO;
        votes[qIndex][2] = Vote.YES;

        // print data
        printQuestion(qIndex, q1);
        printVotes(votes,qIndex);

        countVotes(votes);
    }

    public static void printQuestion(final int index, final String content) {
        System.out.println(QUESTION_PREFIX + (index + 1) + QUESTION_SEPARATOR + content);
    }

    public static void printVotes(final Vote[][] votes, final int questionIndex) {
        // TODO: use loops
        System.out.println("Vote 1: " + votes[questionIndex][0]);
        System.out.println("Vote 2: " + votes[questionIndex][1]);
        System.out.println("Vote 3: " + votes[questionIndex][2]);
    }

    // TODO: implement
    public static void countVotes(final Vote[][] votes) {
        int voteYes=0;
        int voteNo=0;
        for(int i=0;i<votes.length;i++){
            for(int j=0;j<votes[i].length;j++){
                if(votes[i][j]==Vote.YES){
                    voteYes++;
                }else{
                    voteNo++;
                }
          //      System.out.println("Votes for Question"+votes[i+1]);
            }
        }

    }
}
