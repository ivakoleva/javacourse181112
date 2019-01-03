package com.musala.javacourse181112.tasks.calculatorexercise;

public class MainClass {
    public static void main(final String[] args) {
        final Person person = new Person(20);
        final Person person1 = new Person(21);
        final Person person2 = new Person(22);
        final Person person3 = new Person(23);
        final Person person4 = new Person(24);
        final Person person5 = new Person(25);
        final Person person6 = new Person(26);
        final Person person7 = new Person(27);
        final Person person8 = new Person(28);
        final Person person9 = new Person(29);

        final Calculator calculator = new Calculator(10);
        calculator.calculate(new Calculator(10),person);
        calculator.calculate(new Calculator(15),person1);
    }
}
