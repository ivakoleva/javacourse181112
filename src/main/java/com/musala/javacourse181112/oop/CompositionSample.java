package com.musala.javacourse181112.oop;

/**
 * Created by Iva Koleva on 08.01.2019
 */
public class CompositionSample {
    public static void main(final String[] args) {
        final Person person = new Person();
        person.setName("Name");
        final User user = new User();
        user.setPerson(person);
    }
}

class Person {
    private String name;
    private String family;
    private String egn;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getEgn() {
        return egn;
    }

    public void setEgn(String egn) {
        this.egn = egn;
    }
}

class User {
    private String username;
    private String password;
    private Person person; // composition

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
