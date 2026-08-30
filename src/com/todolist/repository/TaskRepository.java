package com.todolist.repository;
import com.todolist.model.Task;

import java.util.List;

public interface TaskRepository {

    void createTask(Task task);

    List<Task> listAllTasks();

    Task getTaskById(int id);

    void updateTask(Task task);

    void deleteTask(Task task);

}
