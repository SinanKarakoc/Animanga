package com.example.Animanga.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Customer")
public class Customer {//

//    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long customerId;

    private String name;
    private String surname;
    private String userName;
    private String password;
    private int postCode;
    private String address;
    private String email;

    @JsonBackReference
    @ManyToMany
    public List<Categories> categoriesList;
}
