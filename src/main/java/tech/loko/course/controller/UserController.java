package tech.loko.course.controller;

import org.springframework.beans.factory.annotation.Autowired;

import tech.loko.course.entity.User;
import tech.loko.course.service.UserService;

// UserController.java
@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping
    public User createUser(@RequestBody User user) {
        return userService.saveUser(user);
    }
}
