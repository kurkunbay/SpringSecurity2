package com.example.springsecurity2.service;

import com.example.springsecurity2.model.Role;

import java.util.Set;

public interface RoleService {
    void addRole(Role role);

    Role findRole(String role);

    void deleteRole(Role role);

    Set<Role> getAllRoles();
}

