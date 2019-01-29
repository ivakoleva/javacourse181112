package com.musala.javacourse181112.servlet;


import com.musala.javacourse181112.oop.libraryexercise.model.Library;

import javax.servlet.*;
import java.io.IOException;

public class ServletFilter implements Filter {


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        Library library = new Library();
    servletRequest.setAttribute("library",library);
    }

    @Override
    public void destroy() {

    }
}
