package com.example.springsecurity2.DAO;


import com.example.springsecurity2.model.User;
import java.util.List;

public interface UserDAO {

    List<User> getListOfUsers();

    void addUser(User user);

    User findById(Long id);

    void deleteById(Long id);

    void update(User user);

    User findByUserName(String username);
}
