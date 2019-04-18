package com.musala.javacourse181112.FirstPartJava.servlet;

import com.musala.javacourse181112.FirstPartJava.oop.votesexercise.service.PersonService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by Iva Koleva on 24.01.2019
 */
public class PersonListServlet extends HttpServlet {
    @Override
    protected void doGet(final HttpServletRequest req, final HttpServletResponse resp) throws ServletException, IOException {
        final RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/jsp/person-list.jsp");
        final PersonService personService = new PersonService();

        req.setAttribute(
                "personList",
                IntStream.range(0, 10).boxed()
                        .map(i -> personService.generatePerson(
                                "Name" + i,
                                "Family" + i,
                                LocalDate.now().minus(i + 10, ChronoUnit.YEARS))
                        ).collect(Collectors.toList()));
        dispatcher.forward(req, resp);
    }
}
