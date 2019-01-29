package com.musala.javacourse181112.tasks.LibraryWebApp;

import javax.servlet.*;
import java.io.IOException;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static com.musala.javacourse181112.tasks.libraryexercise2.Application.createRandomClient;

public class PopulatePeople implements Filter {


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(final ServletRequest servletRequest, final ServletResponse servletResponse, final FilterChain filterChain) throws IOException, ServletException {
        servletRequest.setAttribute("personList",
                IntStream.range(0, 10).boxed()
                        .map(i -> createRandomClient()).collect(Collectors.toList()));
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {

    }

}
