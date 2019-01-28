package com.musala.javacourse181112.servlet;

import com.musala.javacourse181112.oop.libraryexercise.model.Library;

import javax.servlet.*;
import java.io.IOException;
import java.util.Random;

public class PopulateAssignFilter implements Filter  {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        if(request.getAttribute("library") == null) {
            request.setAttribute("library", createNewLibrary());
        }
        filterChain.doFilter(request,servletResponse);

    }

    private Library createNewLibrary() {
        Library lib = new Library();
        Random random = new Random();
        lib.setName("Library " + random.nextInt());
        lib.setAddress("Moon street");
        return lib;
    }

    @Override
    public void destroy() {

    }
}
