package com.malu.blog.dto;

public class postDto {
    private Long idDto;
    private String titreDto;
    private String fileDto;
    private String contenuDto;
    private String typeDto;
    private String dateDto;
    /**
     * 
     */
    public postDto() {
    }
    /**
     * @param idDto
     * @param titreDto
     * @param fileDto
     * @param contenuDto
     * @param typeDto
     * @param dateDto
     */
    public postDto(Long idDto, String titreDto, String fileDto, String contenuDto, String typeDto, String dateDto) {
        this.idDto = idDto;
        this.titreDto = titreDto;
        this.fileDto = fileDto;
        this.contenuDto = contenuDto;
        this.typeDto = typeDto;
        this.dateDto = dateDto;
    }
    /**
     * @param titreDto
     * @param fileDto
     * @param contenuDto
     * @param typeDto
     * @param dateDto
     */
    public postDto(String titreDto, String fileDto, String contenuDto, String typeDto, String dateDto) {
        this.titreDto = titreDto;
        this.fileDto = fileDto;
        this.contenuDto = contenuDto;
        this.typeDto = typeDto;
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
     * @return the titreDto
     */
    public String getTitreDto() {
        return titreDto;
    }
    /**
     * @param titreDto the titreDto to set
     */
    public void setTitreDto(String titreDto) {
        this.titreDto = titreDto;
    }
    /**
     * @return the fileDto
     */
    public String getFileDto() {
        return fileDto;
    }
    /**
     * @param fileDto the fileDto to set
     */
    public void setFileDto(String fileDto) {
        this.fileDto = fileDto;
    }
    /**
     * @return the contenuDto
     */
    public String getContenuDto() {
        return contenuDto;
    }
    /**
     * @param contenuDto the contenuDto to set
     */
    public void setContenuDto(String contenuDto) {
        this.contenuDto = contenuDto;
    }
    /**
     * @return the typeDto
     */
    public String getTypeDto() {
        return typeDto;
    }
    /**
     * @param typeDto the typeDto to set
     */
    public void setTypeDto(String typeDto) {
        this.typeDto = typeDto;
    }
    /**
     * @return the dateDto
     */
    public String getDateDto() {
        return dateDto;
    }
    /**
     * @param dateDto the dateDto to set
     */
    public void setDateDto(String dateDto) {
        this.dateDto = dateDto;
    }

    
}
