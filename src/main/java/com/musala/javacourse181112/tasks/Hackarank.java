package com.musala.javacourse181112.tasks;

import java.util.Scanner;

/**
 * Created by Aykut Ismailov on 3.2.2019 г.
 */
public class Hackarank {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String[] sArray = s.split("[\\W_\\s]+");
        System.out.println(sArray.length);
        for (int i = 0; i < sArray.length; i++) {
            System.out.println(sArray[i]);
        }
        scan.close();
    }
}


