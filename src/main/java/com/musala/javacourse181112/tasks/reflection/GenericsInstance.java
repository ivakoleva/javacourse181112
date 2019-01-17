package com.musala.javacourse181112.tasks.reflection;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class GenericsInstance {

    // TODO: Not implemented
    public static <T, U extends Number> Collection<T> getAllInstacesByConstructors(final Class<T> inputClass, final Class<U> compareClass) {
        assert inputClass != null;
        final Predicate<Class<?>> isAssignablePredicate = param-> param.isAssignableFrom(compareClass);
        try {
            return Collections.EMPTY_LIST;
            /*toStream(inputClass.getDeclaredConstructors())
                .filter(constructor -> toStream(constructor.getParameterTypes())
                        .filter(param-> isAssignablePredicate.test(param)))
                .collect(Collectors.toList());*/

        } catch (/*IllegalAccessException | InvocationTargetException |
                NoSuchMethodException | InstantiationException */ Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public static<T> Stream<T> toStream(final T array[]){
        return Arrays.stream(array);
    }
}
