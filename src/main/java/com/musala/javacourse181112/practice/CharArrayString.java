package com.musala.javacourse181112.practice;

public class CharArrayString {
    public static void main(String[] args) {
        String s1 = "java";
        char ch[] = {'s', 't', 'r', 'i', 'n', 'g', 's'};
        String s2 = new String(ch); // converting char array to string
        String s3 = new String("example" + (40 + 40) + 40 + 40);
        String s4 = new String("testingSubstring");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4.substring(7) + "\n" + s4.substring(0, 7));
    }
}
