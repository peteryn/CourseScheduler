package com.example.CourseScheduler.model;

import jakarta.persistence.*;

@Entity
public class CourseSchedulerUser {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(unique=true)
    private final String email;
    private final String password;

    public CourseSchedulerUser(String username, String password) {
        this.email = username;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return this.email + " " + this.password;
    }
}
