package com.example.springsecurity2.DAO;

import com.example.springsecurity2.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Set;

public interface RoleDAO {
    void addRole(Role role);
    Role findRole(String role);
    void deleteRole(Role role);
    Set<Role> getAllRoles();
}
