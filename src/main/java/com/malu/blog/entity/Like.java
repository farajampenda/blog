package com.malu.blog.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Like {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate date;
    private Post postLike;
    private Abonnee abonneeLike;
    /**
     * 
     */
    public Like() {
    }
    /**
     * @param date
     * @param postLike
     * @param abonneeLike
     */
    public Like( Post postLike, Abonnee abonneeLike) {
        this.date = LocalDate.now();;
        this.postLike = postLike;
        this.abonneeLike = abonneeLike;
    }
    /**
     * @param id
     * @param date
     * @param postLike
     * @param abonneeLike
     */
    public Like(Long id, LocalDate date, Post postLike, Abonnee abonneeLike) {
        this.id = id;
        this.date = date;
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
