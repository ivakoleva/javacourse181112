package com.musala.javacourse181112.oop.libraryexercise;

import com.musala.javacourse181112.oop.libraryexercise.model.*;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class Application {

    private static final List<ItemRent> itemRentList = new ArrayList<>();
    private static List<Person> personList = new ArrayList<>();
    private static List<Item> itemList = new ArrayList<>();
    private static GregorianCalendar gc = new GregorianCalendar();

    /*public static void getDate(){
        int year = randBetween(2020, 2030);
        gc.set(Calendar.YEAR, year);

        int dayOfYear = randBetween(1, gc.getActualMaximum(Calendar.DAY_OF_YEAR));

        gc.set(Calendar.DAY_OF_YEAR, dayOfYear);
    }*/

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

        //-----------------------------------------

        ItemRent itemRent = new ItemRent();
        itemRent.setItem(book);
        itemRent.setDateOfRent(LocalDate.of(2019, Month.JANUARY, 10));
        itemRent.setDateOfReturn(itemRent.calculateReturnDate());
        itemRentList.add(itemRent);

        //----------------------------------------

        final Person person = new Person();
        person.setEgn("1234567890");
        person.setName("Ivan Ivanov");
        person.setRoleSet(EnumSet.of(Role.CLIENT));
        person.setItemRentSet(new HashSet<>());
        person.getItemRentSet().add(itemRent);
        person.setSubscriptionRenewalSet(LocalDate.of(2020, Month.FEBRUARY, 21));
        personList.add(person);

        final Person person1 = new Person();
        person1.setEgn("1234567891");
        person1.setName("Geroge Georgiev");
        person1.setRoleSet(EnumSet.of(Role.CLIENT));
        person1.setItemRentSet(new HashSet<>());
        person1.getItemRentSet().add(itemRent);
        person1.setSubscriptionRenewalSet(LocalDate.of(2020, Month.JUNE, 30));
        personList.add(person1);

        final Person person2 = new Person();
        person2.setEgn("1234567892");
        person2.setName("Dimitar Dimitrov");
        person2.setRoleSet(EnumSet.of(Role.CLIENT));
        person2.setItemRentSet(new HashSet<>());
        person2.getItemRentSet().add(itemRent);
        person2.setSubscriptionRenewalSet(LocalDate.of(2019, Month.DECEMBER, 15));
        personList.add(person2);

        //-----------------------------------------------------

        final Library library = new Library();
        library.setName("National Library");
        library.setAddress("Sofia 1504, bul. „Vasil Levski” 88");
        library.setPersonList(personList);
        library.setItemList(itemList);
        library.setItemRentList(itemRentList);

        library.printPersonList();

        System.out.println();
    }

    public static int randBetween(int start, int end) {
        return start + (int)Math.round(Math.random() * (end - start));
    }
}
