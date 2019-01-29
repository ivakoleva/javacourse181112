package com.musala.javacourse181112.tasks.library_web_app;

import com.musala.javacourse181112.oop.libraryexercise.model.Book;
import com.musala.javacourse181112.oop.libraryexercise.model.Item;
import com.musala.javacourse181112.oop.libraryexercise.model.Library;

import javax.servlet.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BooksPopulatingFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(final ServletRequest servletRequest,
                         final ServletResponse servletResponse,
                         final FilterChain filterChain) throws IOException, ServletException {
        final Library library = (Library) servletRequest.getAttribute("library");
        assert library != null;

        List<Item> itemList = library.getItemList();
        if (itemList == null) {
            itemList = new ArrayList<>();
        }
        itemList.add(createNewBook());

        filterChain.doFilter(servletRequest, servletResponse);
    }

    private static Book createNewBook() {
        final Book book = new Book();
        book.setId((long) (Math.random() * 1000));
        book.setName(randomName());
        book.setIsbn("BG" + randomId(10));
        return book;
    }

    private static String randomName() {
        final int nameLength = (int) (Math.random() * 7 + 3);
        final StringBuilder builder = new StringBuilder();
        for (int i = 0; i < nameLength; i++) {
            builder.append((char) (int) (Math.random() * 26 + 97));
        }
        return builder.toString().substring(0, 1).toUpperCase() + builder.toString().substring(1);
    }

    private static String randomId(int indexOfLength) {
        final StringBuilder randomId = new StringBuilder();
        for (int i = 0; i < indexOfLength; i++) {
            randomId.append((char) (Math.random() * 9));
        }
        return randomId.toString();
    }


    @Override
    public void destroy() {

    }
}
