package com.todolist.model;

import com.todolist.model.enums.Priority;
import com.todolist.model.enums.Status;

public class Task {
    private int id;
    private String name;
    private String description;
    private Priority priority;
    private Status status;

    public Task(int id, String name, String description, Priority priority, Status status) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.priority = priority;
        this.status = Status.PENDING;
    }

    public int getId() {
        return this.id;
    }

    public String getNome() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Priority getPriority() {
        return this.priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public Status getStatus() {
        return this.status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

}