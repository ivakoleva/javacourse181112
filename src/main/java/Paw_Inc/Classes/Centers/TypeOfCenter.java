package Paw_Inc.Classes.Centers;

/**
 * Created by Aykut Ismailov on 5.2.2019 г.
 */
public enum TypeOfCenter {
    ADOPTION(AdoptionCenter.class),
    CLEANSING(CleansingCenter.class);

    private Class clazz;

    TypeOfCenter(Class clazz) {
        this.clazz = clazz;
    }

    public Class getClazz() {
        return clazz;
    }
}
