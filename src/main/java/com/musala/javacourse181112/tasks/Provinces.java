package com.musala.javacourse181112.tasks;

public enum Provinces {
    SOFIA_CITY("Sofia-city", 11291591, 1, PlanningRegion.SOUTH_WESTERN),
    PLOVDIV("Plovdiv", 683027, 18, PlanningRegion.SOUTH_CENTRAL),
    PAZARDZHIK("Pazardzhik", 275548, 12, PlanningRegion.SOUTH_CENTRAL);

    private String label;
    private int population;
    private int municipality;
    private PlanningRegion planningRegion;

    public String getLabel() {
        return label;
    }

    public int getPopulation() {
        return population;
    }

    public int getMunicipality() {
        return municipality;
    }

    public PlanningRegion getPlanningRegion() {
        return planningRegion;
    }

    Provinces(final String label, final int population, final int municipality, final PlanningRegion planningRegion) {
        this.label = label;
        this.population = population;
        this.municipality = municipality;
        this.planningRegion = planningRegion;
    }


    public enum PlanningRegion {
        SOUTH_WESTERN,
        SOUTH_CENTRAL
    }
}
