package com.musala.javacourse181112.tasks.libraryexercise_v0_1;

import com.musala.javacourse181112.tasks.libraryexercise_v0_1.model.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.*;

public class Application {

    private static final List<ItemRent> itemRentList = new ArrayList<>();
    private static List<Person> personList = new ArrayList<>();
    private static List<Item> itemList = new ArrayList<>();
    private static Set<SubscriptionRenewal> subscriptionRenewalSet = new HashSet<>();

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

        final SubscriptionRenewal subscriptionRenewal1= new SubscriptionRenewal();
        subscriptionRenewal1.setDateTimeOfPayment(LocalDateTime.of(2018,Month.JULY,10,14,30));

        final SubscriptionRenewal subscriptionRenewal2= new SubscriptionRenewal();
        subscriptionRenewal2.setDateTimeOfPayment(LocalDateTime.of(2018,Month.MARCH,10,14,30));

        final SubscriptionRenewal subscriptionRenewal3= new SubscriptionRenewal();
        subscriptionRenewal3.setDateTimeOfPayment(LocalDateTime.of(2018,Month.AUGUST,10,14,30));

        subscriptionRenewalSet.add(subscriptionRenewal1);
        subscriptionRenewalSet.add(subscriptionRenewal2);
        subscriptionRenewalSet.add(subscriptionRenewal3);

        final Person person = new Person();
        person.setEgn("1234567890");
        person.setName("Ivan Petrov");
        person.setRoleSet(EnumSet.of(Role.CLIENT));
        person.setItemRentSet(new HashSet<>());
        person.getItemRentSet().add(itemRent);
        person.setSubscriptionRenewalSet(subscriptionRenewalSet);
        personList.add(person);

        final Library library = new Library();
        library.setName("National Library");
        library.setAddress("Sofia 1504, bul. „Vasil Levski” 88");
        library.setPersonList(personList);
        library.setItemList(itemList);
        library.setItemRentList(itemRentList);

        library.printPersonList();

        System.out.println();
    }
}