package com.musala.javacourse181112.FirstPartJava.samples2.classes.constructors;

public class MyClassConstructor {
  int x;  // Create a class attribute

  // Create a class constructor for the MyClassConstructor class
  public MyClassConstructor() {
  	x = 5;  // Set the initial value for the class attribute x
  }

  public static void main(String[] args) {
    MyClassConstructor myObj = new MyClassConstructor(); // Create an object of class MyClassConstructor (This will call the constructor)
    System.out.println(myObj.x); // Print the value of x
  }
}