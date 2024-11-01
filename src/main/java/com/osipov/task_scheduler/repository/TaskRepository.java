package com.osipov.task_scheduler.repository;

import com.osipov.task_scheduler.entity.TaskEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<TaskEntity, Long> {
}
