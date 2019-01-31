package com.musala.javacourse181112.tasks.validationFramework;

import com.musala.javacourse181112.tasks.libraryexercise_v0_1.model.BaseEntity;

public interface Validator {
    static boolean validate(Class<? extends BaseEntity> clazz){
        return BaseEntity.class.isAssignableFrom(clazz);
    }
}
