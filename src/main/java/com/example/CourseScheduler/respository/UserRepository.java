package com.example.CourseScheduler.respository;

import com.example.CourseScheduler.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
    // Custom query methods can be added here if needed
}