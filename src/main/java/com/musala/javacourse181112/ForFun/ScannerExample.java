package com.musala.javacourse181112.ForFun;
import java.util.*;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNextInt()) {
            System.out.print(scan.next());
        }
        scan.close();
        System.exit(0);
    }
}
