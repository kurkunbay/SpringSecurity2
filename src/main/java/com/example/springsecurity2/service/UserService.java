package com.example.springsecurity2.service;


import com.example.springsecurity2.model.User;

import java.util.List;

public interface UserService {

    List<User> getListUsers();

    User findById(Long id);

    void deleteUserById(Long id);

    void updateWithRole(User user);

    User findByUserName(String username);

    void addUser(User user);

    void updateUser(User user);
}
