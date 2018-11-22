package com.musala.javacourse181112.tasks;

public class FutureAgeCalculatorV02 {
//    Future age calculator v0.2
//            ** implement multiple program arguments support (unlimited number)
//    ** assume and rely on user input (int values)
//    ** sum all of the parameters, then print to stdout (use while or do-while)
//        ** bonus: do input validation - natural numbers only; exit(1) if otherwise

    public static void main(String[] args) {

        int result = 0;
        int counter = 0;

        do {
            result = Integer.parseInt(args[counter]) + Integer.parseInt(args[counter++]);
            System.out.println("Your current age is: " + args[counter] + "and after " + args[counter++] +
                    " years you will be " + (counter + counter++));
            System.out.println("Current result is:");

        } while (counter <= args.length);


        System.exit(0);
    }


}
