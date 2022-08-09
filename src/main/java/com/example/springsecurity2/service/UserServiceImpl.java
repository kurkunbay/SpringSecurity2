package com.example.springsecurity2.service;

import com.example.springsecurity2.DAO.UserDAO;
import com.example.springsecurity2.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private final UserDAO userDAO;

    @Autowired
    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public List<User> getListUsers() {
        return userDAO.getListOfUsers();
    }

    @Transactional
    @Override
    public User findById(Long id) {
        return userDAO.findById(id);
    }

    @Transactional
    @Override
    public void deleteUserById(Long id) {
        userDAO.deleteById(id);
    }

    @Transactional
    @Override
    public void updateWithRole(User user) {
        userDAO.update(user);
    }

    @Transactional
    @Override
    public User findByUserName(String username) {
        return userDAO.findByUserName(username);
    }


    @Transactional
    @Override
    public void addUser(User user) {
        userDAO.addUser(user);
    }

    @Transactional
    @Override
    public void updateUser(User user) {
        userDAO.update(user);
    }
}

