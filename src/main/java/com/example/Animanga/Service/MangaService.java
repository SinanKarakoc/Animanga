package com.example.Animanga.Service;

import com.example.Animanga.Entity.Manga;
import com.example.Animanga.Repository.MangaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MangaService {
    @Autowired
    MangaRepository mangaRepository;

    public Manga findMangaById(Long mangaId) {//1 tane getir
        return mangaRepository.findOne(mangaId);
    }

    public List<Manga> getAllMangasFromService() {

        return (List<Manga>) mangaRepository.findAll();

    }

    public Manga findMangaByName(String mangaName) {
        return mangaRepository.findByMangaName(mangaName);
    }

    public void saveMangaService(Manga manga) {
        mangaRepository.save(manga);
    }


    public void deleteMangaById(Manga manga) {

        mangaRepository.delete(manga);
    }

    public String deleteAllMangas() {
        mangaRepository.deleteAll();
        return "Empty";
    }


}
