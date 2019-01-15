package com.musala.javacourse181112.tasks.libraryexercise;

import com.musala.javacourse181112.tasks.libraryexercise.model.Item;
import com.musala.javacourse181112.tasks.libraryexercise.model.ItemRent;
import com.musala.javacourse181112.tasks.libraryexercise.model.Person;
import com.musala.javacourse181112.tasks.libraryexercise.model.SubscriptionRenewal;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Application {

    private static final List<ItemRent> itemRentList = new ArrayList<>();
    private static List<Person> personList = new ArrayList<>();
    private static List<Item> itemList = new ArrayList<>();

    public static void main(final String[] args) {

        /*final Book book = new Book();
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

        library.printPersonList();*/

        SubscriptionRenewal subscriptionRenewal1 = new SubscriptionRenewal();
        subscriptionRenewal1.setDateTimeOfPayment(LocalDateTime.of(2001, Month.SEPTEMBER, 9, 12, 12, 12, 12));

        SubscriptionRenewal subscriptionRenewal2 = new SubscriptionRenewal();
        subscriptionRenewal2.setDateTimeOfPayment(LocalDateTime.of(2001, Month.SEPTEMBER, 9, 11, 12, 12, 13));

        SubscriptionRenewal subscriptionRenewal3 = new SubscriptionRenewal();
        subscriptionRenewal3.setDateTimeOfPayment(LocalDateTime.of(2001, Month.SEPTEMBER, 9, 12, 13, 12, 14));

        Set<SubscriptionRenewal> subscriptionRenewalSet1 = new LinkedHashSet<>(), subscriptionRenewalSet2 = new LinkedHashSet<>(), subscriptionRenewalSet3 = new LinkedHashSet<>();

        subscriptionRenewalSet1.add(subscriptionRenewal1);
        Person person1 = new Person();
        person1.setSubscriptionRenewalSet(subscriptionRenewalSet1);

        Person person2 = new Person();
        subscriptionRenewalSet2.add(subscriptionRenewal2);
        person2.setSubscriptionRenewalSet(subscriptionRenewalSet2);

        Person person3 = new Person();
        subscriptionRenewalSet3.add(subscriptionRenewal3);
        person3.setSubscriptionRenewalSet(subscriptionRenewalSet3);

        List<Person> people = new ArrayList<>();
        people.add(person1);
        people.add(person2);
        people.add(person3);
        people = Utils.sortPeopleByLatestSubscriptionRenewalDateTimeOfPayment(people);

        people.forEach(System.out::println);
        System.out.println();

        final List<Person> personListSorted = Utils.sortPeopleByLatestSubscriptionRenewalDateTimeOfPayment(
                IntStream.range(0, 3).boxed().map(i -> {
                    final Person p = new Person();
                    p.setSubscriptionRenewalSet(
                            IntStream.range(0, 3).boxed()
                                    .map(j -> {
                                        if ((j + i) % 2 == 0) {
                                            return LocalDateTime.now()
                                                    .minus((i * 10) + j, ChronoUnit.MONTHS)
                                                    .minus((i * 10) + j, ChronoUnit.DAYS);
                                        } else {
                                            return null;
                                        }
                                    })
                                    .map(localDateTime -> {
                                        final SubscriptionRenewal subscriptionRenewal = new SubscriptionRenewal();
                                        subscriptionRenewal.setDateTimeOfPayment(localDateTime);
                                        return subscriptionRenewal;
                                    })
                                    .collect(Collectors.toSet()));
                    return p;
                }).collect(Collectors.toList()));
        personListSorted.forEach(System.out::println);
        System.out.println();
    }
}
