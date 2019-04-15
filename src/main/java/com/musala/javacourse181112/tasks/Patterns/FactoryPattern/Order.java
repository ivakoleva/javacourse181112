package com.musala.javacourse181112.tasks.Patterns.FactoryPattern;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.nio.file.StandardOpenOption.CREATE_NEW;
import static java.nio.file.StandardOpenOption.WRITE;

public class Order implements OrderRequests{

    private Path path;
    private OpenOption[] options = new OpenOption[] { WRITE, CREATE_NEW };
    private OpenOption[] optionsWrite = new OpenOption[] { WRITE };

    private Order(String pathString) {
        this.path = Paths.get(pathString, "/log.txt");
    }

    @Override
    public void logOrder(int id, String date) throws IOException {
         if (isValid(id)){
            logEntry(id,date);
        }
    }

    public void logEntry(int id, String date) throws IOException {
        StringBuilder sb = new StringBuilder(date);
        sb.append("OrderID: ").append(id).append("\n");
        if (!Files.exists(path)){
            Files.write(path, sb.toString().getBytes(), options);

        }else Files.write(path, sb.toString().getBytes(), optionsWrite);
    }

    @Override
    public boolean isValid(int id) {
        return id>0;
    }
    public static  Order createOrder(String path){

        Order order = new Order(path);

        return order;
    }
}
