package com.todolist.service;

import com.todolist.model.Task;
import com.todolist.repository.TaskRepository;

public class TaskService {

    private final TaskRepository repository;

    public TaskService(TaskRepository repository) {
        this.repository = repository;
    }

    public void createTask(Task task) {
        if(task.getNome() == null || task.getNome().isBlank()) {
            throw new IllegalArgumentException("Name cannot be empty.");
        }

        repository.createTask(task);
    }

    public void updateTask(Task task) {
        // Regras de negócio
    }

    public void deleteTask(Task task) {
    }
}
