package com.musala.javacourse181112.tasks.libraryexercise_v0_1;

import com.musala.javacourse181112.tasks.libraryexercise_v0_1.model.*;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Application {

    private static final List<ItemRent> itemRentList = new ArrayList<>();
    private static List<Person> personList = new ArrayList<>();
    private static List<Item> itemList = new ArrayList<>();

    public static void main(final String[] args) {

        final Book book = new Book();
        book.setId(123L);
        book.setISBN("978-619-7094-43-5");
        book.setName("Christmas");
        itemList.add(book);

        final Magazine magazine = new Magazine();
        magazine.setId(234L);
        magazine.setISBN("987-654-3212-23-1");
        magazine.setName("Story");
        itemList.add(magazine);

        final Newspaper newspaper = new Newspaper();
        newspaper.setId(345L);
        newspaper.setISBN("123-456-9890-11-2");
        newspaper.setName("24 Hours");
        itemList.add(newspaper);

        ItemRent itemRent = new ItemRent();
        itemRent.setItem(book);
        itemRent.setDateOfHiring(LocalDate.of(2019, Month.JANUARY, 10));
        itemRent.setReturnDate(itemRent.calculateReturnDate());
        itemRentList.add(itemRent);

        final Person person = new Person();
        person.setEgn("1234567890");
        person.setName("Ivan Petrov");
        person.setRole(Roles.CLIENT);
        person.setItemRent(itemRent);
        personList.add(person);

        final Library library = new Library();
        library.setName("National Library");
        library.setAddress("Sofia 1504, bul. „Vasil Levski” 88");
        library.setPersonList(personList);
        library.setItemsList(itemList);
        library.setItemRentList(itemRentList);

        library.printPersonList();
    }
}
