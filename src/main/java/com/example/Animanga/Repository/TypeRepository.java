package com.example.Animanga.Repository;

import com.example.Animanga.Entity.Type;
import org.springframework.data.repository.CrudRepository;

public interface TypeRepository extends CrudRepository<Type, Long> {
    Type findByTypeName(String typeName);
}
