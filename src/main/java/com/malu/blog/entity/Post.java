package com.malu.blog.entity;

import java.time.LocalDate;
 

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titre;
    private String file;
    private String contenu;
    private String type;
    private LocalDate date;

    
    /**
     * @param id
     * @param titre
     * @param file
     * @param contenu
     * @param type
     * @param date
     */
    public Post(Long id, String titre, String file, String contenu, String type, LocalDate date) {
        this.id = id;
        this.titre = titre;
        this.file = file;
        this.contenu = contenu;
        this.type = type;
        this.date = date;
    }


    /**
     * 
     */
    public Post() {
    }


    /**
     * @param titre
     * @param file
     * @param contenu
     * @param type
     * @param date
     */
    public Post(String titre, String file, String contenu, String type) {
        this.titre = titre;
        this.file = file;
        this.contenu = contenu;
        this.type = type;
        this.date = LocalDate.now();
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
     * @return the titre
     */
    public String getTitre() {
        return titre;
    }


    /**
     * @param titre the titre to set
     */
    public void setTitre(String titre) {
        this.titre = titre;
    }


    /**
     * @return the file
     */
    public String getFile() {
        return file;
    }


    /**
     * @param file the file to set
     */
    public void setFile(String file) {
        this.file = file;
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
     * @return the type
     */
    public String getType() {
        return type;
    }


    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
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

    
    

}
