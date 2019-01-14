package com.musala.javacourse181112.samples2.classes;

public class MyClassMultipleObjects {
  int x = 5;

  public static void main(String[] args) {
    MyClassMultipleObjects myObj1 = new MyClassMultipleObjects();  // Object 1
    MyClassMultipleObjects myObj2 = new MyClassMultipleObjects();  // Object 2
    System.out.println(myObj1.x);
    myObj1.x ++;
	  System.out.println(myObj1.x);
    System.out.println(myObj2.x);
  }
}