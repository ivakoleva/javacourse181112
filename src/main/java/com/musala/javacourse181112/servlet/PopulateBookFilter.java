package com.musala.javacourse181112.servlet;

import com.musala.javacourse181112.oop.libraryexercise.model.Book;
import com.musala.javacourse181112.oop.libraryexercise.model.Item;
import com.musala.javacourse181112.oop.libraryexercise.model.Library;

import javax.servlet.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PopulateBookFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        Library library = (Library) request.getAttribute("library");
        List<Item> itemList = library.getItemList();

        if (itemList != null) {
            itemList.add(createNewBook());
        } else {
            itemList = new ArrayList<>();
        }

        request.setAttribute("BookList", itemList);
        filterChain.doFilter(request, servletResponse);
    }


    private Book createNewBook() {
        Book book = new Book();
        Random random = new Random();
        book.setId(random.nextLong());
        book.setName("Bla bla best seller");
        book.setIsbn("BG" + random.nextLong() + "Book");
        return book;
    }

    @Override
    public void destroy() {

    }
}