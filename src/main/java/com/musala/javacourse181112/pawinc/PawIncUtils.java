package com.musala.javacourse181112.pawinc;

import java.nio.charset.Charset;

class PawIncUtils {
    static boolean isAscii(String str) {
        return Charset.forName("US-ASCII").newEncoder().canEncode(str);
    }

    static boolean isValidInt(int num) {
        if (num >= 0 && num <= Integer.MAX_VALUE)
            return true;
        return false;
    }

    static void isInAllowedMemoryAndTime(long startTime) {
        long endTime = System.currentTimeMillis();
        if (((endTime - startTime) > 250) || (((Runtime.getRuntime().totalMemory()
                - Runtime.getRuntime().freeMemory()) / (int) Math.pow(1024, 2)) > 16)) {
            System.out.println("Time: " + (endTime - startTime) + " ms");
            System.out.println("Memory: " + (Runtime.getRuntime().totalMemory()
                    - Runtime.getRuntime().freeMemory()) / (int) Math.pow(1024, 2) + " MB");
            System.exit(1);
        }
    }
}
