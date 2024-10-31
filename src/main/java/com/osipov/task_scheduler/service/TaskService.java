package com.osipov.task_scheduler.service;

import com.osipov.task_scheduler.entity.TaskEntity;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface TaskService {
    List<TaskEntity> getAllTasks(Pageable pageable);
    TaskEntity getTaskById(Long id);
    TaskEntity create(TaskEntity taskEntity);
    TaskEntity update(Long id, TaskEntity taskEntity);
}
