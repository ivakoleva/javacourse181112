package com.musala.javacourse181112.tasks.libraryexercise2.libraryexercise;

import com.musala.javacourse181112.tasks.libraryexercise2.libraryexercise.model.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.*;

public class Application {

    private static final List<ItemRent> itemRentList = new ArrayList<>();
    private static List<Person> personList = new ArrayList<>();
    private static List<Item> itemList = new ArrayList<>();

    public static void main(final String[] args) {

        final Book book = new Book();
        book.setId(123L);
        book.setIsbn("978-619-7094-43-5");
        book.setName("Christmas");
        itemList.add(book);

        final Magazine magazine = new Magazine();
        magazine.setId(234L);
        magazine.setIsbn("987-654-3212-23-1");
        magazine.setName("Story");
        itemList.add(magazine);

        final Newspaper newspaper = new Newspaper();
        newspaper.setId(345L);
        newspaper.setIsbn("123-456-9890-11-2");
        newspaper.setName("24 Hours");
        itemList.add(newspaper);

        ItemRent itemRent = new ItemRent();
        itemRent.setItem(book);
        itemRent.setDateOfRent(LocalDate.of(2019, Month.JANUARY, 10));
        itemRent.setDateOfReturn(itemRent.calculateReturnDate());
        itemRentList.add(itemRent);

        final Person person = new Person();
        person.setEgn("1234567890");
        person.setName("Ivan Petrov");
        person.setRoleSet(EnumSet.of(Role.CLIENT));
        person.setItemRentSet(new HashSet<>());
        person.getItemRentSet().add(itemRent);
        personList.add(person);

        final Person person1 = createRandomClient();
        SubscriptionRenewal person1Sub = new SubscriptionRenewal();
        person1Sub.setDateTimeOfPayment
                (LocalDateTime.of(2019,01,01,10,23,21));
        person.setSubscriptionRenewalSet(new HashSet<>());
        person.getSubscriptionRenewalSet().add(person1Sub);

        final Person person2 = createRandomClient();
        SubscriptionRenewal person2Sub = new SubscriptionRenewal();
        person1Sub.setDateTimeOfPayment
                (LocalDateTime.of(2019,01,03,12,33,21));
        person.setSubscriptionRenewalSet(new HashSet<>());
        person.getSubscriptionRenewalSet().add(person2Sub);

        final Person person3 = createRandomClient();
        SubscriptionRenewal person3Sub = new SubscriptionRenewal();
        person1Sub.setDateTimeOfPayment
                (LocalDateTime.of(2019,01,06,13,43,41));
        person.setSubscriptionRenewalSet(new HashSet<>());
        person.getSubscriptionRenewalSet().add(person3Sub);

        final Library library = new Library();
        library.setName("National Library");
        library.setAddress("Sofia 1504, bul. „Vasil Levski” 88");
        library.setPersonList(personList);
        library.setItemList(itemList);
        library.setItemRentList(itemRentList);

        library.printPersonList();

        System.out.println();
    }

    private static Person createRandomClient() {
        final Person person = new Person();
        person.setEgn(randomEgn());
        person.setName(randomFullName(2));
        person.setRoleSet(EnumSet.of(Role.CLIENT));
        return person;
    }

    private static String randomEgn() {
        final StringBuilder egn = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            egn.append((char) (Math.random() * 9));
        }
        return egn.toString();
    }

    private static String randomFullName(int numberOfNames) {
        final StringBuilder fullName = new StringBuilder("");
        for (int i = 0; i < numberOfNames; i++) {
            fullName.append(randomName()).append(i != numberOfNames ? " " : "");
        }
        return fullName.toString();
    }

    private static String randomName() {
        final int nameLength = (int) (Math.random() * 7 + 3);
        final StringBuilder builder = new StringBuilder();
        for (int i = 0; i < nameLength; i++) {
            builder.append((char) (int) (Math.random() * 26 + 97));
        }
        return builder.toString().substring(0, 1).toUpperCase() + builder.toString().substring(1);
    }

    private  static SubscriptionRenewal randomSubscriptionRenewal(){
        SubscriptionRenewal randomSubscriptionRenewal = new SubscriptionRenewal();
        randomSubscriptionRenewal.setDateTimeOfPayment
                (LocalDateTime.of((int) (2000+18*Math.random()),(int)(12*Math.random()),(int) (28*Math.random()),(int) (24*Math.random()),(int) (60*Math.random()),(int) (60*Math.random())));
    }
}
