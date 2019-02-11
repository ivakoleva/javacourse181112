package com.musala.javacourse181112.paw_inc.services;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Scanner;

public class Cleint {
    public static void main(final String[] args) throws ClassNotFoundException, NoSuchMethodException,
            IllegalAccessException, InstantiationException, InvocationTargetException {
        Class<?> clazz = Class.forName("com.musala.javacourse181112.paw_inc.services.AnimalCenterManager");
        Object object = clazz.newInstance();
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            String[] words = line.split("\\s*|\\s*");
            Object[] arguments = Arrays.copyOfRange(words, 1, words.length + 1);
            Method[] methods = clazz.getDeclaredMethods();
            for(Method method : methods){
                Class<?>[] parameterTypes = method.getParameterTypes();
                method = clazz.getDeclaredMethod(words[0], parameterTypes);
                method.invoke(object, arguments);
            }

            /*Method method = clazz.getDeclaredMethod(words[0]);
            Class<?>[] parameterTypes = method.getParameterTypes();
            Object[] methodArguments = new Object[parameterTypes.length];
            for (int i = 0; i < parameterTypes.length; i++) {
                methodArguments[i] = parameterTypes[i].newInstance();
            }
            method.invoke(object, methodArguments);*/
        }
        scanner.close();
    }

}

