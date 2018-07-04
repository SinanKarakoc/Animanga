package com.example.Animanga.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "anime")
@Data
@AllArgsConstructor//hepsini al
@NoArgsConstructor// veya hiçbirini alma
public class Anime {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long animeId;
    private String movieType;//kategori
    private String movieName;
    private int season;
    private Double point;


    /*@OneToMany
    @JoinColumn(name = "categoryId")
    Categories categories;
    List<Categories> categoriesList;*/

}
