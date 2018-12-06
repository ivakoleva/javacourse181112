package com.musala.javacourse181112.tasks;

import com.sun.org.apache.xpath.internal.operations.String;

import java.io.*;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by Iva Koleva on 29.11.2018
 */
public class DataObjectStreamExercise {
    public static void main(final String[] args) throws IOException {

        dataObjectStreamRun();
        //lambdaSamplesRun();
    }

    /*public static void lambdaSamplesRun(){
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
    }*/

    public static void dataObjectStreamRun() throws IOException {
        final Person person = new Person();
        final Company company = new Company();
        person.setName("Ivan Ivanov");
        person.setAge(30);
        person.setEgn("8812231234");
        Company.setCompanyName("MusalaSoft");

        final Person person1 = new Person();
        final Company company1 = new Company();

        person1.setName("Maria Marinova");
        person1.setAge(40);
        person1.setEgn("7805239876");
        Company.setCompanyName("MusalaSoft");

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

    // TODO: class Company
    private static class Company implements Serializable{
        private static final long serialVersionUID = -9209116010299084187L;
        private String companyName;
        public String getCompanyName(){
            return companyName;
        }

        public void setCompanyName(String companyName){
            this.companyName = companyName;
        }
        public String toString() {
            return("Company name:" + companyName);
    }

    private static class Person implements Serializable { //marker interface
        private static final long serialVersionUID = 5023965202399044512L;

        private String name;
        private Gender gender;
        private int age;
        private transient int yearOfBirth;
        private transient int monthOfBirth;
        private transient int dayOfBirth;
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

        // TODO: validate
        public void setEgn(String egn) {
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
            return ("Person{" + "name='" + name + '\'' +
                    ", gender=" + gender +
                    ", age=" + age +
                    ", yearOfBirth=" + yearOfBirth +
                    ", monthOfBirth=" + monthOfBirth +
                    ", dayOfBirth=" + dayOfBirth +
                    ", egn='" + egn + '\'' +
                    '}');
        }

        private void readObject(final ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            objectInputStream.defaultReadObject();
            // assume egn has already been validated
            if (getEgn() != null) {
                setYearOfBirth(Integer.parseInt(getEgn().substring(0,2)));
                setMonthOfBirth(Integer.parseInt(getEgn().substring(2,4)));
                setDayOfBirth(Integer.parseInt(getEgn().substring(4,6)));
            }
        }
    }

    private enum Gender {
        MALE,
        FEMALE
    }
}
