package com.musala.javacourse181112.FirstPartJava.samples.strings.format;

class StringFormat3 {
    public static void main(String args[]) 
    { 
        int num = 7044; 
  
        // Output is 3 zero's("000") + "7044", 
        // in total 7 digits 
        String gfg3 = String.format("%07d", num); 
  
        System.out.println(gfg3); 
    } 
} 