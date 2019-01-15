package com.musala.javacourse181112.samples2.classes.methods;

// Create a CarSimple class
public class CarSimple {
 
  // Create a fullThrottle() method
  public void fullThrottle() {
    System.out.println("The car is going as fast as it can!");
  }

  // Create a speed() method and add a parameter
  public void speed(int maxSpeed) {
    System.out.println("Max speed is: " + maxSpeed);
  }

  // Inside main, call the methods on the myCar object
  public static void main(String[] args) {
    CarSimple myCarSimple = new CarSimple();     // Create a myCarSimple object
    myCarSimple.fullThrottle();      // Call the fullThrottle() method
    myCarSimple.speed(200);          // Call the speed() method
  }
}
