package com.musala.javacourse181112.patterns;

/**
 * Created by Iva Koleva on 10.12.2018
 */
public class SingletonExample {
    // using assertions, please enable VM options -ea
    public static void main(final String[] args) {
        final SingletonClass singletonClass = SingletonClass.getInstance();
        final SingletonClass singletonClass1 = SingletonClass.getInstance();
        assert singletonClass == singletonClass1;

        final SingletonClassInstantiatingOnAccess s1 = SingletonClassInstantiatingOnAccess.getInstance();
        final SingletonClassInstantiatingOnAccess s2 = SingletonClassInstantiatingOnAccess.getInstance();
        assert s1 == s2;
    }
}

class SingletonClass {
    private static final SingletonClass INSTANCE = new SingletonClass();

    private SingletonClass() {
    }

    public static SingletonClass getInstance() {
        return INSTANCE;
    }
}

class SingletonClassInstantiatingOnAccess {
    private static SingletonClassInstantiatingOnAccess INSTANCE;

    private SingletonClassInstantiatingOnAccess() {
    }

    public static SingletonClassInstantiatingOnAccess getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new SingletonClassInstantiatingOnAccess();
        }
        return INSTANCE;
    }
}