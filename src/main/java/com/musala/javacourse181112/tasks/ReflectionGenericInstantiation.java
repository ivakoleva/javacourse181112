package com.musala.javacourse181112.tasks;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

public class ReflectionGenericInstantiation {
    public static void main(final String[] args) throws NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException, TypeNotPresentException {
        Sample.class.getConstructor();
        final Sample constructor1 = Sample.class.newInstance();
        final Sample constructor2 = Sample.class.getDeclaredConstructor(String.class, String.class, Integer.class).newInstance("Petar", "Petrov", 25);
        final Sample constructor3 = Sample.class.getDeclaredConstructor(String.class, String.class).newInstance("Ivan", "Ivanov");
        final Sample constructor4 = Sample.class.getDeclaredConstructor(Integer.class).newInstance(20);

        final List<Sample> constructorList = new ArrayList<>();
        constructorList.add(constructor1);
        constructorList.add(constructor2);
        constructorList.add(constructor3);
        constructorList.add(constructor4);

        for (int i = 0; i < constructorList.size(); i++) {
            System.out.println(constructorList.get(i).toString());
        }
    }

    private static class Sample {
        private String name;
        private String surname;
        private Integer age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSurname() {
            return surname;
        }

        public void setSurname(String surname) {
            this.surname = surname;
        }

        public int getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        public Sample(String name, String surname, Integer age) {
            this.name = name;
            this.surname = surname;
            this.age = age;
        }

        public Sample(String name, String surname) {
            this.name = name;
            this.surname = surname;
            this.age = 100;
        }

        public Sample(Integer age) {
            this.name = "Gosho";
            this.surname = "Georgiev";
            this.age = age;
        }

        public Sample() {
        }

        @Override
        public String toString() {
            return "name: " + name +
                    ", surname: " + surname +
                    ", age: " + age;
        }
    }
}
