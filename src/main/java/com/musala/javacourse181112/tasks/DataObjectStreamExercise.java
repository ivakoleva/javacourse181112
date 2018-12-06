package com.musala.javacourse181112.tasks;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Iva Koleva on 29.11.2018
 */
public class DataObjectStreamExercise {
    public static void main(final String[] args) throws IOException, ClassNotFoundException {
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
        person.setName("Ivan Ivanov");
        person.setAge(30);
        person.setEgn("9910125555");
        final Person person1 = new Person();
        person1.setName("Maria Marinova");
        person1.setAge(40);
        person1.setEgn("7811254545");
        final Company company = new Company();
        company.setCompanyName("Cez");
        company.setCompanyAddress("Sofia, Bulgaria Blvd 55");
        final Company company1 = new Company();
        company1.setCompanyName("Bulsatkom");
        company1.setCompanyAddress("Sofia, Kozlodui Str. 66");

        try (final ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("objects_serialized"))) {
            objectOutputStream.writeObject(person);
            //objectOutputStream.reset();
            objectOutputStream.writeObject(person1);
            objectOutputStream.writeObject(company);
            objectOutputStream.writeObject(company1);
        }

        Person personDeserialized = null;
        Person personDeserialized1 = null;
        Company companyDeserialized = null;
        Company company1Deserialized = null;
        try (final ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("objects_serialized"))) {
            personDeserialized = (Person) objectInputStream.readObject();
            personDeserialized1 = (Person) objectInputStream.readObject();
            companyDeserialized = (Company) objectInputStream.readObject();
            company1Deserialized = (Company) objectInputStream.readObject();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        List<Object> list = new ArrayList<>();
        list.add(personDeserialized);
        list.add(personDeserialized1);
        list.add(companyDeserialized);
        list.add(company1Deserialized);
        for (Object element : list) {
            System.out.println(element);
        }
        /*System.out.println(personDeserialized != null ?
                personDeserialized.toString() :
                null);
        System.out.println(personDeserialized1 != null ?
                personDeserialized1.toString() :
                null);
        System.out.println(companyDeserialized != null ?
                companyDeserialized.toString() :
                null);
        System.out.println(company1Deserialized != null ?
                company1Deserialized.toString() :
                null);
        System.out.println();*/
    }

    private static class Company implements Serializable {
        private static final long serialVersionUID = 5456789064265433214L;
        private String companyName;
        private String companyAddress;

        public String getCom27panyName() {
            return companyName;
        }

        public void setCompanyName(String companyName) {
            this.companyName = companyName;
        }

        public String getCompanyAddress() {
            return companyAddress;
        }

        public void setCompanyAddress(String companyAddress) {
            this.companyAddress = companyAddress;
        }

        @Override
        public String toString() {
            return "Company name {" + companyName +
                    "} address {" + companyAddress +
                    "};";
        }
    }

    private static class Person implements Serializable {
        private static final long serialVersionUID = 5023965202399044512L;

        private String name;
        private Gender gender;
        private int age;
        private transient int yearOfBirth;
        private transient int dayOfBirth;
        private transient int monthOfBirth;

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

        // TODO: validate
        public void setEgn(String egn) {
            if (egn.length() > 10) {
                System.out.println("Error in entering egn for " + getName());
                System.exit(1);
            } else
                this.egn = egn;
        }

        @Override
        public String toString() {
            return "Person name [" + name +
                    "] age [" + age +
                    " yearOfBirth = " + yearOfBirth +
                    " monthOfBirth = " + monthOfBirth +
                    "]";
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
