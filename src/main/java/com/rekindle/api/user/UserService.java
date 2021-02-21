package com.rekindle.api.user;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    public List<User> getUsers() {
        return List.of(new User("mongodb_id_here", 7503162710L));
    }
}
