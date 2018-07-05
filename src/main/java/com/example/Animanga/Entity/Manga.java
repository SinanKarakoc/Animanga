package com.example.Animanga.Entity;

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
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String mangaName;

    private Double point;

    private int chapterNumber;//bunu ön plana çıkaracağız

    private int season;

    private Date releaseDate;

    private Double purchaseFee;

    /*@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "")*/
}
