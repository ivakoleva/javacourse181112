package com.musala.javacourse181112.samples2.polymorphism;

class TestClass {
  public static void main(String[] args) {
    //Animal myAnimal = new Animal();  // Create a Animal object
    TestAnimal myPig = new Pig();  // Create a Pig object
    Animal myDog = new Dog();  // Create a Dog object

    //myAnimal.animalSound();
    myPig.animalSound();
    myDog.animalSound();
  }
}