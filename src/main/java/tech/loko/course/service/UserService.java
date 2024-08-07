package tech.loko.course.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import tech.loko.course.entity.User;
import tech.loko.course.repository.UserRepository;

// UserService.java
@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User saveUser(User user) {
        return userRepository.save(user);
    }
}
