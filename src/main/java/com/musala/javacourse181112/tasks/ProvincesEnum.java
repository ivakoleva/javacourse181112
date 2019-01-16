package com.musala.javacourse181112.tasks;

public enum ProvincesEnum {
    BLAGOEVGRAD("Blagoevgrad", 323552, 14, PlanningRegionEnum.SOUTH_WESTERN),
    BURGAS("Burgas", 415817, 13, PlanningRegionEnum.SOUTH_EASTERN),
    DOBRICH("Dobrich", 189677, 8, PlanningRegionEnum.NORTH_EASTERN),
    GABROVO("Gabrovo", 122702, 4, PlanningRegionEnum.NORTH_CENTRAL),
    HASKOVO("Haskovo", 246238, 11, PlanningRegionEnum.SOUTH_CENTRAL),
    KARDZHLI("Kardzhali", 152808, 7, PlanningRegionEnum.SOUTH_CENTRAL),
    KYUSTENDIL("Kyustendil", 136686, 9, PlanningRegionEnum.SOUTH_WESTERN),
    LOVECH("Lovech", 141422, 8, PlanningRegionEnum.NORTH_WESTERN),
    MONTANA("Montana", 148098, 11, PlanningRegionEnum.NORTH_WESTERN),
    PAZARDZHIK("Pazardzhik", 275548, 12, PlanningRegionEnum.SOUTH_WESTERN),
    PERNIK("Pernik", 133530, 6, PlanningRegionEnum.SOUTH_WESTERN),
    PLEVEN("Pleven", 269752, 11, PlanningRegionEnum.NORTH_WESTERN),
    PLOVDIV("Plovdiv", 683027, 18, PlanningRegionEnum.SOUTH_CENTRAL),
    RAZGRAD("Razgrad", 125190, 7, PlanningRegionEnum.NORTH_CENTRAL),
    RUSE("Ruse", 235252, 8, PlanningRegionEnum.NORTH_CENTRAL),
    SSHUMEN("Shumen", 180528, 10, PlanningRegionEnum.NORTH_EASTERN),
    SILISTRA("Silistra", 119474, 7, PlanningRegionEnum.NORTH_CENTRAL),
    SLIVEN("Sliven", 197473, 4, PlanningRegionEnum.SOUTH_EASTERN),
    SMOLYAN("Smolyan", 121752, 10, PlanningRegionEnum.SOUTH_CENTRAL),
    SOFIA_CITY("Sofia-city", 11291591, 1, PlanningRegionEnum.SOUTH_WESTERN),
    SOFIA_PROVINCE("Sofia-province", 247489, 22, PlanningRegionEnum.SOUTH_WESTERN),
    STARA_ZAGORA("Stara Zagora", 333265, 11, PlanningRegionEnum.SOUTH_EASTERN),
    TARGOVISHTE("Targovishte", 235252, 5, PlanningRegionEnum.NORTH_EASTERN),
    VARNA("Varna", 475074, 12, PlanningRegionEnum.NORTH_EASTERN),
    VELIKO_TARNNOVO("Veliko Tarnovo", 258494, 10, PlanningRegionEnum.NORTH_CENTRAL),
    VIDIN("Vidin", 101018, 11, PlanningRegionEnum.NORTH_WESTERN),
    VRATSHA("Vratsa", 186848, 10, PlanningRegionEnum.NORTH_WESTERN),
    YAMBOL("Yambol", 131447, 5, PlanningRegionEnum.NORTH_EASTERN);
    String label;
    Integer population;
    Integer municipalities;
    PlanningRegionEnum planningRegion;

    ProvincesEnum(String label, Integer population, Integer municipalities, PlanningRegionEnum planningRegion) {
        this.label = label;
        this.population = population;
        this.municipalities = municipalities;
        this.planningRegion = planningRegion;
    }

    public String getLabel() {
        return label;
    }

    public Integer getPopulation() {
        return population;
    }

    public Integer getMunicipalities() {
        return municipalities;
    }

    public PlanningRegionEnum getPlanningRegion() {
        return planningRegion;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }

    public void setMunicipalities(Integer municipalities) {
        this.municipalities = municipalities;
    }

    @Override
    public String toString() {
        return getLabel();
    }
}

enum PlanningRegionEnum {
    NORTH_WESTERN("North Western"),
    NORTH_CENTRAL("North Central"),
    NORTH_EASTERN("North Eastern"),
    SOUTH_WESTERN("South Western"),
    SOUTH_CENTRAL("South Central"),
    SOUTH_EASTERN("South Eastern");
    String label;

    PlanningRegionEnum(String label) {
        this.label = label;
    }

    public String toString() {
        return label;
    }
}