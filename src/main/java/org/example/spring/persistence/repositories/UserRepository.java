package org.example.spring.persistence.repositories;

import org.example.spring.persistence.entities.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository {

    void save(User user);

    User findByEmail(String email);

}