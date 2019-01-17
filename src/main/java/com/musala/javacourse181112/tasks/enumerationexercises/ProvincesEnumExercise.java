package com.musala.javacourse181112.tasks.enumerationexercises;

public class ProvincesEnumExercise {
    enum ProvincesEnum {
        PLOVDIV("Plovdiv",683000,18,PlanningRegion.SOUTH_CENTER),
        MIHAILOVGRAG("Montana",148000,11,PlanningRegion.NORTH_WESTERN),
        VARNA("Varna",475000,12,PlanningRegion.NORTH_EASTERN);

        private String lable;
        private int population;
        private int municipalities;
        private PlanningRegion planningRegion;

        public String getLable() {
            return lable;
        }

        public void setLable(String lable) {
            this.lable = lable;
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

        public PlanningRegion getPlanningRegion() {
            return planningRegion;
        }

        public void setPlanningRegion(PlanningRegion planningRegion) {
            this.planningRegion = planningRegion;
        }

        ProvincesEnum(String lable, int population, int municipalities , PlanningRegion planningRegion) {
            this.lable = lable;
            this.population=population;
            this.municipalities=municipalities;
            this.planningRegion=planningRegion;
        }

        @Override
        public String toString() {
            return "ProvincesEnum{" +
                    "lable='" + lable + '\'' +
                    ", population=" + population +
                    ", municipalities=" + municipalities +
                    ", planningRegion=" + planningRegion +
                    '}';
        }
    }
    enum PlanningRegion{
        SOUTH_CENTER,
        NORTH_WESTERN,
        NORTH_EASTERN

    }


    public static void main(String[] args) {
        System.out.println(ProvincesEnum.PLOVDIV);
        System.out.println(ProvincesEnum.MIHAILOVGRAG);
        System.out.println(ProvincesEnum.VARNA);
    }


}
