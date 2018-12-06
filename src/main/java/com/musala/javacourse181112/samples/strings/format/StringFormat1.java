package com.musala.javacourse181112.samples.strings.format;

class StringFormat1 {
    public static void main(String args[]) 
    { 
        String str = "GeeksforGeeks."; 
  
        // Concatenation of two strings 
        String gfg1 = String.format("My Company name is %s", str); 
  
        // Output is given upto 8 decimal places 
        String str2 = String.format("My answer is %.8f", 47.65734); 
  
        // between "My answer is" and "47.65734000" there are 15 spaces 
        String str3 = String.format("My answer is %15.2f", 47.65734);
  
        System.out.println(gfg1); 
        System.out.println(str2); 
        System.out.println(str3); 
    } 
} 