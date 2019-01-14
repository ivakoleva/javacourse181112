package com.musala.javacourse181112.samples2.classes;

public class MyClassSimple {
  int x;

  public MyClassSimple(){
  	x = -17;
  	int t = 70;
  }

  public static void main(String[] args) {
    MyClassSimple myObj = new MyClassSimple();
    System.out.println(myObj.x);
  }
}