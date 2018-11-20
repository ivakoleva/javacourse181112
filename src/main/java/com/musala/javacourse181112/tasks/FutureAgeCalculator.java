package com.musala.javacourse181112.tasks;

public class FutureAgeCalculator {
    public static void main(final String[] args) {
        v1(args);
        v2(args);
        System.exit(0);
    }

    public static void v1(final String[] args) {
        int i = 0;
        while ((i + 1) < args.length) {
            // validate
            // TODO: handle exception

            final int age = Integer.parseInt(args[i]);
            final int addYears = Integer.parseInt(args[i + 1]);

            if (!args[i].equals(Integer.toString(age)) ||
                    !Integer.toString(addYears).equals(args[i + 1])) {
                //System.out.println(1);
                System.exit(1);
            }
            calculate(age, addYears);
            i += 2;
        }
    }

    public static void v2(final String[] args) {
        int k = 0;
        while (k < args.length) {
            for (int i = 0; i < args[k].length(); i++) {
                // TODO: regex ?
                // unicode table, for reference
                if (args[k].charAt(i) < '0' || args[k].charAt(i) > '9') {
                    System.out.println(1);
                    //System.exit(1);
                }
            }
            if (k % 2 != 0) {
                calculate(Integer.parseInt(args[k - 1]), Integer.parseInt(args[k]));
            }
            k++;
        }
    }

    public static void calculate(final int n1, final int n2) {
        System.out.println("Age:" + n1 + "\nAdded Age:" + n2);
        System.out.println("Result:" + (n1 + n2));
    }
}
