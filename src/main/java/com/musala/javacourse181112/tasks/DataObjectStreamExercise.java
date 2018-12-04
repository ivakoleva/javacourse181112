package com.musala.javacourse181112.tasks;

import jdk.internal.org.objectweb.asm.commons.SerialVersionUIDAdder;

import java.io.*;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by Iva Koleva on 29.11.2018
 */
public class DataObjectStreamExercise {
    public static final int OBJECTS_COUT = 4;

    public static void main(final String[] args) throws IOException {
        dataObjectStreamRun();
        //lambdaSamplesRun();
    }

   /* public static void lambdaSamplesRun(){
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
        final Object[] objectsArray = new Object[OBJECTS_COUT];
        final Person person = new Person();
        person.setName("Ivan Ivanov");
        person.setAge(30);
        person.setEgn("9712035987");
        final Person person1 = new Person();
        person1.setName("Maria Marinova");
        person1.setAge(40);
        person1.setEgn("9607278987");
        final Company company = new Company();
        company.setName("McDonalds");
        company.setCompanyOwnerName("Richard Moris");
        company.setEmployees(100000);
        final Company company1 = new Company();
        company1.setName("Subway");
        company1.setCompanyOwnerName("Fred DeLuca");
        company1.setEmployees(1111111);
        try (final ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("objects_serialized"))) {
            objectOutputStream.writeObject(person);
            //objectOutputStream.reset();
            objectOutputStream.writeObject(person1);
            objectOutputStream.writeObject(company);
            objectOutputStream.writeObject(company1);
        }

     /*   Person personDeserialized = null;
        Person personDeserialized1 = null;
        Company companyDeserialized=null;
        Company companyDeserialized1=null;*/
        try (final ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("objects_serialized"))) {
            objectsArray[0] = objectInputStream.readObject();
            objectsArray[1] = objectInputStream.readObject();
            objectsArray[2] = objectInputStream.readObject();
            objectsArray[3] = objectInputStream.readObject();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        for (Object a : objectsArray) {
            System.out.println(a);

        }




       /* System.out.println(personDeserialized != null ?
                personDeserialized.toString() :
                null);
        System.out.println(personDeserialized1 != null ?
                personDeserialized1.toString() :
                null);
        System.out.println(companyDeserialized != null ?
                companyDeserialized.toString() :
                null);
        System.out.println(companyDeserialized1 != null ?
                companyDeserialized1.toString() :
                null);
        System.out.println();*/
    }


    public static class Company implements Serializable {

        private static final long serialVersionUID = -4972468635157517402L;
        private String name;
        private String companyOwnerName;
        private int employees;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCompanyOwnerName() {
            return companyOwnerName;
        }

        public void setCompanyOwnerName(String companyOwnerName) {
            this.companyOwnerName = companyOwnerName;
        }

        public int getEmployees() {
            return employees;
        }

        public void setEmployees(int employees) {
            this.employees = employees;
        }

        @Override
        public String toString() {
            return "Company{" +
                    "name='" + name + '\'' +
                    ", companyOwnerName='" + companyOwnerName + '\'' +
                    ", employees=" + employees +
                    '}';
        }
    }

    private static class Person implements Serializable {
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

        public String getEgn() {
            return egn;
        }

        // TODO: validate having problems with it
        public void setEgn(String egn) {
            if (egn.length() < 10) {
                System.out.println("Error in entering egn for " + getName());
                System.exit(1);
            } else
                this.egn = egn;
        }


        @Override
        public String toString() {
            return "Person " +
                    "name [" + name + "]" +
                    " age [" + age + "]" +
                    " yearOfBirth=" + yearOfBirth +
                    ", monthOfBirth=" + monthOfBirth +
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
