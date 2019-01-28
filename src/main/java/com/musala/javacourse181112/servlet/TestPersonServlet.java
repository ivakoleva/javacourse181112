package com.musala.javacourse181112.servlet;

import com.musala.javacourse181112.oop.libraryexercise.TestPersonGenerator;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by Iva Koleva on 24.01.2019
 */
public class TestPersonServlet extends HttpServlet {
    @Override
    protected void doGet(final HttpServletRequest req, final HttpServletResponse resp) throws ServletException, IOException {
        final RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/jsp/person-test.jsp");
        final TestPersonGenerator testPersonGenerator = new TestPersonGenerator();

        req.setAttribute(
                "personList",
                IntStream.range(0, 10).boxed()
                        .map(i -> testPersonGenerator.generatePerson(
                                "Name" + i,
                                "EGN " + i + "111111111"
                        )).collect(Collectors.toList()));
        dispatcher.forward(req, resp);
    }
}
