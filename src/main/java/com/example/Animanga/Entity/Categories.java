package com.example.Animanga.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Categories")

public class Categories {//anime-manga vs

    //@GeneratedValue
    @Id
    private Long id;//anime 1 manga 2 desek

    private String categoryName;

//    @JoinTable(name = "animeCategory", joinColumns = {@JoinColumn(name = "Category_ID", referencedColumnName = "id")},
//            inverseJoinColumns = {@JoinColumn(name = "Anime_ID", referencedColumnName = "id")})
//    @ManyToMany(fetch = FetchType.EAGER)
//    private List<Anime> animeList;
//
//
//    @JoinTable(name = "mangaCategory", joinColumns = {@JoinColumn(name = "category_ID", referencedColumnName = "id")},
//            inverseJoinColumns = {@JoinColumn(name = "Manga_ID", referencedColumnName = "id")})
//    @ManyToMany(fetch = FetchType.EAGER)

    @ManyToOne
    public Customer customer;

    @OneToMany
    public List<Type> typeList;


}
