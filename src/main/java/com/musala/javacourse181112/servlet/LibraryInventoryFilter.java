package com.musala.javacourse181112.servlet;

import com.musala.javacourse181112.oop.libraryexercise.model.Book;
import com.musala.javacourse181112.oop.libraryexercise.model.Item;
import com.musala.javacourse181112.oop.libraryexercise.model.Library;

import javax.servlet.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LibraryInventoryFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest,
                         ServletResponse servletResponse,
                         FilterChain filterChain) throws IOException, ServletException {

        final Library library = new Library();

        if (servletRequest.getAttribute("item") == null) {
            final List<Item> itemList = new ArrayList<>();

            final Book book = new Book();
            book.setId(12345679L);
            book.setIsbn("123-3-21-213");
            book.setName("First book");

            itemList.add(book);
            library.setItemList(itemList);
            servletRequest.setAttribute("item", book);
        }
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {

    }
}
