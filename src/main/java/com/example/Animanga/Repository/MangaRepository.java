package com.example.Animanga.Repository;

import com.example.Animanga.Entity.Manga;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface MangaRepository extends CrudRepository <Manga,Long> {
    //Manga findMangaById(@Param("mangaId") Long mangaId);
    Manga findByMangaName(String mangaName);
}
