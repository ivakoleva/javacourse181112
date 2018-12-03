package com.musala.javacourse181112.samples.strings.format;

class StringFormat4 {
    public static void main(String args[]) 
    { 
        int num = 7044; 
  
        // Output is 3 zero's("000") + "7044", 
        // in total 7 digits 
        String gfg3 = String.format("%7d", num);
  
        System.out.println(gfg3); 
    } 
} 