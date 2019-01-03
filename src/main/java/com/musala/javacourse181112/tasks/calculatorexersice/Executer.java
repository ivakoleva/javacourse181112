package com.musala.javacourse181112.tasks.calculatorexersice;

import java.util.ArrayList;
import java.util.List;

public class Executer {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            int numberOfTheChar = 65 + i;
            people.add(new Person(randomFullName(2),
                    i + (int) (Math.random() * 50)));
        }

        Calculator calculator = new Calculator();

        for (Person person : people) {
            calculator.setPerson(person);
            calculator.setYearsToAdd(10);
            System.out.println("Person name:" + person.getName() + " His/Her Future Age:" + calculator.getFutureAge());
        }


    }

    public static String randomFullName(int numberOfNames){
        String fullName = new String();
        for(int i = 0; i<numberOfNames;i++){
            fullName+=randomName()+" ";
        }
        return  fullName;
    }

    public static String randomName() {
        int nameLength = (int) (Math.random() * 7 + 3);
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < nameLength; i++) {
            int charLength = (int) (Math.random() * 26 + 97);
            builder.append((char) charLength);
        }
        return builder.toString().substring(0, 1).toUpperCase()+builder.toString().substring(1);
    }
}
