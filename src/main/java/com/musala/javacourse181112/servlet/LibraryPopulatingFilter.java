package com.musala.javacourse181112.servlet;
/**
 * Library Web App - port Library exercise to a Web application, reusing existing code-base
 * ** add 2 Filters
 * *** populate Library & assign to request
 * *** populate Books to library inventory
 * *** map filters in a particular order, only before all URLs starting with "person"
 */

import com.musala.javacourse181112.oop.libraryexercise.model.Library;

import javax.servlet.*;
import java.io.IOException;

public class LibraryPopulatingFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(final ServletRequest servletRequest,
                         final ServletResponse servletResponse,
                         final FilterChain filterChain) throws IOException, ServletException {
        if (servletRequest.getAttribute("library") == null) {
            final Library library = new Library();
            library.setName("Sample library");
            servletRequest.setAttribute("library", library);
        }
    }

    @Override
    public void destroy() {

    }
}