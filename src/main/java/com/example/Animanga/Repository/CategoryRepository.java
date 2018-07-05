package com.example.Animanga.Repository;

import com.example.Animanga.Entity.Categories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;


public interface CategoryRepository extends CrudRepository<Categories, Long> {
    Categories findCategoriesById(@Param("id") Long id);

}
