package com.musala.javacourse181112.FirstPartJava.samples2.classes.attributes;

public class MyClassChangeAtt {
  int x = 10;

  public static void main(String[] args) {
    MyClassChangeAtt myObj = new MyClassChangeAtt();
    myObj.x = 25; // x is now 25
    System.out.println(myObj.x); 
  }
}