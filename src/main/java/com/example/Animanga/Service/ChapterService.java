package com.example.Animanga.Service;

import com.example.Animanga.Entity.Chapter;
import com.example.Animanga.Repository.ChapterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChapterService {
    @Autowired
    ChapterRepository chapterRepository;


    public List<Chapter> getAllChapters(){
        return (List<Chapter>) chapterRepository.findAll();
    }
    public void saveChapter(Chapter chapter) {
        chapterRepository.save(chapter);
    }
    public void deleteChapter(Chapter chapter) {
        chapterRepository.delete(chapter);
    }




}
