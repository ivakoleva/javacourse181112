package com.musala.javacourse181112.io;

import java.io.*;

/**
 * Created by Iva Koleva on 29.11.2018
 */
public class DataObjectStreamExample {
    public static void main(final String[] args) throws IOException {
        //dataStreamRun();
        objectStreamRun();
    }

    // reference types
    public static void objectStreamRun() throws IOException {
        final Person person = new Person();
        person.setName("Ivan Ivanov");
        person.setAge(30);
        final Person person1 = new Person();
        person1.setName("Maria Marinova");
        person1.setAge(40);
        person1.setEgn("7804111234");

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

    // primitive types
    public static void dataStreamRun() throws IOException {
        int i = 24;
        long l = Long.MAX_VALUE;
        float f = 1.5f;

        try (final DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream("data_serialized"))) {
            dataOutputStream.writeInt(i);
            dataOutputStream.writeLong(l);
            dataOutputStream.writeFloat(f);
        }

        try (final DataInputStream dataInputStream = new DataInputStream(new FileInputStream("data_serialized"))) {
            i = dataInputStream.readInt();
            l = dataInputStream.readLong();
            f = dataInputStream.readFloat();
        }
        System.out.println();
    }

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
           // return "Person name [" + name + "] age [" + age + "]";
            return "Answer name [" + name + "] age [" + age + "]";
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
