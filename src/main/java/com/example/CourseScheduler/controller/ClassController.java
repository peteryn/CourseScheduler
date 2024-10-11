package com.example.CourseScheduler.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClassController {

    @Autowired
    private UserDetailsManager userDetailsManager;

    @GetMapping("/test")
    public String test() {
        return "test";
    }

    @GetMapping("/make")
    public String make() {
        UserDetails user = User.builder()
                .username("user1")
                .password("{bcrypt}$2a$10$GRLdNijSQMUvl/au9ofL.eDwmoohzzS7.rmNSJZ.0FxO/BTk76klW")
//                .password("password")
                .roles("USER")
                .build();
//        JdbcUserDetailsManager users = new JdbcUserDetailsManager(dataSource);
//        users.createUser(user);
//        return users;
        userDetailsManager.createUser(user);
        return "made";
    }
}
