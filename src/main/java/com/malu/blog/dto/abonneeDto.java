package com.malu.blog.dto;

import java.time.LocalDate;

public class abonneeDto {
    private Long idDto;
    private String nomDto;
    private String emailDto;
    private LocalDate dateDto;

    
    /**
     * 
     */
    public abonneeDto() {
    }


    /**
     * @param idDto
     * @param nomDto
     * @param emailDto
     * @param dateDto
     */
    public abonneeDto(Long idDto, String nomDto, String emailDto, LocalDate dateDto) {
        this.idDto = idDto;
        this.nomDto = nomDto;
        this.emailDto = emailDto;
        this.dateDto = dateDto;
    }


    /**
     * @param nomDto
     * @param emailDto
     * @param dateDto
     */
    public abonneeDto(String nomDto, String emailDto, LocalDate dateDto) {
        this.nomDto = nomDto;
        this.emailDto = emailDto;
        this.dateDto = dateDto;
    }


    /**
     * @return the idDto
     */
    public Long getIdDto() {
        return idDto;
    }


    /**
     * @param idDto the idDto to set
     */
    public void setIdDto(Long idDto) {
        this.idDto = idDto;
    }


    /**
     * @return the nomDto
     */
    public String getNomDto() {
        return nomDto;
    }


    /**
     * @param nomDto the nomDto to set
     */
    public void setNomDto(String nomDto) {
        this.nomDto = nomDto;
    }


    /**
     * @return the emailDto
     */
    public String getEmailDto() {
        return emailDto;
    }


    /**
     * @param emailDto the emailDto to set
     */
    public void setEmailDto(String emailDto) {
        this.emailDto = emailDto;
    }


    /**
     * @return the dateDto
     */
    public LocalDate getDateDto() {
        return dateDto;
    }


    /**
     * @param dateDto the dateDto to set
     */
    public void setDateDto(LocalDate dateDto) {
        this.dateDto = dateDto;
    }

    
}
