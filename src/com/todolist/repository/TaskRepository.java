package com.todolist.repository;

public interface TaskRepository {

    void createTask(Task task);

    void updateTask(Task task);

    void deleteTask(Task task);

}
