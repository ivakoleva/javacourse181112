package com.musala.javacourse181112.tasks.LibraryWebApp.Filters;

import com.musala.javacourse181112.oop.libraryexercise.model.Book;
import com.musala.javacourse181112.oop.libraryexercise.model.Library;

import javax.servlet.*;
import java.io.IOException;

public class BookPopulatingFilter implements Filter {
    //populate Books to library inventory
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest,
                         ServletResponse servletResponse,
                         FilterChain filterChain) throws IOException, ServletException {
        servletRequest.getAttribute("library");//by setters & getters set the book attribute
//        servletRequest.setAttribute("book0", new Book());
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {

    }
}
