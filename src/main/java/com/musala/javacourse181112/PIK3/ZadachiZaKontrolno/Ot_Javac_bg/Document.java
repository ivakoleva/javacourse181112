package com.musala.javacourse181112.PIK3.ZadachiZaKontrolno.Ot_Javac_bg;

import java.io.Serializable;

public class Document implements Serializable {

    public String name;
    public double mark;
    public double income;
    public String faculty;

    public Document(){

    }

    public Document(String name, double mark, double income, String faculty) {
        this.name = name;
        this.mark = mark;
        this.income = income;
        this.faculty = faculty;
    }

    public String getName() {
        return name;
    }

    public double getMark() {
        return mark;
    }

    public double getIncome() {
        return income;
    }

    public String getFaculty() {
        return faculty;
    }
}