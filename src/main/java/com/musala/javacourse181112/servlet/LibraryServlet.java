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
import java.util.ArrayList;
import java.util.List;

public class LibraryServlet extends HttpServlet {
    private static List<Person> personList = new ArrayList<>();
    private static List<Item> itemList = new ArrayList<>();
    private static List<ItemRent> rentedItemList = new ArrayList<>();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        final RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/jsp/library.jsp");
        final LibraryService libraryService = new LibraryService();

        makeLibrary();

        req.setAttribute("library", libraryService.generateLibrary("Biblioteka",
                "Aress1", personList, itemList, rentedItemList));

        dispatcher.forward(req, resp);
    }

    private static void makeLibrary() {


        final Person person = new Person();
        person.setName("Ivan");
        person.setEgn("1234567889");

        final Item book = new Book();
        book.setIsbn("987-1-123-12123123-0");
        book.setName("50 Shades of Java");

        final Item magazine = new Magazine();
        magazine.setName("Obekti");
        magazine.setId(15L);
        magazine.setIsbn("123-845-1234756-11");

        final ItemRent itemRent = new ItemRent();
        itemRent.setItem(book);
        itemRent.setDateOfRent(LocalDate.now());

        personList.add(person);
        itemList.add(book);
        itemList.add(magazine);
        rentedItemList.add(itemRent);

    }
}
