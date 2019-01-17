package com.musala.javacourse181112.tasks.library_exercise.model;

import java.time.LocalDate;

public interface Item {
    String getISBN();

    void setISBN(String ISBN);

    String getName();

    void setName(String id);

    String getId();

    void setId(String id);

    LocalDate getDayOfPublishing();

    void setDayOfPublishing(LocalDate dayOfPublishing);

    /**
     *
     * @return
     *
     * @see
     * @deprecated
     */
    @Deprecated
    String getSpecialId();
}
