package com.musala.javacourse181112.tasks.reflection;

import com.musala.javacourse181112.oop.libraryexercise.model.Person;

import java.util.Arrays;
import java.util.Collection;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class GenericsInstance {

    public static void main(String[] args) {
        Person person = new Person();
        Integer integer = 1;
        getAllConstructors(person.getClass(), integer.getClass());
        getAllInstancesFromConstructors(person.getClass(), integer.getClass());
    }


    // TODO: Not implemented
    public static <T, U extends Number> Collection<T> getAllConstructors(final Class<T> inputClass, final Class<U> compareClass) {
        assert inputClass != null;
        final Predicate<Class<U>> isAssignablePredicate = param -> param.isAssignableFrom(compareClass);
        try {
            return null;/*toStream(inputClass.getDeclaredConstructors())
                    .filter(constructor -> toStream(constructor.getParameterTypes())
                            .filter(param -> isAssignablePredicate.test((Class<U>) param)))
                    .collect(Collectors.toList());
*/
        } catch (/*IllegalAccessException | InvocationTargetException |
                NoSuchMethodException | InstantiationException */ Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    // TODO: Not implemented
    private static <T, U extends Number> void getAllInstancesFromConstructors(final Class<T> aClass,final Class<U> aClass1) {

    }

    public static <T> Stream<T> toStream(final T array[]) {
        return Arrays.stream(array);
    }
}
