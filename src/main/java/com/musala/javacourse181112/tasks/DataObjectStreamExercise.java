package com.musala.javacourse181112.tasks;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class DataObjectStreamExercise {
    public static void main(final String[] args) throws IOException {
        dataObjectStreamRun();
        writeAndReadCompanyObjects();
    }
    public static void writeAndReadCompanyObjects() {
        List<Company> companiesList = IntStream.range(0, 10)
                .boxed()
                .map(integer -> {
                    final Company company = new Company();
                    company.setName("Name" + integer);
                    company.setPersonName(new Person());
                    return company;
                }).collect(Collectors.toList());
        System.out.println("From List:");
        companiesList.forEach(i -> System.out.print(i + " "));
        System.out.println();
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("Company.txt"))) {
            companiesList.forEach(i -> {
                try {
                    objectOutputStream.writeObject(i);
                } catch (IOException ig) {
                    ig.printStackTrace();
                }
            });
        } catch (Exception ignore) {
        }
        List<Company> companyArrayList = new ArrayList<>();
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("Company.txt"))) {
            Company buff ;
            while ((buff = (Company) objectInputStream.readObject()) != null) {
                companyArrayList.add(buff);
            }
        } catch (Exception ignore) {
        }
        companyArrayList.forEach(System.out::println);
    }

    public static void dataObjectStreamRun() throws IOException {
        final Person person = new Person();
        person.setName("Ivan Ivanov");
        person.setAge(30);
        final Person person1 = new Person();
        person1.setName("Maria Marinova");
        person1.setAge(40);
        final Company company = new Company();
        company.setName("CompanyName");
        company.setPersonName(person);
        final Company company1 = new Company();
        company.setName("CompanyName1");
        company.setPersonName(person1);

        try (final ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("objects_serialized"))) {
            objectOutputStream.writeObject(company);
            objectOutputStream.writeObject(company1);
            objectOutputStream.writeObject(person);
            //objectOutputStream.reset();
            objectOutputStream.writeObject(person1);
        }

        Person personDeserialized = null;
        Person personDeserialized1 = null;
        Company companyDeserialized = null;
        Company companyDeserialized1 = null;

        try (final ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("objects_serialized"))) {
            personDeserialized = (Person) objectInputStream.readObject();
            personDeserialized1 = (Person) objectInputStream.readObject();
            companyDeserialized = (Company) objectInputStream.readObject();
            companyDeserialized1 = (Company) objectInputStream.readObject();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(personDeserialized != null ?
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
        System.out.println();
    }


    private static class Person implements Serializable {
        private static final long serialVersionUID = 5023965202399044512L;

        String name;
        int age;
        transient int yearOfBirth;
        transient private int monthOfBirth;
        transient private int dayOfBirth;
        String egn;

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

        public int getYearOfBirth() { return yearOfBirth; }

        public void setYearOfBirth(int yearOfBirth) { this.yearOfBirth = yearOfBirth; }

        public int getMonthOfBirth() { return monthOfBirth; }

        public void setMonthOfBirth(int monthOfBirth) { this.monthOfBirth = monthOfBirth; }

        public int getDayOfBirth() { return dayOfBirth; }

        public void setDayOfBirth(int dayOfBirth) { this.dayOfBirth = dayOfBirth; }

        public String getEgn() { return egn; }

        public void setEgn(String egn) {
            if (Pattern.matches("^[0-9]{10}$", egn)) {
                this.egn = egn;}else{
                System.out.println("The EGN isn't valid");
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
                setMonthOfBirth(Integer.parseInt(getEgn().substring(2,4)));
                setDayOfBirth(Integer.parseInt(getEgn().substring(4,6)));
            }
        }
        private void writeObject(final ObjectOutputStream objectOutputStream) throws IOException, ClassNotFoundException {
            objectOutputStream.defaultWriteObject();
        }
    }
    private static class Company implements Serializable {
        private String name;
        transient private Person personName;

        public void setName(String name) {
            this.name = name;
        }

        public void setPersonName(Person personName) {
            this.personName = personName;
        }

        public String getName() {
            return name;
        }

        public Person getPersonName() {
            return personName;
        }

        @Override
        public String toString(){
            return "Name of company" + name;
        }

        private void readObject(final ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            objectInputStream.defaultReadObject();
        }


        private void writeObject(final ObjectOutputStream objectOutputStream) throws IOException, ClassNotFoundException {
            objectOutputStream.defaultWriteObject();
        }
    }
}
