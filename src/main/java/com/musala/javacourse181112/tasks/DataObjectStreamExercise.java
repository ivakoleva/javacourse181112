package com.musala.javacourse181112.tasks;

import java.io.*;

/**
 * Created by Iva Koleva on 29.11.2018
 */
public class DataObjectStreamExercise {
    public static void main(final String[] args) throws IOException {
        dataObjectStreamRun();
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

    // TODO: class Company

    private static class Person implements Serializable {
        private static final long serialVersionUID = 5023965202399044512L;

        String name;
        int age;
        transient int yearOfBirth;
        // TODO: monthOfBirth && dayOfBirth (transient)
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

        @Override
        public String toString() {
            return "Person name [" + name + "] age [" + age + "]";
        }

        private void readObject(final ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            objectInputStream.defaultReadObject();
            // assume egn has already been validated
            if (getEgn() != null) {
                setYearOfBirth(Integer.parseInt(getEgn().substring(0, 2)));
                // TODO: implement for other 2 fields
            }
        }
    }
}
