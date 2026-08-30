package com.todolist.service;

import com.todolist.model.Task;
import com.todolist.repository.TaskRepository;

import java.util.List;

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

    public List<Task> listAllTasks() {
        return repository.listAllTasks();
    }

    public Task getTaskById(int id) {
        return repository.getTaskById(id);
    }

    public void updateTask(Task task) {
        Task t = repository.getTaskById(task.getId());

        if(t == null) {
            throw new IllegalArgumentException("Task not found.");
        }

        if(t.getNome() == null || task.getNome().isBlank()) {
            throw new IllegalArgumentException("Name cannot be empty;");
        }

        repository.updateTask(task);

    }

    public void deleteTask(int id) {
        Task task = repository.getTaskById(id);

        if(task == null) {
            throw new IllegalArgumentException("Task does not exist.");
        }

        repository.deleteTask(task);
    }
}
