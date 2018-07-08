package com.example.Animanga.Repository;

import com.example.Animanga.Entity.Type;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface TypeRepository extends CrudRepository<Type, Long> {

}
