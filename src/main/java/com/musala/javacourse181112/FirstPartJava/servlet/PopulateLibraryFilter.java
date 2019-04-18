package com.musala.javacourse181112.FirstPartJava.servlet;

import com.musala.javacourse181112.FirstPartJava.oop.libraryexercise.model.Library;

import javax.servlet.*;
import java.io.IOException;
import java.util.Random;

public class PopulateLibraryFilter implements Filter {
    private static final Random random = new Random();

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(final ServletRequest request,
                         final ServletResponse servletResponse,
                         final FilterChain filterChain) throws IOException, ServletException {
        if (request.getAttribute("library") == null) {
            request.setAttribute("library", createNewLibrary());
        }
        filterChain.doFilter(request, servletResponse);
    }

    private static Library createNewLibrary() {
        final Library library = new Library();
        library.setName("Library " + random.nextInt());
        library.setAddress("Moon street");
        return library;
    }

    @Override
    public void destroy() {

    }
}
