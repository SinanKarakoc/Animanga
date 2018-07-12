package com.example.Animanga.Repository;

import com.example.Animanga.Entity.Manga;
import org.springframework.data.repository.CrudRepository;


public interface MangaRepository extends CrudRepository <Manga,Long> {
    Manga findByMangaName(String mangaName);
}
