package org.example.spring.persistence.repositories;

import org.example.spring.persistence.entities.Privilege;

public interface PrivilegeRepository {

    Privilege findByName(String privilegeName);

    void save(Privilege privilege);

}