package com.abstractclass.controller;


import com.abstractclass.entity.Task;
import com.abstractclass.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    @Autowired
    private TaskService taskService;


    @PostMapping
    public Task saveTask(@RequestBody Task task){
        return taskService.save(task);
    }

    @GetMapping
    public List<Task> getAllTasks(){
        return taskService.findAll();
    }

}
