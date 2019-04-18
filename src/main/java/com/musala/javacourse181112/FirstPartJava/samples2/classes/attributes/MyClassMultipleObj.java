package com.musala.javacourse181112.FirstPartJava.samples2.classes.attributes;

public class MyClassMultipleObj {
  int x = 5;

  public static void main(String[] args) {
    MyClassMultipleObj myObj1 = new MyClassMultipleObj();  // Object 1
    MyClassMultipleObj myObj2 = new MyClassMultipleObj();  // Object 2
    myObj2.x = 25;
    System.out.println(myObj1.x);  // Outputs 5
    System.out.println(myObj2.x);  // Outputs 25
  }
}