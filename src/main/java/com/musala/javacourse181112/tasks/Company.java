package com.musala.javacourse181112.tasks;

import java.io.*;

public class Company implements Serializable {
    String person;
    String company1;
    String company2;

    public Company(String p, String c1, String c2 ) throws IOException {
        person = p;
        company1 = c1;
        company2 = c2;

    }

    public static void main(String[] args) {
        try {

            Company object = new Company("Ivan Dimitrov", "joijoi", "kpo");
            FileOutputStream file = new FileOutputStream("object.md");
            ObjectOutputStream out = new ObjectOutputStream(file);


            out.writeObject(object);

            out.close();
            file.close();

            System.out.println("Object has been serialized");
        } catch (IOException ex) {
            System.out.println("IOException is caught");
        }
        Company object1=null;
        try
        {
            FileInputStream file = new FileInputStream("object.md");
            ObjectInputStream in = new ObjectInputStream(file);


            object1 = (Company) in.readObject();


            in.close();
            file.close();

            System.out.println("Object has been deserialized ");
            System.out.println("person = " + object1.person);
            System.out.println("company 1 = " + object1.company1);
            System.out.println("company 2 = " + object1.company2);
        }

        catch(IOException ex)
        {
            System.out.println("IOException is caught");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
