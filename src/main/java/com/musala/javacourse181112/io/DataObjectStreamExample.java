package com.musala.javacourse181112.io;

import java.io.*;

public class DataObjectStreamExample {
    public static void main(final String[] args) {
        int i = 24;
        long l = Long.MAX_VALUE;
        float f = 1.5f;

        try (final DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream("data_serializer.txt"))) {
            dataOutputStream.writeInt(i);
            dataOutputStream.writeLong(l);
            dataOutputStream.writeFloat(f);
        }

        try (final DataInputStream dataInputStream = new DataInputStream(new FileInputStream("data_serializer.txt"))) {
            i = dataInputStream.readInt();
            l = dataInputStream.readLong();
            f = dataInputStream.readFloat();

            System.out.println();
        }
    }

    private static class Person {
        String name;
        int age;

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
    }
}
