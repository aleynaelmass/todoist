package com.vitelco.todoist.controller;

import com.vitelco.todoist.exception.NotFoundException;
import com.vitelco.todoist.model.Task;
import com.vitelco.todoist.model.User;
import com.vitelco.todoist.service.TaskService;
import com.vitelco.todoist.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {
    private final  TaskService taskService;
    @Autowired
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }


    @GetMapping
    @ResponseBody
    public List<Task> findAll() {

        return taskService.findAll();
    }
    @GetMapping("/{id}")
    public Task findById(@PathVariable Long id){
        User user = new User();

        Task task = new Task(1L, "Kitap okumak", user, Task.Category.PERSONAL);
        return task;//2:46yım
        //return taskService.findById(id).orElseThrow(NotFoundException::new);
    }


    @PostMapping
    @ResponseBody
    public Task createTask(@RequestBody Task task) {
        return taskService.save(task);

    }
}