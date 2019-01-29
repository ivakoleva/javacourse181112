package com.musala.javacourse181112.servlet;

import com.musala.javacourse181112.oop.libraryexercise.LibraryService;

import javax.servlet.*;
import java.io.IOException;
import java.util.ArrayList;

public class LibraryFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest,
                         ServletResponse servletResponse,
                         FilterChain filterChain) throws IOException, ServletException {

        final LibraryService libraryService = new LibraryService();

        if (servletRequest.getAttribute("library") == null) {
            servletRequest.setAttribute("library",
                    libraryService.generateLibrary("National",
                            "Sofia 1234",
                            new ArrayList<>(),
                            new ArrayList<>(),
                            new ArrayList<>()));
        }
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {

    }
}
