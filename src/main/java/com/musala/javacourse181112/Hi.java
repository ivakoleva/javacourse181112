package com.musala.javacourse181112;

/**
 * Created by Iva Koleva, ClearCode Ltd. on 12.11.2018,
 * a significant bit of leva.bg project.
 */
public class Hi {
    int i = 1;
    Integer i1 = null;

    public static void main(String[] args) {
        System.out.println("Hi!"); // hardcoded
        System.out.println(args[0]); // runtime
        System.out.println(Integer.parseInt(args[0]));
        //System.gc();
        System.exit(0);
    }
}
