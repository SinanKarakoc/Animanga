package com.example.Animanga.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name ="chapter")
public class Chapter {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    public Long chapterId;

    public int chNum;
    public double chPurchaseFee;
    public double chPoint;
}
