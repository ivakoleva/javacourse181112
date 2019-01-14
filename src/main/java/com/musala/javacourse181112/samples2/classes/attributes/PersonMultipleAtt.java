package com.musala.javacourse181112.samples2.classes.attributes;

public class PersonMultipleAtt {
  String fname = "John";
  String lname = "Doe";
  int age = 24;

  public static void main(String[] args) {
    PersonMultipleAtt myObj = new PersonMultipleAtt();
    System.out.println("Name: " + myObj.fname + " " + myObj.lname);
    System.out.println("Age: " + myObj.age);
  }
}