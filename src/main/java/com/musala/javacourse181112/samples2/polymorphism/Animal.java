package com.musala.javacourse181112.samples2.polymorphism;

interface TestAnimal{
	void animalSound();
}

abstract class Animal implements TestAnimal{
  public void animalSound() {
    System.out.println("The animal makes a sound");
  }
}

class Pig extends Animal implements TestAnimal{
  public void animalSound() {
    System.out.println("The pig says: wee wee");
  }
}

class Dog extends Animal {
  public void animalSound() {
    System.out.println("The dog says: bow wow");
  }
}