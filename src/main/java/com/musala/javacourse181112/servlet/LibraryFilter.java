package com.musala.javacourse181112.servlet;

import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.*;

import com.musala.javacourse181112.tasks.libraryexercise_v0_1.model.Library;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;


public class LibraryFilter implements Filter {
    private static final Random random = new Random();

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest,
                         ServletResponse servletResponse,
                         FilterChain filterChain) throws IOException, ServletException {
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
