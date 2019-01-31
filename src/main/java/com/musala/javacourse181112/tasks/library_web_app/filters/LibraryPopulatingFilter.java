//package com.musala.javacourse181112.tasks.library_web_app.filters;
//
//import com.musala.javacourse181112.oop.libraryexercise.model.Library;
//
//import javax.servlet.*;
//import java.io.IOException;
//import javax.filter.*;
//
//
//public class LibraryPopulatingFilter implements Filter {
//    //populate Library & assign to request
//    @Override
//    public void init(FilterConfig filterConfig) throws ServletException {
//
//    }
//
//    @Override
//    public void doFilter(ServletRequest servletRequest,
//                         ServletResponse servletResponse,
//                         FilterChain filterChain) throws IOException, ServletException {
//        servletRequest.setAttribute("name", new Library());
//        filterChain.doFilter(servletRequest, servletResponse);
//    }
//
//    @Override
//    public void destroy() {
//
//    }
//}
