package com.musala.javacourse181112.tasks.ServletsExercises;

import com.musala.javacourse181112.tasks.library_exercise.model.Library;
import com.musala.javacourse181112.tasks.library_exercise.model.Role;
import com.musala.javacourse181112.tasks.library_exercise.service.LibraryService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

/**
 * Created by Aykut Ismailov on 26.1.2019 г.
 */
public class LibraryServlet extends HttpServlet {
    private static final LibraryService libraryService = new LibraryService();

    @Override
    protected void doGet(final HttpServletRequest req, final HttpServletResponse resp) throws ServletException, IOException {
        final RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher("/jsp/library.jsp");
        req.setAttribute("library", populateDummyData(libraryService));

        requestDispatcher.forward(req, resp);
    }


    // TODO: extract to service
    private static Library populateDummyData(final LibraryService libraryService) {
        final Library library = libraryService.generateLibrary("TU Library", new ArrayList<>(), new ArrayList<>());

        libraryService.addBook(library, "123", "Random Book", "123", LocalDate.now().minus(1L, ChronoUnit.MONTHS));
        /*libraryService.addMagazine(library, "124", "Random Magazine", "124", LocalDate.now().minus(3L, ChronoUnit.DAYS));
        libraryService.addNewspaper(library, "125", "Random Newspaper", "125", LocalDate.now());*/

        libraryService.addPerson(library, "1", "First Person", Role.EMPLOYEE);
        libraryService.addPerson(library, "2", "Second Person", Role.CLIENT);

        return library;
    }
}