package com.rekindle.api.user;

import com.rekindle.api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/users")
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private UserRepository userRepository;


    @GetMapping
    public List<User> getUsers() {
        return userService.getUsers();
    }

    @PostMapping()
    public  User createUser(){ return userRepository.insert(new User(7503162710L));  }
}
