package com.musala.javacourse181112.SecondPart.Patterns.FactoryPattern;

import java.io.IOException;

public interface OrderRequests {
    void logOrder(int id,String date) throws IOException;
    boolean isValid(int id);
}
