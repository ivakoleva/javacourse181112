package com.musala.javacourse181112.tasks;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class DataObjectStreamExercise {
    public static void main(final String[] args) throws IOException {
        //dataObjectStreamRun();
        //lambdaSamplesRun();
        writeAndReadCompanyObjects();
    }

    public static void writeAndReadCompanyObjects() {
        List<Company> companiesList = IntStream.range(0, 10)
                .boxed()
                .map(integer -> {
                    final Company company = new Company();
                    company.setNumberOfWorkers(integer * 10 + integer);
                    company.setName("Name" + integer);
                    company.setOwnerName(new Person());
                    return company;
                }).collect(Collectors.toList());
        System.out.println("From List:");
        companiesList.forEach(i -> System.out.print(i + " "));
        System.out.println();
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("CompanyTest.txt"))) {
            companiesList.forEach(i -> {
                try {
                    objectOutputStream.writeObject(i);
                } catch (IOException ig) {
                    ig.printStackTrace();
                }
            });
        } catch (Exception ignore) {
        }
        List<Company> newObjectList = new ArrayList<>();
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("CompanyTest.txt"))) {
            Company buff = null;
            while ((buff = (Company) objectInputStream.readObject()) != null) {
                newObjectList.add(buff);
            }
        } catch (Exception ignore) {
        }
        newObjectList.forEach(System.out::println);
    }

    public static void lambdaSamplesRun() {
        final List<Person> personList = IntStream.range(0, 10)
                .boxed()
                .map(integer -> {
                    final Person person = new Person();
                    person.setAge(integer * 10 + integer);
                    person.setName("Name" + integer);
                    person.setGender(integer % 2 != 0 ? Gender.MALE : Gender.FEMALE);
                    return person;
                }).collect(Collectors.toList());
        System.out.println();

        final List<Person> personSubList = personList.stream()
                .filter(person -> person.getAge() % 2 != 0)
                .collect(Collectors.toList());
        System.out.println();
    }

    public static void dataObjectStreamRun() throws IOException {
        final Person person = new Person();
        person.setName("Ivan Ivanov");
        person.setAge(30);
        final Person person1 = new Person();
        person1.setName("Maria Marinova");
        person1.setAge(40);

        try (final ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("objects_serialized"))) {
            objectOutputStream.writeObject(person);
            //objectOutputStream.reset();
            objectOutputStream.writeObject(person1);
        }

        Person personDeserialized = null;
        Person personDeserialized1 = null;
        try (final ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("objects_serialized"))) {
            personDeserialized = (Person) objectInputStream.readObject();
            personDeserialized1 = (Person) objectInputStream.readObject();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(personDeserialized != null ?
                personDeserialized.toString() :
                null);
        System.out.println(personDeserialized1 != null ?
                personDeserialized1.toString() :
                null);
        System.out.println();
    }

    private static class Company implements Serializable {
        private String name;
        transient private int numberOfWorkers;
        transient private Person ownerName;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getNumberOfWorkers() {
            return numberOfWorkers;
        }

        public void setNumberOfWorkers(int numberOfWorkers) {
            this.numberOfWorkers = numberOfWorkers;
        }

        public Person getOwnerName() {
            return ownerName;
        }

        public void setOwnerName(Person ownerName) {
            this.ownerName = ownerName;
        }

        @Override
        public String toString() {
            return "Company name: " + name;
        }

        private void readObject(final ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            objectInputStream.defaultReadObject();
        }

        private void writeObject(final ObjectOutputStream objectOutputStream) throws IOException, ClassNotFoundException {
            objectOutputStream.defaultWriteObject();
        }
    }

    private static class Person implements Serializable {
        private static final long serialVersionUID = 5023965202399044512L;

        private String name;
        private Gender gender;
        private int age;
        private transient int yearOfBirth;
        transient private int monthOfBirth;
        transient private int dayOfBirth;
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

        public int getMonthOfBirth() {
            return monthOfBirth;
        }

        public int getDayOfBirth() {
            return dayOfBirth;
        }

        public void setDayOfBirth(int dayOfBirth) {
            this.dayOfBirth = dayOfBirth;
        }

        public void setMonthOfBirth(int monthOfBirth) {
            this.monthOfBirth = monthOfBirth;
        }

        public void setYearOfBirth(int yearOfBirth) {
            this.yearOfBirth = yearOfBirth;
        }

        public String getEgn() {
            return egn;
        }

        public void setEgn(String egn) {
            if (Pattern.matches("^[0-9]{10}$", egn)) {
                this.egn = egn;
            } else {
                System.out.println("EGN not valid!");
            }
        }

        @Override
        public String toString() {
            return "Person name [" + name + "] age [" + age + "]";
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

        private void writeObject(final ObjectOutputStream objectOutputStream) throws IOException, ClassNotFoundException {
            objectOutputStream.defaultWriteObject();
        }
    }

    private enum Gender {
        MALE,
        FEMALE
    }
}
