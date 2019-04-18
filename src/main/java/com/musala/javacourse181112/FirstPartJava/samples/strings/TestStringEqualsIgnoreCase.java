package com.musala.javacourse181112.FirstPartJava.samples.strings;

class TestStringEqualsIgnoreCase {
 public static void main(String args[]){  
   String s1="Sachin";  
   String s2="SACHIN";  
  
   System.out.println(s1.equals(s2));//false  
   System.out.println(s1.equalsIgnoreCase(s2));//true  
 }  
}  