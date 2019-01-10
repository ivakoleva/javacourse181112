package com.musala.javacourse181112.tasks.inner_class_exercise;

import java.lang.annotation.Annotation;

/**
 * * package task.innerexercise - define and instantiate one instance per each listed bellow; narrow scope of visibility outside outer context (minimum visibility using access modifiers)
 * ** Inner class (non-static)
 * ** Static nested
 * *** class
 * *** interface
 * *** enum
 * ** Local class
 * ** Anonymous class (using a functional interface)
 */
public class InnerClassesExercise {
    String name = "InnerClassExercise";
    InnerClass innerClass;

    public InnerClassesExercise(Plus<String> stringPlus) {
        innerClass = new InnerClass(name, stringPlus);
    }

    public static void main(String[] args) {
        Plus<String> stringPlus = new Plus<String>() {

            @Override
            public String plus(String first, String second) {
                return first + second;
            }

        };
        String word1 = "I am ";
        InnerClassesExercise innerClassesExercise = new InnerClassesExercise(stringPlus);
        System.out.println(word1 + innerClassesExercise.name);
        System.out.println(innerClassesExercise.innerClass.location);
        LocalClass localClass = new LocalClass(innerClassesExercise.name, stringPlus);
        System.out.println(localClass.location);
        StaticInnerClass innerClass = new StaticInnerClass(innerClassesExercise.name, stringPlus);
        System.out.println(innerClass.location);

    }

    class InnerClass {
        String location, word1 = "I am a ", word2 = " inner class to ";
        InnerClassesExercise.StaticInnerInterface.StaticInnerEnum innerEnum = StaticInnerInterface.StaticInnerEnum.NOT_STATIC;

        public InnerClass(String mainClass, Plus<String> stringPlus) {
            location = stringPlus.plus(word1, innerEnum.toString());
            location = stringPlus.plus(location, word2);
            location = stringPlus.plus(location, mainClass);
        }
    }

    static class StaticInnerClass implements StaticInnerInterface {
        static String word1 = "I am a ", word2 = " inner class to ", word3 = " and implement ";
        String location;

        public StaticInnerClass(String mainClass, Plus<String> stringPlus) {
            location = stringPlus.plus(word1, innerEnum.toString());
            location = stringPlus.plus(location, word2);
            location = stringPlus.plus(location, mainClass);
            location = stringPlus.plus(location, word3);
            location = stringPlus.plus(location, interfaceName);
        }
    }

    interface StaticInnerInterface {
        String interfaceName = "StaticInnerInterface";
        StaticInnerEnum innerEnum = StaticInnerEnum.STATIC;

        enum StaticInnerEnum {
            STATIC,
            NOT_STATIC,
            LOCAL;
        }
    }

}

class LocalClass {
    static String word1 = "I am a ", word2 = " class to ";
    String location;
    InnerClassesExercise.StaticInnerInterface.StaticInnerEnum innerEnum = InnerClassesExercise.StaticInnerInterface.StaticInnerEnum.LOCAL;

    public LocalClass(String mainClass, Plus<String> stringPlus) {
        location = stringPlus.plus(word1, innerEnum.toString());
        location = stringPlus.plus(location, word2);
        location = stringPlus.plus(location, mainClass);
    }
}

@FunctionalInterface
interface Plus<T> extends FunctionalInterface {
    T plus(T first, T second);

    @Override
    default Class<? extends Annotation> annotationType() {
        return FunctionalInterface.class;
    }
}