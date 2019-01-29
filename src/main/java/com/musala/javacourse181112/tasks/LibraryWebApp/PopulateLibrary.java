package com.musala.javacourse181112.tasks.LibraryWebApp;

import com.musala.javacourse181112.oop.libraryexercise.model.Library;

import javax.servlet.*;
import java.io.IOException;


public class PopulateLibrary implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(final ServletRequest servletRequest, final ServletResponse servletResponse, final FilterChain filterChain) throws IOException, ServletException {
        if (servletRequest.getAttribute("library") == null) {
            servletRequest.setAttribute("library", createNewLibrary());
        }
        filterChain.doFilter(servletRequest, servletResponse);
    }
    private static Library createNewLibrary() {
        final Library library = new Library();
        library.setName("Library " + ((char) (int) (Math.random() * 26 + 97)));
        library.setAddress("Address"+((char) (int) (Math.random() * 26 + 97)));
        return library;
    }

    @Override
    public void destroy() {

    }

}