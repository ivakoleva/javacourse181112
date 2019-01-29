package com.musala.javacourse181112.servlet;


import com.musala.javacourse181112.oop.libraryexercise.model.Book;
import com.musala.javacourse181112.oop.libraryexercise.model.Library;

import javax.servlet.*;
import java.io.IOException;
import java.util.ArrayList;

public class BookPopulatingFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(final ServletRequest servletRequest,
                         final ServletResponse servletResponse,
                         final FilterChain filterChain) throws IOException, ServletException {
        final Library library = (Library) servletRequest.getAttribute("library");
        assert library != null;

        final Book book = new Book();
        book.setName("Sample book");
        // TODO: populate properties; maybe extract generateLibrary() to LibraryService

        if(library.getItemList() == null) {
            library.setItemList(new ArrayList<>());
        }
        library.getItemList().add(book);
    }


    @Override
    public void destroy() {

    }
}
