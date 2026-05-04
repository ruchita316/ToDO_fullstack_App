package com.example.ToDo;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class TaskController {

    private final TaskRepository repo;

    public TaskController(TaskRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/tasks")
    public List<Task> getTasks() {
        return repo.findAll();
    }

    @PostMapping("/tasks")
    public Task addTask(@RequestBody Task task) {
        return repo.save(task);
    }

    @PutMapping("/tasks/{id}")
    public Task updateTask(@PathVariable int id, @RequestBody Task updated) {
        updated.setId(id);
        return repo.save(updated);
    }

    @DeleteMapping("/tasks/{id}")
    public String deleteTask(@PathVariable int id) {
        repo.deleteById(id);
        return "Task deleted!";
    }
}