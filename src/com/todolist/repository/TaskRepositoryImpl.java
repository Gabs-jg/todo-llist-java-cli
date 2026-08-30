package com.todolist.repository;
import com.todolist.model.Task;

import java.util.ArrayList;
import java.util.List;

public class TaskRepositoryImpl implements TaskRepository{

    List<Task> tasks = new ArrayList<>();


    @Override
    public void createTask(Task task) {
        tasks.add(task);
    }

    @Override
    public List<Task> listAllTasks() {
        return tasks;
    }

    @Override
    public Task getTaskById(int id) {
        for(Task task : tasks) {
            if(task.getId() == id) {
                return task;
            }
        }
        return null;
    }

    @Override
    public void updateTask(Task task) {
        for(int i=0; i< tasks.size(); i++) {
            if(tasks.get(i).getId() == task.getId()) {
                tasks.set(i, task);
                return;
            }
        }
    }

    @Override
    public void deleteTask(Task task) {
        tasks.remove(task);
    }
}
