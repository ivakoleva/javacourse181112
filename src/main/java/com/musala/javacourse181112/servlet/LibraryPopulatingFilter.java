package com.musala.javacourse181112.servlet;


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
            // TODO: populate properties; maybe extract generateLibrary() to LibraryService
            servletRequest.setAttribute("library", library);
        }
    }

    @Override
    public void destroy() {

    }
}
