package com.osipov.task_scheduler.service.impl;

import com.osipov.task_scheduler.entity.TaskEntity;
import com.osipov.task_scheduler.repository.TaskRepository;
import com.osipov.task_scheduler.service.TaskService;
import jakarta.persistence.EntityExistsException;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TaskServiceImpl implements TaskService {
    private final TaskRepository repository;

    @Override
    public List<TaskEntity> getAllTasks(Pageable pageable) {
        return repository.findAll(pageable).getContent();
    }

    @Override
    public TaskEntity getTaskById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Task not found"));
    }

    @Override
    public TaskEntity create(TaskEntity taskEntity) {
        if (repository.existsById(taskEntity.getId())) {
            throw new EntityExistsException("Task already exists");
        }

        return repository.save(taskEntity);
    }

    @Override
    public TaskEntity update(Long id, TaskEntity taskEntity) {
        if (!repository.existsById(id)) {
            throw new EntityNotFoundException("Task not found");
        }

        taskEntity.setId(id);
        return repository.save(taskEntity);
    }
}
