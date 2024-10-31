package com.osipov.task_scheduler.utils.validation.validator;

import com.osipov.task_scheduler.utils.validation.annotation.FutureDateTime;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.time.LocalDateTime;

public class FutureDateTimeValidator implements ConstraintValidator<FutureDateTime, LocalDateTime> {
    @Override
    public boolean isValid(LocalDateTime value, ConstraintValidatorContext constraintValidatorContext) {
        return value != null && value.isAfter(LocalDateTime.now());
    }
}
