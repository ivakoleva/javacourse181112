package com.musala.javacourse181112.FirstPartJava.tasks.pawIncProject;

import com.musala.javacourse181112.FirstPartJava.tasks.pawIncProject.controller.AnimalCenterManager;
import com.musala.javacourse181112.FirstPartJava.tasks.pawIncProject.controller.Command;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;

public class PawIncApp {

    public static final String REGEX = "\\s\\|\\s";

    public static String input = "RegisterAdoptionCenter | Destiny\n" +
            "RegisterCleansingCenter | Hope\n" +
            "RegisterDog | Sharo | 5 | 20 | Destiny\n" +
            "RegisterCat | Argent | 1 | 200 | Destiny\n" +
            "SendForCleansing | Destiny | Hope\n" +
            "Cleanse | Hope\n" +
            "Adopt | Destiny\n" +
            "RegisterAdoptionCenter | Wisdom\n" +
            "RegisterDog | Rex | 12 | 100 | Wisdom\n" +
            "RegisterDog | Bolt | 2 | 100 | Wisdom\n" +
            "SendForCleansing | Wisdom | Hope\n"+
            "Paw Paw Pawah";

    public static String input2 = "RegisterAdoptionCenter | Rebellion\n"+
            "RegisterAdoptionCenter | Sentinel\n"+
            "RegisterCleansingCenter | Sanctuary\n"+
            "RegisterCleansingCenter | Liberty\n"+ "" +
            "RegisterCat | Mr.Whiskas | 1 | 1 | Sentinel\n" +
            "RegisterCat | Gosho | 20 | 100 | Rebellion\n" +
            "RegisterCat | Chukky | 10 | 10 | Rebellion\n" +
            "Adopt | Sentinel\n" +
            "RegisterDog | Sirius | 5 | 1000 Rebellion\n" +
            "SendForCleansing | Sentinel | Sanctuary\n" +
            "SendForCleansing | Rebellion | Sanctuary\n" +
            "Cleanse | Sanctuary\n" +
            "Adopt | Rebellion\n" +
            "RegisterDog | Husku | 1 | 20 | Sentinel\n" +
            "SendForCleansing | Sentinel | Liberty\n" +
            "RegisterCat | Nero | 1 | 120 | Sentinel\n" +
            "Paw Paw Pawah" ;

    public static String input3 = "";

    public static String input4 ="RegisterAdoptionCenter | Destiny\n" +
            "RegisterCleansingCenter | Hope\n" +
            "RegisterCastrationCenter | Razor\n" +
            "RegisterCat | Stacy | 1 | 100 | Destiny\n" +
            "RegisterCat | Sindy | 1 | 110 | Destiny\n" +
            "SendForCastration | Destiny | Razor\n" +
            "Castrate | Razor\n" +
            "CastrationStatistics\n" +
            "SendForCleansing | Destiny | Hope\n" +
            "Paw Paw Pawah";

    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader bufferedReader1 = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(input.getBytes())));
        AnimalCenterManager manager = new AnimalCenterManager();

        bufferedReader1.lines().forEach(line -> {
            try {

                String[] arguments = line.split(REGEX);
                    Command command = Command.getCommand(arguments[0]);
                if (command != null) {
                    command.invoke(manager, arguments);
                }else System.err.println("Not found command");
            }catch (Exception e){
                System.err.println("Error in main");
            }
        });
    }
}
