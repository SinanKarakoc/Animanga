package com.example.Animanga.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Type")
public class Type {//korku gerilim vs

//    @GeneratedValue(strategy = GenerationType.AUTO)

    @Id
    private Long typeId;

    private String typeName;

    @ManyToOne
    public Categories categories;

    @ManyToMany
    public List<Manga> mangaList;

    @ManyToMany
    public List<Anime> animeList;


}
