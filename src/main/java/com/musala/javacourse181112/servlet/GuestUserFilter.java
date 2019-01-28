package com.musala.javacourse181112.servlet;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by Iva Koleva on 28.01.2019
 */
public class GuestUserFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(final ServletRequest request,
                         final ServletResponse response,
                         final FilterChain chain) throws IOException, ServletException {
        if(request.getAttribute("user") == null) {
            request.setAttribute("user", "guest");
        }
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {

    }
}
