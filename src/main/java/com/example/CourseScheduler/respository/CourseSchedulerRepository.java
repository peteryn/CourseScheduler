package com.example.CourseScheduler.respository;

import com.example.CourseScheduler.model.CourseSchedulerUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseSchedulerRepository extends JpaRepository<CourseSchedulerUser, Long> {
    CourseSchedulerUser findByEmail(String email);
}
