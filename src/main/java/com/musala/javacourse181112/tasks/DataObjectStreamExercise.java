package com.musala.javacourse181112.tasks;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Iva Koleva on 29.11.2018
 */
// good
public class DataObjectStreamExercise {
    public static void main(final String[] args) throws IOException, ClassNotFoundException {
        dataObjectStreamRun();
    }

    public static void dataObjectStreamRun() throws IOException, ClassNotFoundException {
        final Person person = new Person();
        person.setName("Ivan Ivanov");
        person.setEgn("9505101111");
        final Person person1 = new Person();
        person1.setName("Maria Marinova");
        person1.setEgn("8512233040");

        final Company company = new Company();
        company.setCompanyName("Shell");
        company.setCompanyAddress("Tzarigradsko Shose Blvd., 1784 Mladost 1, Sofia");
        final Company company1 = new Company();
        company1.setCompanyName("OMW");
        company1.setCompanyAddress("Tsarigradsko shose Blvd., 1784 Gorublyane, Sofia");

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
       /* System.out.println(personDeserialized != null ? personDeserialized.toString() : null);
        System.out.println(personDeserialized1 != null ? personDeserialized1.toString() : null);
        System.out.println(companyDeserialized != null ? companyDeserialized.toString() : null);
        System.out.println(company1Deserialized != null ? company1Deserialized.toString() : null);
        System.out.println();*/
    }

    private static class Company implements Serializable {
        private static final long serialVersionUID = -5038334803141053541L;

        private String companyName;
        private String companyAddress;

        public String getCompanyName() {
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

        public String toString() {
            return "Company name [" + companyName + "] address [" + companyAddress + "]";
        }
    }

    private static class Person implements Serializable {
        private static final long serialVersionUID = 5023965202399044512L;

        private String name;
        private int age;
        transient private int yearOfBirth;
        transient private int monthOfBirth;
        transient private int dayOfBirth;
        private String egn;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
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

        public void checkEgn(final String egn) {
            if (egn.length() != 10) {
                System.out.println("Expected length of 10, actual:" + egn.length());
                System.exit(1);
            }
            try {
                Long.parseLong(egn);
            } catch (NumberFormatException ex) {
                System.out.println("EGN should contain only numbers!");
                System.exit(1);
            }

            final int year = Integer.parseInt(egn.substring(0, 2));
            if (year < 0 || year > 99) {
                System.out.println("Expected year between 00..99,  actual:" + year);
                System.exit(1);
            }

            final int month = Integer.parseInt(egn.substring(2, 4));
            if (month < 1 || month > 12) {
                System.out.println("Month should be between 1..12,  actual:" + month);
                System.exit(1);
            }

            final int day = Integer.parseInt(egn.substring(4, 6));
            if (day < 1 || day > 31) {
                System.out.println("Invalid day " + day);
                System.exit(1);
            }
        }

        public void setEgn(final String egn) {
            checkEgn(egn);
            this.egn = egn;
        }

        @Override
        public String toString() {
            return "Person name [" + name + "] EGN [" + egn + "]" + " year of birth [" + yearOfBirth + "]" + " month [" + monthOfBirth + "]" +
                    " day [" + dayOfBirth + "]";
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
}
