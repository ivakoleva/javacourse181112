package com.musala.javacourse181112.tasks;

// OKI
public class Voting {
    public static final int QUESTIONS_COUNT = 2;
    public static final int VOTES_COUNT = 3;
    public static final String QUESTION_PREFIX = "Question ";
    public static final String QUESTION_SEPARATOR = ": ";
    public static final int PEOPLE_NUMBER=3;
    public static final int PEOPLE_ELEMENTS=3;
//   public static final String YES = "yes";
  //  public static final String NO = "no";

    public static void main(final String[] args) {
        final Vote[][] votes = new Vote[QUESTIONS_COUNT][VOTES_COUNT];
        final String[][] person= new String[PEOPLE_NUMBER][PEOPLE_ELEMENTS];
        person[0][0]="9812124505";
        person[0][1]="Todor";
        person[0][2]="YES";
        person[1][0]="9812124505";
        person[1][1]="krisa";
        person[1][2]="NO";
        person[2][0]="9812124505";
        person[2][1]="radost";
        person[2][2]="YES";
        int qIndex = 0; // TODO: use loops
    int pIndex=0;
        // populate data
        final String q0 = "Do You like snow?";
        votes[qIndex][0] = "yes".equalsIgnoreCase(person[pIndex][2])?Vote.YES:Vote.NO;
        votes[qIndex][1] = "yes".equalsIgnoreCase(person[++pIndex][2])?Vote.YES:Vote.NO;
        votes[qIndex][2] = "yes".equalsIgnoreCase(person[++pIndex][2])?Vote.YES:Vote.NO;

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
            }
            System.out.println("Votes for Question "+(i+1)+" Yes: "+voteYes+" No: "+voteNo);
            voteNo=0;voteYes=0;
        }

    }
}
