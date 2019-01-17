package com.musala.javacourse181112.tasks.oop;

import javax.swing.plaf.synth.Region;
import java.util.Scanner;

public enum ProvincesEnumExercise {
    /*
     ** ProvincesEnum implementation (https://en.wikipedia.org/wiki/Provinces_of_Bulgaria)
     *** 3 enum values
     *** additional meta information per value
     **** label
     **** population
     **** municipalities

     **** Bonus: planing region

     * Veliko Tarnovo		258,494		        10	North Central
     * Sofia City		    1,291,591		    1	South Western
     * Burgas		        415,817		        13	South Eastern
     */

    VELIKO_TARNOVO("veliko tarnovo", 258494, 10, PlanningRegion.NORTH, PlanningRegion.CENTRAL),
    SOFIA_CITY("sofia city", 1291591, 1, PlanningRegion.SOUTH, PlanningRegion.WESTERN),
    BURGAS("burgas", 415817, 13, PlanningRegion.SOUTH, PlanningRegion.EASTERN);

    private String label;
    private int population;
    private int municipalities;
    private PlanningRegion planingRegion;
    private PlanningRegion planingRegion2;

    ProvincesEnumExercise(final String label, final int population, final int municipalities, final PlanningRegion planingRegion, PlanningRegion planingRegion2) {
        this.label = label;
        this.population = population;
        this.municipalities = municipalities;
        this.planingRegion = planingRegion;
        this.planingRegion2 = planingRegion2;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getMunicipalities() {
        return municipalities;
    }

    public void setMunicipalities(int municipalities) {
        this.municipalities = municipalities;
    }

    public PlanningRegion getPlaningRegion() {
        return planingRegion;
    }

    public void setPlaningRegion(PlanningRegion planingRegion) {
        this.planingRegion = planingRegion;
    }

    public PlanningRegion getPlaningRegion2() {
        return planingRegion2;
    }

    public void setPlaningRegion2(PlanningRegion planingRegion2) {
        this.planingRegion2 = planingRegion2;
    }

    @Override
    public String toString() {
        return "LABEL:'" + label + '\'' +
                ", population: " + population +
                ", municipalities: " + municipalities +
                ", planingRegion: " + planingRegion.toString().toLowerCase() + " " + planingRegion2.toString().toLowerCase();
    }

    enum PlanningRegion {
        SOUTH,
        WESTERN,
        EASTERN,
        NORTH,
        CENTRAL
    }

    public static Scanner scanner = new Scanner(System.in);

    public static void pickProvince() {
        int choice = scanner.nextInt();
        switch (choice) {
            case 0:
                System.out.println("Bye - bye");
                break;
            case 1:
                System.out.println(VELIKO_TARNOVO.toString());
                break;
            case 2:
                System.out.println(SOFIA_CITY.toString());
                break;
            case 3:
                System.out.println(BURGAS.toString());
                break;
            default:
                System.out.println("Wrong number... ");
                break;
        }
    }

    public static void main(String[] args) {
        System.out.println("Choose a number to see the Province info: \n1 - Veliko Tarnovo\n2 - Sofia city\n3 - Burgas\nor 0 to EXIT");
        while (scanner.hasNext()) { // don't know how to make it loop while 0 comes in
            pickProvince();
        }
    }
}
