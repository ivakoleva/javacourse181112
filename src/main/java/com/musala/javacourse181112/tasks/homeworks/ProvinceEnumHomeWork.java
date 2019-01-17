package com.musala.javacourse181112.tasks.homeworks;

import java.util.Arrays;



    public enum ProvinceEnumHomeWork {
        PLOVDIV("plovdiv", 715816, 18, PlanningRegion.SOUTH, PlanningRegion.CENTRAL),
        VARNA("varna", 462013, 12, PlanningRegion.NORTH, PlanningRegion.EASTERN),
        BURGAS("burgas", 423547, 13, PlanningRegion.SOUTH, PlanningRegion.EASTERN),
        HASKOVO("haskovo", 277478, 11, PlanningRegion.SOUTH, PlanningRegion.CENTRAL);


        private int population;
        private int municipalities;
        private String label;
        private PlanningRegion planningRegionFirst;
        private PlanningRegion planningRegionSecond;

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

        public String getLabel() {
            return label;
        }

        public void setLabel(String label) {
            this.label = label;
        }

        public PlanningRegion getPlanningRegionFirst() {
            return planningRegionFirst;
        }

        public void setPlanningRegionFirst(PlanningRegion planningRegionFirst) {
            this.planningRegionFirst = planningRegionFirst;
        }

        public PlanningRegion getPlanningRegionSecond() {
            return planningRegionSecond;
        }

        public void setPlanningRegionSecond(PlanningRegion planningRegionSecond) {
            this.planningRegionSecond = planningRegionSecond;
        }

        ProvinceEnumHomeWork(final String label, final int population, final int municipalities, final PlanningRegion planningRegionFirst, final PlanningRegion planningRegionSecond) {
            this.label = label;
            this.population = population;
            this.municipalities = municipalities;
            this.planningRegionFirst = planningRegionFirst;
            this.planningRegionSecond = planningRegionSecond;
        }

        @Override
        public String toString() {
            return name() + " Population: " + population + " Municipalities: " + municipalities + " Planning region: " + planningRegionFirst + " " + planningRegionSecond;
        }

        public static ProvinceEnumHomeWork fromStringLabel(final String label) {
            return Arrays.stream(values())
                    .filter(extendedEnumSample -> extendedEnumSample.getLabel().equals(label))
                    .findAny()
                    .orElseGet(null);
        }

        enum PlanningRegion {
            SOUTH,
            WESTERN,
            EASTERN,
            NORTH,
            CENTRAL
        }

        public static void main(final String[] args) {
            System.out.println(ProvinceEnumHomeWork.fromStringLabel("plovdiv"));
            System.out.println(ProvinceEnumHomeWork.fromStringLabel("varna"));
            System.out.println(ProvinceEnumHomeWork.fromStringLabel("burgas"));
            System.out.println(ProvinceEnumHomeWork.fromStringLabel("haskovo"));
        }
    }


