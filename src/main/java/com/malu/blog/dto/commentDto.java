package com.malu.blog.dto;
 

public class commentDto {
    private Long idDto;
    private String contenuDto;
    private String dateDto;
    private postDto postCommentDto;
    private abonneeDto abonneeCommentDto;
    /**
     * 
     */
    public commentDto() {
    }
    /**
     * @param contenuDto
     * @param dateDto
     * @param postCommentDto
     * @param abonneeCommentDto
     */
    public commentDto(String contenuDto, String dateDto, postDto postCommentDto, abonneeDto abonneeCommentDto) {
        this.contenuDto = contenuDto;
        this.dateDto = dateDto;
        this.postCommentDto = postCommentDto;
        this.abonneeCommentDto = abonneeCommentDto;
    }
    /**
     * @param idDto
     * @param contenuDto
     * @param dateDto
     * @param postCommentDto
     * @param abonneeCommentDto
     */
    public commentDto(Long idDto, String contenuDto, String dateDto, postDto postCommentDto,
            abonneeDto abonneeCommentDto) {
        this.idDto = idDto;
        this.contenuDto = contenuDto;
        this.dateDto = dateDto;
        this.postCommentDto = postCommentDto;
        this.abonneeCommentDto = abonneeCommentDto;
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
     * @return the postCommentDto
     */
    public postDto getPostCommentDto() {
        return postCommentDto;
    }
    /**
     * @param postCommentDto the postCommentDto to set
     */
    public void setPostCommentDto(postDto postCommentDto) {
        this.postCommentDto = postCommentDto;
    }
    /**
     * @return the abonneeCommentDto
     */
    public abonneeDto getAbonneeCommentDto() {
        return abonneeCommentDto;
    }
    /**
     * @param abonneeCommentDto the abonneeCommentDto to set
     */
    public void setAbonneeCommentDto(abonneeDto abonneeCommentDto) {
        this.abonneeCommentDto = abonneeCommentDto;
    }

    
}
