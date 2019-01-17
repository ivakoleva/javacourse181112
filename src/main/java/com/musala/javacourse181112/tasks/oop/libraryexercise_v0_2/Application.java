package com.musala.javacourse181112.tasks.oop.libraryexercise_v0_2;

import com.musala.javacourse181112.tasks.oop.libraryexercise_v0_2.model.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.*;

public class Application {
    /*
     *** Instantiate 3 Persons, each pearson with 3 SubscriptionRenewals with unique dateTimeOfPayment
     */

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

        final Library library = new Library();
        library.setName("National Library");
        library.setAddress("Sofia 1504, bul. „Vasil Levski” 88");
        library.setPersonList(personList);
        library.setItemList(itemList);
        library.setItemRentList(itemRentList);

        final Person person1 = new Person();
        final SubscriptionRenewal subscriptionRenewalPerson1 = new SubscriptionRenewal();
        subscriptionRenewalPerson1.setDateTimeOfPayment(LocalDateTime.now());
        person1.setName("Angel Angelov");
        person1.setEgn("9201384726");
        person1.setRoleSet(EnumSet.of(Role.CLIENT));
        person1.setSubscriptionRenewalSet(new HashSet<>());
        person1.getSubscriptionRenewalSet().add(subscriptionRenewalPerson1);
        personList.add(person1);

        final Person person2 = new Person();
        final SubscriptionRenewal subscriptionRenewalPerson2 = new SubscriptionRenewal();
        subscriptionRenewalPerson2.setDateTimeOfPayment(LocalDateTime.of(2018, Month.DECEMBER, 12, 15, 15));
        person2.setName("Ivan Ivanov");
        person2.setEgn("6549321000");
        person2.setRoleSet(EnumSet.of(Role.CLIENT));
        person2.setSubscriptionRenewalSet(new HashSet<>());
        person2.getSubscriptionRenewalSet().add(subscriptionRenewalPerson2);
        personList.add(person2);

        final Person person3 = new Person();
        final SubscriptionRenewal subscriptionRenewalPerson3 = new SubscriptionRenewal();
        subscriptionRenewalPerson3.setDateTimeOfPayment(LocalDateTime.of(2019, Month.JANUARY, 6, 10, 10));
        person2.setName("Dragan Draganov");
        person2.setEgn("7913659490");
        person2.setRoleSet(EnumSet.of(Role.CLIENT));
        person2.setSubscriptionRenewalSet(new HashSet<>());
        person2.getSubscriptionRenewalSet().add(subscriptionRenewalPerson3);
        personList.add(person3);


        library.printPersonList();

        System.out.println();
    }
}
