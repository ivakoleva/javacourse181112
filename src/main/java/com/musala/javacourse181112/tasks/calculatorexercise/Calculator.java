package com.musala.javacourse181112.tasks.calculatorexercise;

public class Calculator {
     private int years;

     public int getYears() {
          return years;
     }

     public Calculator(final int years){
          this.years = years;
     }
     public void setYears(int years) {
          this.years = years;
     }

     public void calculate(final Calculator calculator, final Person person){
          System.out.println(calculator.getYears() + person.getAge());
     }
}
