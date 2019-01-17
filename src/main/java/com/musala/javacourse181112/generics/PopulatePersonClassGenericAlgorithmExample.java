package com.musala.javacourse181112.generics;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Created by Iva Koleva on 18.12.2018
 */
public class PopulatePersonClassGenericAlgorithmExample {
    public static void main(final String[] args) throws IOException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException, URISyntaxException {
            /*final Answer person = new Answer();
        person.setName("Ivan Ivanov");
        person.setEgn("9012121234");

        final Company company = new Company();
        company.setName("MusalaSoft");
        company.setEik("123456789");

         final Set<Person> personSet = new HashSet<>();
        personSet.add(person);
        company.setEmployeeSet(personSet);

        person.setCompany(company);*/


        final Person personFromFile = populateEntity(
                Paths.get(PopulatePersonClassGenericAlgorithmExample.class.getClassLoader().getResource("person_ivan_ivanov.txt").toURI()),
                Person.class);
        System.out.println();

        /*final Collection<Company> companiesFromFile =
                populateEntities(Company.class, "company_musalasoft.txt", "");*/
    }

    public static <T extends Entity> T populateEntity(final Path path, Class<T> entityClass) throws IOException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        assert path != null;
        assert entityClass != null;

        // parse file
        final Map<String, String> map = Files.readAllLines(path).stream()
                .filter(line -> {
                    final int i = line.indexOf("=") + 1;
                    return i > 1 && i < line.length();
                })
                .collect(Collectors.toMap(
                        line -> line.substring(0, line.indexOf("=")),
                        line -> line.substring(line.indexOf("=") + 1)
                ));

        final T entity = entityClass.getDeclaredConstructor().newInstance();

        final Field[] fields = entityClass.getDeclaredFields();
        Arrays.stream(fields)
                .filter(field -> map.keySet().contains(field.getName()))
                .peek(field -> field.setAccessible(true))
                .forEach(field -> {
                    try {
                        field.set(entity, parseValueFromString(field.getType(), map.get(field.getName())));
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                });

        return entity;
    }

    public static <T> T parseValueFromString(final Class<T> clazz, final String value) {
        if (String.class.equals(clazz)) {
            return (T) value;
        } else if (Integer.class.equals(clazz)) {
            return (T) Integer.valueOf(value);
        }
        throw new UnsupportedOperationException();
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

    public Company(String name) {
        this.name = name;
    }

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