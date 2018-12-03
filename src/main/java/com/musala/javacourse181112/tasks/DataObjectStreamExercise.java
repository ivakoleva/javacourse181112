package com.musala.javacourse181112.tasks;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by Iva Koleva on 29.11.2018
 */
public class DataObjectStreamExercise {
    public static void main(final String[] args) throws IOException {
        //dataObjectStreamRun();
        lambdaSamplesRun();
    }

    public static void lambdaSamplesRun(){
        final List<Person> personList = IntStream.range(0, 10)
                .boxed()
                .map(integer -> {
                    final Person person =  new Person();
                    person.setAge(integer * 10 + integer);
                    person.setName("Name" + integer);
                    person.setGender(integer % 2 != 0 ? Gender.MALE : Gender.FEMALE );
                    return person;
                }).collect(Collectors.toList());
        System.out.println();

        final List<Person> personSubList = personList.stream()
                .filter(person -> person.getAge() % 2 != 0)
                .collect(Collectors.toList());
        System.out.println();
    }

    private static void dataObjectStreamRun() throws IOException {
        final Person person = new Person();
        person.setName("Ivan Ivanov");
        person.setAge(30);
        person.setEgn("9211111111");
        final Person person1 = new Person();
        person1.setName("Maria Marinova");
        person1.setAge(40);
        person1.setEgn("0345111111");
        final Company company1 = new Company();
        company1.setName("Google");
        company1.setNumberOfEmployees(88110);
        final Company company2 = new Company();
        company2.setName("Facebook");
        company2.setNumberOfEmployees(33606);

        try (final ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("objects_serialized"))) {
            objectOutputStream.writeObject(person);
            //objectOutputStream.reset();
            objectOutputStream.writeObject(person1);
            objectOutputStream.writeObject(company1);
            objectOutputStream.writeObject(company2);
        }

        Person personDeserialized = null;
        Person personDeserialized1 = null;
        Company companyDeserialized1 = null;
        Company companyDeserialized2 = null;
        try (final ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("objects_serialized"))) {
            personDeserialized = (Person) objectInputStream.readObject();
            personDeserialized1 = (Person) objectInputStream.readObject();
            companyDeserialized1 = (Company) objectInputStream.readObject();
            companyDeserialized2 = (Company) objectInputStream.readObject();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        /*System.out.println(personDeserialized != null ?
                personDeserialized.toString() :
                null);
        System.out.println(personDeserialized1 != null ?
                personDeserialized1.toString() :
                null);
        System.out.println();*/

        final List<Object> stateEntityList = new ArrayList<>();
        stateEntityList.add(personDeserialized);
        stateEntityList.add(personDeserialized1);
        stateEntityList.add(companyDeserialized1);
        stateEntityList.add(companyDeserialized2);
        stateEntityList.forEach(System.out::println);
    }

    private static class Company implements Serializable {
        private static final long serialVersionUID = -8726727230468530787L;

        private int numberOfEmployees;
        private String name;
        private Person[] employees = new Person[numberOfEmployees];

        public int getNumberOfEmployees() {
            return numberOfEmployees;
        }

        public void setNumberOfEmployees(int numberOfEmployees) {
            this.numberOfEmployees = numberOfEmployees;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Person[] getEmployees() {
            return employees;
        }

        public void setEmployees(Person[] employees) {
            this.employees = employees;
        }

        @Override
        public String toString() {
            return "Company: " + name + " has " + numberOfEmployees;
        }
    }

    private static class Person implements Serializable {
        private static final long serialVersionUID = 5023965202399044512L;

        private String name;
        private int age;
        private transient int yearOfBirth;
        private transient int monthOfBirth;
        private transient int dayOfBirth;
        private Gender gender;
        private String egn;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Gender getGender() {
            return gender;
        }

        public void setGender(Gender gender) {
            this.gender = gender;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public int getYearOfBirth() {
            return yearOfBirth;
        }

        public void setYearOfBirth(int yearOfBirth) {
            this.yearOfBirth = yearOfBirth;
        }

        public String getEgn() {
            return egn;
        }

        public void setEgn(final String egn) {
            if (egn.length() != 10) {
                System.out.println("Invalid length of egn.");
            }
            int year = Integer.parseInt(egn.substring(0, 2));
            if (year < 0 || year > 99) {
                System.out.println("Invalid year format, 00-99 expected.");
            }
            int month = Integer.parseInt(egn.substring(2, 4));
            if (month < 41 || month > 52) {
                if (month < 1 || month > 12) {
                    System.out.println("Invalid format, 01-12 / 41-52 expected.");
                }
            }
            int day = Integer.parseInt(egn.substring(4, 6));
            if (day < 1 || day > 31) {
                System.out.println("Invalid format,  01-31 expected.");
            }

            this.egn = egn;
        }

        public int getMonthOfBirth() {
            return monthOfBirth;
        }

        public void setMonthOfBirth(int monthOfBirth) {
            this.monthOfBirth = monthOfBirth;
        }

        public int getDayOfBirth() {
            return dayOfBirth;
        }

        public void setDayOfBirth(int dayOfBirth) {
            this.dayOfBirth = dayOfBirth;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", yearOfBirth=" + yearOfBirth +
                    ", monthOfBirth=" + monthOfBirth +
                    ", egn='" + egn + '\'' +
                    ", dayOfBirth=" + dayOfBirth +
                    '}';
        }

        private void readObject(final ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            objectInputStream.defaultReadObject();
            // assume egn has already been validated
            if (getEgn() != null) {
                setYearOfBirth(Integer.parseInt(getEgn().substring(0, 2)));
                setMonthOfBirth(Integer.parseInt(getEgn().substring(2, 4)));
                setDayOfBirth(Integer.parseInt(getEgn().substring(4, 6)));
            }
        }
    }

    private enum Gender {
        MALE,
        FEMALE
    }
}

