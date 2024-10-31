package com.osipov.task_scheduler.utils.validation.annotation;

import com.osipov.task_scheduler.utils.validation.validator.PositivePeriodValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.FIELD, ElementType.PARAMETER })
@Constraint(validatedBy = PositivePeriodValidator.class)
public @interface PositivePeriod {
    String message() default "Интервал должен быть больше нуля";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
