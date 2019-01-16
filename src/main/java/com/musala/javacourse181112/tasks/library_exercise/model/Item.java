package com.musala.javacourse181112.tasks.library_exercise.model;

import java.time.LocalDate;

public interface Item {
    String getISBN();

    void setISBN(final String ISBN);

    String getName();

    void setName(final String id);

    String getId();

    void setId(final String id);

    LocalDate getDayOfPublishing();

    void setDayOfPublishing(final LocalDate dayOfPublishing);

    String getSpecialId();

}
