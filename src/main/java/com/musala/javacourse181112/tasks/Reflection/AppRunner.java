package com.musala.javacourse181112.tasks.Reflection;

import java.lang.reflect.Constructor;

public class AppRunner{
    public static void main(String[] args) throws NoSuchMethodException {
        Reflectable user = new Reflectable();
        Class cls = user.getClass();
        Constructor ct = cls.getDeclaredConstructor();
        System.out.println(cls.getDeclaredConstructor());
    }
}
