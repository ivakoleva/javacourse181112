package com.musala.javacourse181112.tasks.reflection;

import com.musala.javacourse181112.oop.libraryexercise.model.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class GenericsInstance {
    public static void main(String[] args) {
        //getAllConstructors(Person.class, Integer.class);
        //getAllInstancesFromConstructors(Person.class, Integer.class);
        final List<Person> personList = newInstancePopulated(Person.class);
        System.out.println();
    }

    public static <T> List<T> newInstancePopulated(final Class<T> tClass) {
        assert tClass != null;
        final List<Class<?>> supportedParameterTypes = Arrays.asList(String.class, Integer.class);

        return Arrays.stream(tClass.getDeclaredConstructors())
                .filter(constructor ->
                        constructor.getParameterCount() == 0 ||
                                Arrays.stream(constructor.getParameterTypes())
                                        .allMatch(supportedParameterTypes::contains)) // TODO: isAssignableFrom
                .map(constructor -> {
                    final List<?> parameters = Arrays.stream(constructor.getParameterTypes())
                            .map(parameterClass -> {
                                if (String.class.equals(parameterClass) ||
                                        Integer.class.equals(parameterClass)) {
                                    try {
                                        return parameterClass.newInstance();
                                    } catch (InstantiationException | IllegalAccessException e) {
                                        e.printStackTrace();
                                    }
                                }
                                // TODO: eventually return null ?
                                throw new UnsupportedOperationException("unsupported parameter type.");
                            })
                            // TODO: could we have valid null parameter values ?
                            .filter(Objects::nonNull) // because of lambda
                            .collect(Collectors.toList());
                    try {
                        return (T) constructor.newInstance(parameters.toArray());
                    } catch (InstantiationException | IllegalAccessException | InvocationTargetException e) {
                        e.printStackTrace();
                    }
                    return null; // could be better if old-school loops used instead of lambda, in combination with reflection
                })
                .filter(Objects::nonNull) // because of lambda
                .collect(Collectors.toList());
    }

    // TODO: return Collection<T> instead
    public static <T> Collection<Constructor<T>> getAllConstructors(final Class<T> inputClass) {
        assert inputClass != null;
        final Predicate<Class<?>> isAssignablePredicate = param -> param.isAssignableFrom(String.class) || param.isAssignableFrom(Integer.class);
        //try {
        return Arrays.stream(inputClass.getDeclaredConstructors())
                .filter(constructor -> Arrays.stream(constructor.getParameterTypes())
                        .allMatch(isAssignablePredicate))
                .map(constructor -> (Constructor<T>) constructor)
                .collect(Collectors.toList());

       /* } catch (IllegalAccessException | InvocationTargetException |
                NoSuchMethodException | InstantiationException | Exception e) {
            System.out.println(e.getMessage());
        }
        return null;*/
    }

    // TODO: combine with method above
    private static <T, U extends Number> void getAllInstancesFromConstructors(final Class<T> aClass, final Class<U> aClass1) {

    }

    /*public static <T> Stream<T> toStream(final T array[]) {
        return Arrays.stream(array);
    }*/
}
