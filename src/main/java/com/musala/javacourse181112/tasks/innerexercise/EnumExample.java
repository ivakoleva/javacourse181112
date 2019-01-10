package com.musala.javacourse181112.tasks.innerexercise;

class EnumExample {

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
    public static void main(final String[] args) {
        final EnumExample.MonthsOfYear january = EnumExample.MonthsOfYear.JANUARY;
        final EnumExample.MonthsOfYear february = EnumExample.MonthsOfYear.FEBRUARY;
        System.out.println(january);
        System.out.println(february);
    }
}