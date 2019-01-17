package com.musala.javacourse181112.oop.libraryexercise;

import com.musala.javacourse181112.oop.libraryexercise.model.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

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

        final Library library = new Library();
        library.setName("National Library");
        library.setAddress("Sofia 1504, bul. „Vasil Levski” 88");
        library.setPersonList(personList);
        library.setItemList(itemList);
        library.setItemRentList(itemRentList);

        library.printPersonList();

        System.out.println();

        final List<Person> personListSorted = Utils.sortPeopleByLatestSubscriptionRenewalDateTimeOfPayment(
                IntStream.range(0, 3).boxed().map(i -> {
                    final Person p = new Person();
                    p.setSubscriptionRenewalSet(
                            IntStream.range(0, 3).boxed()
                                    .map(j -> j % 2 == 0 ?
                                            LocalDateTime.now()
                                                    .minus((i * 10) + j, ChronoUnit.MONTHS)
                                                    .minus((i * 10) + j, ChronoUnit.DAYS) :
                                            null
                                    ).map(localDateTime -> {
                                final SubscriptionRenewal subscriptionRenewal = new SubscriptionRenewal();
                                subscriptionRenewal.setDateTimeOfPayment(localDateTime);
                                return subscriptionRenewal;
                            })
                                    .collect(Collectors.toSet()));
                    return p;
                }).collect(Collectors.toList()));
        System.out.println();
    }
}
