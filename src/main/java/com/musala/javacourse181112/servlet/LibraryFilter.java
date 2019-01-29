package com.musala.javacourse181112.servlet;

import com.musala.javacourse181112.tasks.libraryexercise_v0_1.model.Library;

import javax.servlet.*;
import java.io.IOException;
import java.util.ArrayList;

public class LibraryFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(final ServletRequest servletRequest,
                         final ServletResponse servletResponse,
                         final FilterChain filterChain) throws IOException, ServletException {
        if (servletRequest.getAttribute("library") == null) {
            servletRequest.setAttribute("library", createNewLibrary());
        }
        filterChain.doFilter(servletRequest, servletResponse);
    }

    private static Library createNewLibrary() {
        final Library library = new Library();
        library.setName("National library");
        library.setAddress("123 street");
        library.setItemList(new ArrayList<>());
        library.setPersonList(new ArrayList<>());
        library.setItemRentList(new ArrayList<>());
        return library;
    }

    @Override
    public void destroy() {

    }
}
