package com.malu.blog.entity;
 
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String contenu;
    private LocalDate date;
    private Post postComment;
    private Abonnee abonneeComment;
    /**
     * @param id
     * @param contenu
     * @param date
     * @param postComment
     * @param abonneeComment
     */
    public Comment(Long id, String contenu, LocalDate date, Post postComment, Abonnee abonneeComment) {
        this.id = id;
        this.contenu = contenu;
        this.date = date;
        this.postComment = postComment;
        this.abonneeComment = abonneeComment;
    }
    /**
     * 
     */
    public Comment() {
    }
    /**
     * @param contenu
     * @param date
     * @param postComment
     * @param abonneeComment
     */
    public Comment(String contenu, Post postComment, Abonnee abonneeComment) {
        this.contenu = contenu;
        this.date = LocalDate.now();;
        this.postComment = postComment;
        this.abonneeComment = abonneeComment;
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
     * @return the postComment
     */
    public Post getPostComment() {
        return postComment;
    }
    /**
     * @param postComment the postComment to set
     */
    public void setPostComment(Post postComment) {
        this.postComment = postComment;
    }
    /**
     * @return the abonneeComment
     */
    public Abonnee getAbonneeComment() {
        return abonneeComment;
    }
    /**
     * @param abonneeComment the abonneeComment to set
     */
    public void setAbonneeComment(Abonnee abonneeComment) {
        this.abonneeComment = abonneeComment;
    }

    
    

}
