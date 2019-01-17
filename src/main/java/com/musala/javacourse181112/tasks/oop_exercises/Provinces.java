package com.musala.javacourse181112.tasks.oop_exercises;

// OK
public enum Provinces {
    SOFIA_CITY("Sofia-city", 11291591, 1, PlanningRegion.SOUTH_WESTERN),
    PLOVDIV("Plovdiv", 683027, 18, PlanningRegion.SOUTH_CENTRAL),
    PAZARDZHIK("Pazardzhik", 275548, 12, PlanningRegion.SOUTH_CENTRAL);

    private String label;
    private int population;
    private int municipalities;
    private PlanningRegion planningRegion;

    public String getLabel() {
        return label;
    }

    public int getPopulation() {
        return population;
    }

    public int getMunicipalities() {
        return municipalities;
    }

    public PlanningRegion getPlanningRegion() {
        return planningRegion;
    }

    Provinces(final String label, final int population, final int municipalities, final PlanningRegion planningRegion) {
        this.label = label;
        this.population = population;
        this.municipalities = municipalities;
        this.planningRegion = planningRegion;
    }

    enum PlanningRegion {
        NORTH_EASTERN,
        SOUTH_EASTERN,
        NORTH_WESTERN,
        SOUTH_WESTERN,
        NORTH_CENTRAL,
        SOUTH_CENTRAL
    }
}
