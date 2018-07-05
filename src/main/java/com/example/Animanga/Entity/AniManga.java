package com.example.Animanga.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "AniManga")
public class AniManga {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String aniMangaName;

    /*@JoinTable(name = "animangaCategory", joinColumns = {@JoinColumn(name = "Animanga_ID", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "Category_ID", referencedColumnName = "id")})
    @ManyToMany(fetch = FetchType.EAGER)
    List<Categories> categoriesList;

    /*@OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "")


    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "")*/
}
