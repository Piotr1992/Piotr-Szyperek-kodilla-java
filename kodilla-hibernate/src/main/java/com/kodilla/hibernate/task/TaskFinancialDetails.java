package com.kodilla.hibernate.task;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.Date;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "TASKS")
public class TaskFinancialDetails {

    private int id;
    private String description;
    private Date created;
    private int duration;

    public TaskFinancialDetails() {
        this.description = description;
        this.created = new Date();
        this.duration = duration;
    }
    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID", unique = true)
    public int getId() {
        return id;
    }

    @Column(name = "DESCRIPTION")
    public String getDescription() {
        return description;
    }

    @Column(name = "CREATED")
    public Date getCreated() {
        return created;
    }

    @Column(name = "DURATION")
    public int getDuration() {
        return duration;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setDescription(String description) {
        this.description = description;
    }

    private void setCreated(Date created) {
        this.created = created;
    }

    private void setDuration(int duration) {
        this.duration = duration;
    }
}