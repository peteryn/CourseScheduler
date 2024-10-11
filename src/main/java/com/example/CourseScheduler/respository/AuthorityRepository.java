package com.example.CourseScheduler.respository;

import com.example.CourseScheduler.model.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorityRepository extends JpaRepository<Authority, Long> {
    // Custom query methods can be added here if needed
}
