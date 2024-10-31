package com.osipov.task_scheduler.utils.mapper;

import com.osipov.task_scheduler.config.MapperConfig;
import com.osipov.task_scheduler.dto.TaskDto;
import com.osipov.task_scheduler.entity.TaskEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(config = MapperConfig.class)
public interface TaskMapper {
    TaskDto toDto(TaskEntity task);
    TaskEntity toEntity(TaskDto taskDto);
    List<TaskDto> toDtos(List<TaskEntity> tasks);
}
