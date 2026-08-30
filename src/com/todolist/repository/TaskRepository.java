package com.todolist.repository;
import com.todolist.model.Task;

public interface TaskRepository {

    void createTask(Task task);

    void updateTask(Task task);

    void deleteTask(Task task);

}
