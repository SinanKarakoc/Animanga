package com.example.Animanga.Service;

import com.example.Animanga.Entity.Categories;
import com.example.Animanga.Repository.CategoryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    CategoryRepository categoryRepository;

    public List<Categories> getAllCategoriesFromService() {
        return (List<Categories>) categoryRepository.findAll();
    }


    public void saveCategoryService(Categories category) {
        categoryRepository.save(category);
    }

    public Categories findCategoriesById(Long id) {
        return categoryRepository.findOne(id);
    }

    public void deleteCategoriesById(Long id) {
        categoryRepository.delete(id);
    }

    public void deleteAllCategories() {
        categoryRepository.deleteAll();
    }
}
