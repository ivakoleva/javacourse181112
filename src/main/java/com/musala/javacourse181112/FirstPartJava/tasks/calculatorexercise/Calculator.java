package com.musala.javacourse181112.FirstPartJava.tasks.calculatorexercise;

import com.musala.javacourse181112.FirstPartJava.tasks.Generics.Person;

public class Calculator{

    private Person person;
    private int ageToAdd;

    public Calculator(Person person, int ageToAdd) throws IllegalArgumentException{
        setPerson(person);
        setAgeToAdd(ageToAdd);
    }

    public static int calculateStatic(Person person,int age ){
        int result = person.getAge() + age;
        System.out.println(person.getAge() + age);
        return result;
    }
    public int calculate(){
        int result = this.person.getAge() + this.getAgeToAdd();
        System.out.println(this.person.getAge() + this.getAgeToAdd());
        return result;
    }
   /* private static int calculate(int age , Person ... person){
        return Arrays.stream(person).filter(p -> p.getAge() + age);
    }*/

    public void setAgeToAdd(int ageToAdd) {
        this.ageToAdd = ageToAdd;
    }

    public void setPerson(Person person) throws IllegalArgumentException {
        if (person != null){
            this.person = person;
        }else throw new IllegalArgumentException();
    }

    public int getAgeToAdd() {
        return ageToAdd;
    }

    public Person getPerson() {
        return person;
    }

}
