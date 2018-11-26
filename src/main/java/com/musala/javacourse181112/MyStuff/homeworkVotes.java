package com.musala.javacourse181112.MyStuff;

// OKI * 2
public class homeworkVotes {
    private static final int QUESTIONS_COUNT = 2;
    private static final int VOTES_COUNT = 3;
    private static final String QUESTION_PREFIX = "Question ";
    private static final String QUESTION_SEPARATOR = ": ";
    private static final int PEOPLE_NUMBER = 3;
    private static final int PEOPLE_ELEMENTS = 3;

    private static final Votesenum[][] VOTES = new Votesenum[QUESTIONS_COUNT][VOTES_COUNT];
    private static Object[][] PERSONS = new Object[PEOPLE_NUMBER][PEOPLE_ELEMENTS];

    public static void main(final String[] args) {
        // populate persons
        PERSONS[0][0] = "9812124505";
        PERSONS[0][1] = "Todor";
        PERSONS[0][2] = Votesenum.YES;
        PERSONS[1][0] = "9812124505";
        PERSONS[1][1] = "Krisa";
        PERSONS[1][2] = Votesenum.NO;
        PERSONS[2][0] = "9812124505";
        PERSONS[2][1] = "Radost";
        PERSONS[2][2] = Votesenum.YES;

        // TODO: use loops
        int qIndex = 0;
        int pIndex = 0;
        // populate data
        final String q0 = "Do You like cats?";
        VOTES[qIndex][0] = getVoteFromPersonArrayByIndex(pIndex);
        VOTES[qIndex][1] = getVoteFromPersonArrayByIndex(++pIndex);
        VOTES[qIndex][2] = getVoteFromPersonArrayByIndex(++pIndex);

        // print data
        printQuestion(qIndex, q0);
        printVotes(qIndex);

        // populate data
        final String q1 = "Do are you an adult?";
        VOTES[++qIndex][0] = Votesenum.YES;
        VOTES[qIndex][1] = Votesenum.NO;
        VOTES[qIndex][2] = Votesenum.YES;

        // print data
        printQuestion(qIndex, q1);
        printVotes(qIndex);

        countVotes();
    }

    private static void printQuestion(final int index, final String content) {
        System.out.println(QUESTION_PREFIX + (index + 1) + QUESTION_SEPARATOR + content);
    }

    private static void printVotes(final int questionIndex) {
        // TODO: use loops
        System.out.println("Vote 1: " + VOTES[questionIndex][0]);
        System.out.println("Vote 2: " + VOTES[questionIndex][1]);
        System.out.println("Vote 3: " + VOTES[questionIndex][2]);
    }

    // TODO: implement
    private static void countVotes() {
        int voteYes = 0;
        int voteNo = 0;
        for (int i = 0; i < VOTES.length; i++) {
            for (int j = 0; j < VOTES[i].length; j++) {
                if (VOTES[i][j] == Votesenum.YES) {
                    voteYes++;
                } else {
                    voteNo++;
                }
            }
            System.out.println("Votes for Question " + (i + 1) + " Yes: " + voteYes + " No: " + voteNo);
            voteNo = 0;
            voteYes = 0;
        }
    }

    private static Votesenum getVoteFromPersonArrayByIndex(final int index) {
        return (Votesenum) PERSONS[index][2];
    }
}
/*
Examples from  others:
1)
public class VotesApplication {

    public static void main(final String[] args) {
        final Object[][] votes = new Object[3][3];
        final Scanner input = new Scanner(System.in);

        final String[] questions = {"Do you like ice cream", "Do you drink coffee"};
        String voteFromConsole;
        int yesCount = 0;
        int noCount = 0;

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);

            for (int v = 0; v < votes.length; v++) {
                // TODO: while check until valid
                System.out.println("Enter EGN");
                votes[v][0] = input.next();

                if(!isEgnValid((String) votes[v][0])) {
                    System.out.println("Please type a valid EGN");
                    System.exit(1);
                }

                System.out.println("Enter name");
                        votes[v][1] = input.next();

                        System.out.println("Enter vote YES/NO");
                        voteFromConsole = input.next().toUpperCase();
                        votes[v][2] = Vote.valueOf(voteFromConsole);

                        if (Vote.YES.equals(votes[v][2])) {
                        yesCount++;
                        } else {
                        noCount++;
                        }
                        }
                        System.out.println(Arrays.deepToString(votes));
                        System.out.println();
                        }

                        System.out.println("Results " + " YES - " + yesCount + " NO - " + noCount);
                        }

private static boolean isEgnValid(final String egn) {
        return egn.length() == 10;
        }

        //EnumVote voteEnumYes = EnumVote.YES;
        //EnumVote voteEnumNo = EnumVote.NO;
        //Object[][] vote = new String[3][3];

        //array[0][0] = "Ivan";
        // array [0][1] = "92212312";
        //array[0][2] = voteEnumYes;

       /*vote[0][0] = "6854455240";
        vote[0][1] = "Ivan";
        vote[0][2] = voteEnumYes;
        vote [1][0] = "45522142";
        vote[1][1] = "Pehso";
        vote[1][2] = voteEnumNo;
        vote [2][0] = "1000000";
        vote[2][1] = "Gosho";
        vote[2][2] = voteEnumNo;
        System.out.println(Arrays.deepToString(array));*/

