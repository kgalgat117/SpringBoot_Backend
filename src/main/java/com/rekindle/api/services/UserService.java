package com.rekindle.api.services;

import com.rekindle.api.repository.UserRepository;
import com.rekindle.api.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getUsers() {
        return  userRepository.findAll();
    }
}
