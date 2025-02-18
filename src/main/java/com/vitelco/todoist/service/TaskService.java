package com.vitelco.todoist.service;

import com.vitelco.todoist.model.Task;

import java.util.List;
import java.util.Optional;

public interface TaskService {
    List<Task> findAll();

    Task save(Task task);

    Optional<Task> findById(Long id);
}
