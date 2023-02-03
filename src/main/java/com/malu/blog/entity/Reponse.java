package com.malu.blog.entity;

import java.time.LocalDate;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Reponse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String contenu;
    private LocalDate date;
    private Post postReponse;
    private Abonnee abonneeReponse;
    private Comment comment;
    /**
     * @param id
     * @param contenu
     * @param date
     * @param postReponse
     * @param abonneeReponse
     */
    public Reponse(Long id, String contenu, LocalDate date, Post postReponse, Abonnee abonneeReponse,Comment comment) {
        this.id = id;
        this.contenu = contenu;
        this.date = date;
        this.postReponse = postReponse;
        this.abonneeReponse = abonneeReponse;
        this.comment=comment;
    }
    /**
     * 
     */
    public Reponse() {
    }
    /**
     * @param contenu
     * @param date
     * @param postReponse
     * @param abonneeReponse
     */
    public Reponse(String contenu, Post postReponse, Abonnee abonneeReponse,Comment comment) {
        this.contenu = contenu;
        this.date = LocalDate.now();;
        this.postReponse = postReponse;
        this.abonneeReponse = abonneeReponse;
        this.comment=comment;
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
     * @return the contenu
     */
    public String getContenu() {
        return contenu;
    }
    /**
     * @param contenu the contenu to set
     */
    public void setContenu(String contenu) {
        this.contenu = contenu;
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
     * @return the postReponse
     */
    public Post getPostReponse() {
        return postReponse;
    }
    /**
     * @param postReponse the postReponse to set
     */
    public void setPostReponse(Post postReponse) {
        this.postReponse = postReponse;
    }
    /**
     * @return the abonneeReponse
     */
    public Abonnee getAbonneeReponse() {
        return abonneeReponse;
    }
    /**
     * @param abonneeReponse the abonneeReponse to set
     */
    public void setAbonneeReponse(Abonnee abonneeReponse) {
        this.abonneeReponse = abonneeReponse;
    }
    /**
     * @return the comment
     */
    public Comment getComment() {
        return comment;
    }
    /**
     * @param comment the comment to set
     */
    public void setComment(Comment comment) {
        this.comment = comment;
    }

    
  
}
