package org.example.spring.persistence.repositories;

import org.example.spring.persistence.entities.Role;

public interface RoleRepository {

    Role findByName(String roleName);

    void save(Role role);

}