package com.musala.javacourse181112.tasks.innerexercise;

public class Enum {

    enum MonthsOfYear {
        JANUARY,
        FEBRUARY,
        MARCH,
        APRIL,
        MAY,
        JUNE,
        JULY,
        AUGUST,
        SEPTEMBER,
        OCTOBER,
        NOVEMBER,
        DECEMBER
    }
}

class StartPoint {
    public static void main(String[] args) {
        final Enum.MonthsOfYear january = Enum.MonthsOfYear.JANUARY;
        final Enum.MonthsOfYear february = Enum.MonthsOfYear.FEBRUARY;
        final Enum.MonthsOfYear march = Enum.MonthsOfYear.MARCH;
        final Enum.MonthsOfYear april = Enum.MonthsOfYear.APRIL;
        final Enum.MonthsOfYear may = Enum.MonthsOfYear.MAY;
        final Enum.MonthsOfYear june = Enum.MonthsOfYear.JUNE;
        final Enum.MonthsOfYear july = Enum.MonthsOfYear.JULY;
        final Enum.MonthsOfYear august = Enum.MonthsOfYear.AUGUST;
        final Enum.MonthsOfYear september = Enum.MonthsOfYear.SEPTEMBER;
        final Enum.MonthsOfYear october = Enum.MonthsOfYear.OCTOBER;
        final Enum.MonthsOfYear november = Enum.MonthsOfYear.NOVEMBER;
        final Enum.MonthsOfYear december = Enum.MonthsOfYear.DECEMBER;
        System.out.println(january);
        System.out.println(february);
    }
}
