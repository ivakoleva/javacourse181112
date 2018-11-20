package com.musala.javacourse181112.tasks;

public class DoWhileTestApp {
    public static int i = 0;
    public static int sum = 0;
    public static void main(final String[] args) {

        do {
             sum +=Integer.parseInt(args[i]);
                    i++;
            System.out.println(sum);
        }while(args.length > i);

    }


}
