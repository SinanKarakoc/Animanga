package com.example.Animanga.Repository;

import com.example.Animanga.Entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Long> {
    User findByName(String name);
}
