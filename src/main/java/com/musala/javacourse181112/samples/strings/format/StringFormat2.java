package com.musala.javacourse181112.samples.strings.format;

class StringFormat2 {
    public static void main(String args[]) 
    { 
        String str1 = "GFG"; 
        String str2 = "GeeksforGeeks"; 
  
        //%1$ represents first argument, %2$ generics argument
        String gfg2 = String.format("My Company name" +  
                 " is: %1$s, %1$s and %2$s", str1, str2); 
  
        System.out.println(gfg2); 
    } 
} 