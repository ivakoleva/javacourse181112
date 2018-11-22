package com.musala.javacourse181112.tasks;

public class VotesV02Application {
    /* Votes v0.2 application
     * introduce enum usage (vote answer yes/no)
     * implement votes counting then printing to stdout
     * introduce person multi-dimensional array (Object), then populate:
     ** first element of each inner person array - EGN
     ** second element - name
     ** third - Vote (enum)
     */
    public static final int QUESTION_COUNT = 2;
    public static final int VOTES_COUNT = 30;
    public static final String QUESTION_PREFIX = "Question ";
    public static final String QUESTION_SEPARATOR = ": ";
    public static final String YES = "yes";
    public static final String NO = "no";
    public static final int PEOPLE_NUMBER = 3;
    public static final int PEOPLE_ELEMENTS = 3;

    public static void main(final String[] args) {

        final Vote[][] votes = new Vote[QUESTION_COUNT][VOTES_COUNT];
        final Object[][] person = new Object[PEOPLE_NUMBER][PEOPLE_ELEMENTS];
    }

}
