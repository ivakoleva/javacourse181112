package com.musala.javacourse181112.servlet;

import com.musala.javacourse181112.tasks.libraryexercise_v0_1.model.Book;
import com.musala.javacourse181112.tasks.libraryexercise_v0_1.model.Library;

import javax.servlet.*;
import java.io.IOException;
import java.util.ArrayList;

public class InventoryFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        final Library library = (Library) servletRequest.getAttribute("library");
        assert library != null;

        if (library.getItemList() == null) {
            library.setItemList(new ArrayList<>());
        }
        library.getItemList().add(createNewBook());

        filterChain.doFilter(servletRequest, servletResponse);
    }

    private static Book createNewBook() {
        final Book book = new Book();
        book.setUniqueId(123);
        book.setId(1234L);
        book.setIsbn("12345");
        book.setName("winnie the pooh");
        return book;
    }

    @Override
    public void destroy() {

    }
}
