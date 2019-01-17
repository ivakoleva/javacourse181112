package com.musala.javacourse181112.tasks;

public enum ProvincesEnum {
    SOFIACITY("SofiaGrad", 1291591, 1, PlanningRegion.SOUTH_WESTERN),
    PLOVDIV("Plovdiv", 683027, 18, PlanningRegion.SOUTH_CENTRAl),
    BLAGOEVGRAD("Blagoevgrad",323552, 14, PlanningRegion.SOUTH_WESTERN);



    private String label;
    private int populataion;
    private int municipality;
    private PlanningRegion planningRegion;

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public int getPopulataion() {
        return populataion;
    }

    public void setPopulataion(int populataion) {
        this.populataion = populataion;
    }

    public int getMunicipality() {
        return municipality;
    }

    public void setMunicipality(int municipality) {
        this.municipality = municipality;
    }


    ProvincesEnum(final String label, final int populataion,final int municipality, final PlanningRegion planningRegion) {
        this.label = label;
        this.populataion = populataion;
        this.municipality = municipality;
        this.planningRegion = planningRegion;
    }


    public enum PlanningRegion {
        SOUTH_WESTERN,
        SOUTH_CENTRAl;
    }
}

