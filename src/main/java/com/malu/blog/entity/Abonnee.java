package com.malu.blog.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Abonnee {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
   private String nom;
   private String email;
   private LocalDate date;

   
/**
 * @param nom
 * @param email
 * @param date
 */
public Abonnee(String nom, String email) {
    this.nom = nom;
    this.email = email;
    this.date = LocalDate.now();
}


/**
 * @param id
 * @param nom
 * @param email
 * @param date
 */
public Abonnee(Long id, String nom, String email, LocalDate date) {
    this.id = id;
    this.nom = nom;
    this.email = email;
    this.date = date;
}


public Abonnee() { 
}

/**
 * @return the nom
 */

public String getNom() {
    return nom;
}
/**
 * @param nom the nom to set
 */
public void setNom(String nom) {
    this.nom = nom;
}
/**
 * @return the email
 */
public String getEmail() {
    return email;
}
/**
 * @param email the email to set
 */
public void setEmail(String email) {
    this.email = email;
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

   
}
