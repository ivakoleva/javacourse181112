package com.musala.javacourse181112.servlet;

import javax.servlet.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.musala.javacourse181112.tasks.libraryexercise_v0_1.model.Book;
import com.musala.javacourse181112.tasks.libraryexercise_v0_1.model.Library;
import com.musala.javacourse181112.tasks.libraryexercise_v0_1.model.Item;

public class InventoryFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        Library library = (Library) servletRequest.getAttribute("item");
        assert library != null;

        if (library.getItemList() == null) {
           library.getItemList();
        }
        library.getItemList().add(createNewBook());

        filterChain.doFilter(servletRequest, servletResponse);
    }

    private static Book createNewBook() {
        Book book = new Book();
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
