package com.example.Animanga.Service;

import com.example.Animanga.Entity.Anime;
import com.example.Animanga.Repository.AnimeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimeService {

    @Autowired
    AnimeRepository animeRepository;

    public List<Anime> getAllAnimesFromService() {
        return (List<Anime>) animeRepository.findAll();
    }


    public void saveAnimeService(Anime anime) {
        animeRepository.save(anime);
    }

    public Anime findAnimeById(Long animeId) {
        return animeRepository.findOne(animeId);
    }

    public Anime findByMovieName(String movieName) {
        return animeRepository.findByMovieName(movieName);
    }

    public void deleteAnimeById(Long animeId) {
        animeRepository.delete(animeId);
    }

    public void deleteAllAnime() {
        animeRepository.deleteAll();
    }

}
