package com.example.Animanga.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Categories")
public class Categories {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String categoryName;

    /*@JoinTable(name = "animeCategory", joinColumns = {@JoinColumn(name = "Category_ID", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "Anime_ID", referencedColumnName = "id")})
    @ManyToMany(fetch = FetchType.EAGER)
    private List<Anime> animeList;*/


    /*@JoinTable(name = "mangaCategory", joinColumns = {@JoinColumn(name = "category_ID", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "Manga_ID", referencedColumnName = "id")})
    @ManyToMany(fetch = FetchType.EAGER)
    private List<Manga> mangaList;*/

   /* @ManyToMany(mappedBy = "categoryList")
    List<AniManga> aniMangaList;*/


}
