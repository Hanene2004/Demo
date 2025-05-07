package com.example.demo.service;

import com.example.demo.model.User;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    private List<User> users = new ArrayList<>();

    public UserService() {
        users.add(new User("1", "Alice"));
        users.add(new User("2", "Bob"));
    }

    public List<User> getUsers() {
        return users;
    }
}