package com.example.Animanga.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "anime")
@Data
@AllArgsConstructor//hepsini al
@NoArgsConstructor// veya hiçbirini alma
public class Anime {

    //    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;

    //private String movieType;//kategori
    private String movieName;
    private String director;
    private int season;
    private Double point;
    private String releaseDate;
    private Double rentalFee;


    @ManyToMany
    public List<Type> types;

}
