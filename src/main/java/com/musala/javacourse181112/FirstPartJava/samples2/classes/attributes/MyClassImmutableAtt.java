package com.musala.javacourse181112.FirstPartJava.samples2.classes.attributes;

public class MyClassImmutableAtt {
  final int x = 10;

  public static void main(String[] args) {
    MyClassImmutableAtt myObj = new MyClassImmutableAtt();
    //myObj.x = 25; // will generate an error: cannot assign a value to a final variable
    System.out.println(myObj.x); 
  }
}
