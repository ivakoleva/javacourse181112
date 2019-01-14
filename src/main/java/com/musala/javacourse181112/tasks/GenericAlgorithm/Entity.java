package com.musala.javacourse181112.tasks.GenericAlgorithm;

public interface Entity {
    String getID();

    boolean isPersisted();

    void setPersisted(boolean persisted);
}