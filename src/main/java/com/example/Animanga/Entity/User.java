package com.example.Animanga.Entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;


@Data
@Entity
@Table(name = "kullanici")
public class User implements Serializable, UserDetails {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long userId;

    private String name;

    private String password;


    @Override
    @Transient
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    @Transient
    public String getPassword() {
        return password;
    }

    @Override
    @Transient
    public String getUsername() {
        return name;
    }

    @Override
    @Transient
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    @Transient
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    @Transient
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    @Transient
    public boolean isEnabled() {
        return true;
    }

}
