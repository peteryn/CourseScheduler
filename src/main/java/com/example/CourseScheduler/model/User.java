package com.example.CourseScheduler.model;

import jakarta.persistence.*;
import java.util.Set;

@Entity
@Table(name = "USERS")
public class User {
    @Id
    @Column(length = 128)
    private String username;

    @Column(nullable = false, length = 128)
    private String password;

    @Column(nullable = false)
    private boolean enabled;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<Authority> authorities;

    // Getters and setters
}