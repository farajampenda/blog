package com.malu.blog.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class VistorPost {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String ipAddress;
    private String pays;
    private Post postView;
    private LocalDate date;
    /**
     * 
     */
    public VistorPost() {
    }
    /**
     * @param ipAddress
     * @param pays
     * @param postView
     * @param date
     */
    public VistorPost(String ipAddress, String pays, Post postView, LocalDate date) {
        this.ipAddress = ipAddress;
        this.pays = pays;
        this.postView = postView;
        this.date = date;
    }
    /**
     * @param id
     * @param ipAddress
     * @param pays
     * @param postView
     * @param date
     */
    public VistorPost(Long id, String ipAddress, String pays, Post postView, LocalDate date) {
        this.id = id;
        this.ipAddress = ipAddress;
        this.pays = pays;
        this.postView = postView;
        this.date = date;
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
     * @return the ipAddress
     */
    public String getIpAddress() {
        return ipAddress;
    }
    /**
     * @param ipAddress the ipAddress to set
     */
    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }
    /**
     * @return the pays
     */
    public String getPays() {
        return pays;
    }
    /**
     * @param pays the pays to set
     */
    public void setPays(String pays) {
        this.pays = pays;
    }
    /**
     * @return the postView
     */
    public Post getPostView() {
        return postView;
    }
    /**
     * @param postView the postView to set
     */
    public void setPostView(Post postView) {
        this.postView = postView;
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
