package com.musala.javacourse181112.tasks;

import java.io.*;

public class Company implements Serializable {
    private String person;
    private String company1;
    private String company2;

    // TODO: figure out why we need this interface surface
    public Company(final String p, final String c1, final String c2) throws IOException {
        person = p;
        company1 = c1;
        company2 = c2;

    }

    public static void main(final String[] args) {
        try (final OutputStream outputStream = new FileOutputStream("object.md");
             final ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream)) {

            final Company company = new Company("Ivan Dimitrov", "joijoi", "kpo");
            objectOutputStream.writeObject(company);

            System.out.println("Object has been serialized");
        } catch (IOException ex) {
            System.out.println("IOException is caught");
        }


        try (final InputStream inputStream = new FileInputStream("object.md");
             final ObjectInputStream objectInputStream = new ObjectInputStream(inputStream)) {

            final Company company = (Company) objectInputStream.readObject();
            objectInputStream.close();

            System.out.println("Object has been deserialized ");
            System.out.println("person = " + company.person);
            System.out.println("company 1 = " + company.company1);
            System.out.println("company 2 = " + company.company2);
        } catch (IOException e) {
            System.out.println("IOException is caught");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
