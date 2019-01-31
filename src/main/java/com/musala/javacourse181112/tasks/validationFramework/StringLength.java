package com.musala.javacourse181112.tasks.validationFramework;

import java.lang.annotation.*;

@Documented
@Target (ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface StringLength {
    int minimumSize();
    int maximumSize();
}
