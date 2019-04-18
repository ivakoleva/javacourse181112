package com.musala.javacourse181112.FirstPartJava.tasks.pawIncProject.model.centers;

public enum CenterType {

    ADOPTION  (AdoptionCenter.class.getSimpleName()),
    CLEANSING (CleansingCenter.class.getSimpleName()),
    CASTRATION(CastrationCenter.class.getSimpleName());

    /*ADOPTION(AdoptionCenter.class),
    CLEANSING(CleansingCenter.class),
    CASTRATION(CastrationCenter.class);
*/
    public String getType() {
        return type;
    }

    private String type;

    CenterType(String type) {
      this.type = type;
    }
}
