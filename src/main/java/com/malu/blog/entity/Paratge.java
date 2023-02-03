package com.malu.blog.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Paratge {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate date;
    private String plateforme;
    private Post postLike;
    private Abonnee abonneeLike;
    /**
     * 
     */
    public Paratge() {
    }
    /**
     * @param date
     * @param plateforme
     * @param postLike
     * @param abonneeLike
     */
    public Paratge( String plateforme, Post postLike, Abonnee abonneeLike) {
        this.date = LocalDate.now();
        this.plateforme = plateforme;
        this.postLike = postLike;
        this.abonneeLike = abonneeLike;
    }
    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }
    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }
    /**
     * @return the date
     */
    public LocalDate getDate() {
        return date;
    }
    /**
     * @param date the date to set
     */
    public void setDate(LocalDate date) {
        this.date = date;
    }
    /**
     * @return the plateforme
     */
    public String getPlateforme() {
        return plateforme;
    }
    /**
     * @param plateforme the plateforme to set
     */
    public void setPlateforme(String plateforme) {
        this.plateforme = plateforme;
    }
    /**
     * @return the postLike
     */
    public Post getPostLike() {
        return postLike;
    }
    /**
     * @param postLike the postLike to set
     */
    public void setPostLike(Post postLike) {
        this.postLike = postLike;
    }
    /**
     * @return the abonneeLike
     */
    public Abonnee getAbonneeLike() {
        return abonneeLike;
    }
    /**
     * @param abonneeLike the abonneeLike to set
     */
    public void setAbonneeLike(Abonnee abonneeLike) {
        this.abonneeLike = abonneeLike;
    }

    
}
