package com.example.Animanga.Service;

import com.example.Animanga.Entity.Type;
import com.example.Animanga.Repository.TypeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeService {
    TypeRepository typeRepository;

    public List<Type> getAllCategoryTypesFromService() {
        return (List<Type>) typeRepository.findAll();
    }

    public void saveTypeService(Type type) {
        typeRepository.save(type);
    }

    public Type findTypeById(Long id) {
        return typeRepository.findOne(id);
    }

    public void deleteTypeById(Long id) {
        typeRepository.delete(id);
    }

    public void deleteAllType() {
        typeRepository.deleteAll();
    }


}
