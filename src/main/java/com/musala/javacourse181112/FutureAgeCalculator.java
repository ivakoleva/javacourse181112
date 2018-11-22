package com.musala.javacourse181112;

public class FutureAgeCalculator {
    public static void main(final String[] args) {
       System.out.println("Input parameters: " + args[0] + " " + args[1]);



        int spinner=0;
        int age=0;

        do {
            age += Integer.parseInt(args [spinner++]);
        } while (spinner<args.length);
        System.out.println("The age is: " + (age));

        /*System.out.println("Future age calculated: " +
                (Integer.parseInt(args[0]) +
                        Integer.parseInt(args[1])));*/
        System.exit(0);;
    }
}
