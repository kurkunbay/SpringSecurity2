package com.example.springsecurity2.DAO;

import com.example.springsecurity2.model.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserDAOImpl implements UserDAO {
    @PersistenceContext
    private EntityManager entityManager;


    @Override
        public List<User> getListOfUsers() {
            return entityManager.createQuery("select user from User user", User.class).getResultList();
        }

    @Override
    public void addUser(User user) {
        entityManager.persist(user);
    }

    @Override
    public User findById(Long id) {
        return entityManager.find(User.class, id);
    }

    @Override
    public void deleteById(Long id) {
        entityManager.remove(entityManager.find(User.class, id));
    }

    @Override
    public void update(User user) {
        entityManager.merge(user);
    }

    @Override
    public User findByUserName(String username) {
        return entityManager.createQuery("select user from User user where user.username=:username", User.class)
                .setParameter("username", username).getSingleResult();
    }
}