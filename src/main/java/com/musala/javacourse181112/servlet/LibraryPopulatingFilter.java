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
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        com.musala.javacourse181112.oop.libraryexercise.model.Library library = new com.musala.javacourse181112.oop.libraryexercise.model.Library();
        servletRequest.setAttribute("name", library);
    }

    @Override
    public void destroy() {

    }
}
