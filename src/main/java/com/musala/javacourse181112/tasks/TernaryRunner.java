package com.musala.javacourse181112.tasks;

/**
 * Created by Iva Koleva on 19.11.2018
 */
public class TernaryRunner {
    public static void main(final String[] args) {
        String value = "yes";

        int yesCounter = 0;
        int noCounter = 0;

        if("yes".equals(value)) {

            yesCounter++;
        } else if("no".equals(value)) {
            noCounter++;
        }
        // TODO: 2-lines implementation, using ternary operator


        final int checkYes="yes".equals(value)?yesCounter++:noCounter++;
        final int checkNo="no".equals(value);


                //switch

        switch (value) {
            case "prof" :
                //
                System.out.println("value:yes");
                break;
            case "dr" :
                System.out.println("value: yes ");
                break;
            case "a":
                System.out.println("value :asd");
                break;
            case "asd1":
                System.out.println("value = asd1");
                break
            case "asd2"
             System.out.println("defalut");
             break;
             default:
                 System.out.println();
        }
    }
}


