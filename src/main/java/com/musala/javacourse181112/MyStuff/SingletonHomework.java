package com.musala.javacourse181112.MyStuff;
//** Singleton implementation of Application class


public class SingletonHomework {
    public static void main(String[] args) {
        final Applictaion applictaion = Applictaion.getInstance();
        final Applictaion applictaion1 = Applictaion.getInstance();
        assert applictaion == applictaion1;

        final ApplicationClassInstantiatingOnAccess s1 = ApplicationClassInstantiatingOnAccess.getInstance();
        final ApplicationClassInstantiatingOnAccess s2 = ApplicationClassInstantiatingOnAccess.getInstance();
        assert s1 == s2;

    }
}
class Applictaion{
    private static final Applictaion INSTANCE = new Applictaion();

    private Applictaion(){
    }

    public static Applictaion getInstance(){
        return INSTANCE;
    }
}
class ApplicationClassInstantiatingOnAccess {
    private static ApplicationClassInstantiatingOnAccess INSTANCE;
    private ApplicationClassInstantiatingOnAccess(){
    }
    public static ApplicationClassInstantiatingOnAccess getInstance(){
        if (INSTANCE == null){
            INSTANCE = new ApplicationClassInstantiatingOnAccess();
        }
        return INSTANCE;
    }
}
