package com.musala.javacourse181112.servlet;

import com.musala.javacourse181112.oop.libraryexercise.model.Book;

import javax.servlet.*;
import java.io.IOException;

public class BookPopulatingFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        Book book = new Book();
        servletRequest.setAttribute("name", book);
    }

    @Override
    public void destroy() {

    }
}
