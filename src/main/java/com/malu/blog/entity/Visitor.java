package com.malu.blog.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Visitor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String ipAddress;
    private String pays;
    private LocalDate date;
    /**
     * 
     */
    public Visitor() {
    }
    /**
     * @param ipAddress
     * @param pays
     * @param date
     */
    public Visitor(String ipAddress, String pays) {
        this.ipAddress = ipAddress;
        this.pays = pays;
        this.date = LocalDate.now();
    }
    /**
     * @param id
     * @param ipAddress
     * @param pays
     * @param date
     */
    public Visitor(Long id, String ipAddress, String pays, LocalDate date) {
        this.id = id;
        this.ipAddress = ipAddress;
        this.pays = pays;
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
