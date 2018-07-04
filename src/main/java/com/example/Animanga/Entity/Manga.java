package com.example.Animanga.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "manga")
public class Manga {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long CategoryId;
    private Long mangaId;
    private Double point;
    private int chapterNumber;
    private int season;
    private Date releaseDate;



}
