package com.osipov.task_scheduler.controller;

import com.osipov.task_scheduler.dto.TaskDto;
import com.osipov.task_scheduler.service.TaskService;
import com.osipov.task_scheduler.utils.mapper.TaskMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Validated
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/task")
public class TaskController {
    private final TaskService service;
    private final TaskMapper mapper;

    @GetMapping
    List<TaskDto> getTasks(@PageableDefault Pageable pageable) {
        return mapper.toDtos(service.getAllTasks(pageable));
    }
}
