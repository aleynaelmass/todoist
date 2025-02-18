package com.vitelco.todoist.service;

import com.vitelco.todoist.model.Task;
import com.vitelco.todoist.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class TaskServiceImpl implements TaskService {
    private final TaskRepository taskRepository;
   @Autowired
    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public List<Task> findAll() { return taskRepository.findAll(); }


    @Override
    public Task save(Task task) { return taskRepository.save(task); }


    @Override
    public Optional<Task> findById(Long id) {
       return taskRepository.findById(id);
    }
}
