package com.musala.javacourse181112.tasks;

import com.musala.javacourse181112.oop.libraryexercise.model.Library;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by Iva Koleva on 28.01.2019
 */
public class LibraryFIlter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    final Library library = new Library();

    @Override
    public void doFilter(final ServletRequest request,
                         final ServletResponse response,
                         final FilterChain chain) throws IOException, ServletException {
        if (request.getAttribute("user") == null) {
            request.setAttribute("user", "guest");
        }
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {

    }

   /* //@Override
    public void init (final ServletRequest request,
                      final ServletResponse response,
                      final FilterChain chain) throws IOException, ServletException{
        if (request.getAttribute("Books") == null) {
            request.setAttribute(());
        }*/
}
//}

