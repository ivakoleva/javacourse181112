package com.musala.javacourse181112.tasks.librarywebapp;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LIbraryServlet extends HttpServlet {



    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        final RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/jsp/library-app.jsp");
        final LIbraryServlet libraryApp=new LIbraryServlet();

        dispatcher.forward(req, resp);
    }
}
