package com.musala.javacourse181112.generics;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Iva Koleva on 18.12.2018
 */
public class PopulatePersonClassGenericAlgorithmExample {
    public static void main(final String[] args) {
        final Person person = new Person();
        person.setName("Ivan Ivanov");
        person.setEgn("9012121234");

        final Company company = new Company();
        company.setName("MusalaSoft");
        company.setEik("123456789");

        final Set<Person> personSet = new HashSet<>();
        personSet.add(person);
        company.setEmployeeSet(personSet);

        person.setCompany(company);


        final Person personFromFile =
                populateEntity("person_ivan_ivanov.txt", Person.class);

        /*final Collection<Company> companiesFromFile =
                populateEntities(Company.class, "company_musalasoft.txt", "");*/
    }

    public static <T extends Entity> T populateEntity(
            final String filename,
            Class<T> entityClass) {
        //TODO
        return null;
    }

    /*public static <T extends Entity> Collection<T> populateEntities(final Class<T> entityClass, final String... filenames) {
        // TODO
    }*/
}

interface Entity {
}

class Person implements Entity {
    private String name;
    private String egn;
    private Company company;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEgn() {
        return egn;
    }

    public void setEgn(String egn) {
        this.egn = egn;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
}

class Company implements Entity {
    private String name;
    private String eik;
    private Set<Person> employeeSet;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEik() {
        return eik;
    }

    public void setEik(String eik) {
        this.eik = eik;
    }

    public Set<Person> getEmployeeSet() {
        return employeeSet;
    }

    public void setEmployeeSet(Set<Person> employeeSet) {
        this.employeeSet = employeeSet;
    }
}