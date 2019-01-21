package com.musala.javacourse181112.homeworks;

import java.util.Objects;

@FunctionalInterface
public interface TriConsumer<T,U,V> {
    void accept(T t,U u,V v);
    default TriConsumer<T, U, V> andThen(TriConsumer<? super T, ? super U, ? super V> after){
        Objects.requireNonNull(after);

        return (l, r, p) -> {
            accept(l, r, p);
            after.accept(l, r, p);
        };
    }
}
