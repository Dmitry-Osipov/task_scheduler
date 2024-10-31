package com.osipov.task_scheduler.utils.validation.validator;

import com.osipov.task_scheduler.utils.validation.annotation.PositivePeriod;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.time.Period;

public class PositivePeriodValidator implements ConstraintValidator<PositivePeriod, Period> {
    @Override
    public boolean isValid(Period value, ConstraintValidatorContext constraintValidatorContext) {
        return value != null && (value.getYears() > 0 || value.getMonths() > 0 || value.getDays() > 0);
    }
}
