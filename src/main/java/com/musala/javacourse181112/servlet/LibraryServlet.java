package com.musala.javacourse181112.servlet;

import com.musala.javacourse181112.oop.libraryexercise.LibraryService;
import com.musala.javacourse181112.oop.libraryexercise.model.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class LibraryServlet extends HttpServlet {
    private static final List<Person> personList = new ArrayList<>();
    private static final List<Item> itemList = new ArrayList<>();
    private static final List<ItemRent> itemRentList = new ArrayList<>();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        final RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/jsp/library.jsp");
        final LibraryService libraryService = new LibraryService();
        populatingData();


        req.setAttribute("library",
                libraryService.generateLibrary("National Library", "Sofia 1234", personList, itemList, itemRentList));

        dispatcher.forward(req, resp);
    }

    private static void populatingData() {
        final Person person = new Person();
        person.setName("Ivan");
        person.setEgn("1111111111");
        personList.add(person);

        final Person person1 = new Person();
        person1.setEgn("2222222222");
        person1.setName("Gosho");
        personList.add(person1);

        final Item item = new Book();
        item.setIsbn("192-2131-231-123");
        item.setName("Nice book");
        item.setId(123456L);
        itemList.add(item);

        final Item item1 = new Magazine();
        item1.setId(131221L);
        item1.setName("Story");
        item1.setIsbn("3122-123-122");
        itemList.add(item1);

        final ItemRent itemRent = new ItemRent();
        itemRent.setItem(item);
        itemRent.setDateOfRent(LocalDate.of(2018, Month.JULY, 15));
        itemRentList.add(itemRent);
    }
}
