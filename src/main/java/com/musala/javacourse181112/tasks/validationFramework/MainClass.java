package com.musala.javacourse181112.tasks.validationFramework;

public class MainClass {
    public static void main(final String[] args) throws IllegalAccessException, MyException {
        final Person person = new Person();
        person.setName("Ivan Ivanov");

        final NameValidator nameValidator = new NameValidator();

        nameValidator.validating(person);
        System.out.println(person.getName());

        final Person person2 = new Person();
        person2.setName("Ivan Petrov");

        nameValidator.validatingWithLambda(person2);
        System.out.println(person2.getName());
    }
}
