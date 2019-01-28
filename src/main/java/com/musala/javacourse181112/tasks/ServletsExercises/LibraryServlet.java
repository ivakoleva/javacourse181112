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
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);

        final RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher("/jsp/library_jsp.jsp");
        final LibraryService libraryService = new LibraryService();
        final Library library = DummyClass.dummyPopulator(libraryService);

        req.setAttribute("library", library);

        requestDispatcher.forward(req, resp);
    }
}

final class DummyClass {
    static Library dummyPopulator(LibraryService libraryService) {
        final Library library = libraryService.generateLibrary("TU Library", new ArrayList<>(), new ArrayList<>());

        libraryService.addBook(library, "123", "Random Book", "123", LocalDate.now().minus(1L, ChronoUnit.MONTHS));
        libraryService.addMagazine(library, "124", "Random Magazine", "124", LocalDate.now().minus(3L, ChronoUnit.DAYS));
        libraryService.addNewspaper(library, "125", "Random Newspaper", "125", LocalDate.now());

        libraryService.addPerson(library, "1", "First Person", Role.EMPLOYEE);
        libraryService.addPerson(library, "2", "Second Person", Role.CLIENT);

        return library;
    }
}