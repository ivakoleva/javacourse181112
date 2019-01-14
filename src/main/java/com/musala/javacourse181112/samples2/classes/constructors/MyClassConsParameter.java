package com.musala.javacourse181112.samples2.classes.constructors;

public class MyClassConsParameter {
  int x;
  int z;

  public MyClassConsParameter(int y,int i) {
    x = y;
    z = i+y;
  }

  public static void main(String[] args) {
    MyClassConsParameter myObj = new MyClassConsParameter(10,21);
    System.out.println(myObj.z);
  }
}