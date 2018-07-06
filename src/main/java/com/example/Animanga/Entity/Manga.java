package com.example.Animanga.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "manga")
public class Manga {

//    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long mangaId;

    private String mangaName;
    //private String categoryType;
    private String author;//eiichiri oda
    private int chapterNumber;
    private Double point;
    private String releaseDate;
    private Double purchaseFee;

    @ManyToMany
    public List<Type> types;

}
