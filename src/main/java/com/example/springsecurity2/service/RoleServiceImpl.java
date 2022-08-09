package com.example.springsecurity2.service;

import com.example.springsecurity2.DAO.RoleDAO;
import com.example.springsecurity2.model.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Set;

@Service
public class RoleServiceImpl implements RoleService {

    private final RoleDAO roleDAO;

    @Autowired
    public RoleServiceImpl(RoleDAO roleDAO) {
        this.roleDAO = roleDAO;
    }

    @Override
    public void addRole(Role role) {
        roleDAO.addRole(role);
    }

    @Override
    public Role findRole(String role) {
        return roleDAO.findRole(role);
    }

    @Transactional
    @Override
    public void deleteRole(Role role) {
        roleDAO.deleteRole(role);
    }

    @Override
    public Set<Role> getAllRoles() {
        return roleDAO.getAllRoles();
    }
}
