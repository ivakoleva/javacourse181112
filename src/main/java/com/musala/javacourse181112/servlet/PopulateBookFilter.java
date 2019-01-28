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
    private static final Random random = new Random();

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(final ServletRequest request,
                         final ServletResponse servletResponse,
                         final FilterChain filterChain) throws IOException, ServletException {
        final Library library = (Library) request.getAttribute("library");
        assert library != null;

        List<Item> itemList = library.getItemList();
        if (itemList == null) {
            itemList = new ArrayList<>();
        }
        itemList.add(createNewBook());

        filterChain.doFilter(request, servletResponse);
    }


    private static Book createNewBook() {
        final Book book = new Book();
        book.setId(random.nextLong());
        book.setName("Bla bla best seller");
        book.setIsbn("BG" + random.nextLong() + "Book");
        return book;
    }

    @Override
    public void destroy() {

    }
}