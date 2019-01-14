package com.musala.javacourse181112.samples2.classes.constructors;

public class MyClassConsParameter {
  int x;

  public MyClassConsParameter(int y) {
    x = y;
  }

  public static void main(String[] args) {
    MyClassConsParameter myObj = new MyClassConsParameter(5);
    System.out.println(myObj.x);
  }
}