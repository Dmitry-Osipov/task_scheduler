package com.osipov.task_scheduler.utils.validation.annotation;

import com.osipov.task_scheduler.utils.validation.validator.FutureDateTimeValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.FIELD, ElementType.PARAMETER })
@Constraint(validatedBy = FutureDateTimeValidator.class)
public @interface FutureDateTime {
    String message() default "Дата и время должны быть позже текущего момента";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
