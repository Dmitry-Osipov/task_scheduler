package com.osipov.task_scheduler.dto;

import com.osipov.task_scheduler.utils.validation.annotation.FutureDateTime;
import com.osipov.task_scheduler.utils.validation.annotation.PositivePeriod;
import jakarta.validation.constraints.NotBlank;

import java.time.LocalDateTime;
import java.time.Period;

public record TaskDto(
        Long id,
        @NotBlank String title,
        String description,
        @FutureDateTime LocalDateTime remindAt,
        @PositivePeriod Period repeatInterval
) {
}
