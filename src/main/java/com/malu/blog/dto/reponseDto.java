package com.malu.blog.dto;

public class reponseDto {
    private Long idDto;
    private String contenuDto;
    private String dateDto;
    private postDto postReponseDto;
    private abonneeDto abonneeReponseDto;
    private commentDto commentDto;
    /**
     * 
     */
    public reponseDto() {
    }
    /**
     * @param idDto
     * @param contenuDto
     * @param dateDto
     * @param postReponseDto
     * @param abonneeReponseDto
     * @param commentDto
     */
    public reponseDto(Long idDto, String contenuDto, String dateDto, postDto postReponseDto,
            abonneeDto abonneeReponseDto, com.malu.blog.dto.commentDto commentDto) {
        this.idDto = idDto;
        this.contenuDto = contenuDto;
        this.dateDto = dateDto;
        this.postReponseDto = postReponseDto;
        this.abonneeReponseDto = abonneeReponseDto;
        this.commentDto = commentDto;
    }
    /**
     * @param contenuDto
     * @param dateDto
     * @param postReponseDto
     * @param abonneeReponseDto
     * @param commentDto
     */
    public reponseDto(String contenuDto, String dateDto, postDto postReponseDto, abonneeDto abonneeReponseDto,
            com.malu.blog.dto.commentDto commentDto) {
        this.contenuDto = contenuDto;
        this.dateDto = dateDto;
        this.postReponseDto = postReponseDto;
        this.abonneeReponseDto = abonneeReponseDto;
        this.commentDto = commentDto;
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
    /**
     * @return the postReponseDto
     */
    public postDto getPostReponseDto() {
        return postReponseDto;
    }
    /**
     * @param postReponseDto the postReponseDto to set
     */
    public void setPostReponseDto(postDto postReponseDto) {
        this.postReponseDto = postReponseDto;
    }
    /**
     * @return the abonneeReponseDto
     */
    public abonneeDto getAbonneeReponseDto() {
        return abonneeReponseDto;
    }
    /**
     * @param abonneeReponseDto the abonneeReponseDto to set
     */
    public void setAbonneeReponseDto(abonneeDto abonneeReponseDto) {
        this.abonneeReponseDto = abonneeReponseDto;
    }
    /**
     * @return the commentDto
     */
    public commentDto getCommentDto() {
        return commentDto;
    }
    /**
     * @param commentDto the commentDto to set
     */
    public void setCommentDto(commentDto commentDto) {
        this.commentDto = commentDto;
    }

    
}
