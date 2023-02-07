package com.malu.blog.dto;
 

public class likeDto {
    private Long idDto;
    private String dateDto;
    private postDto postLikeDto;
    private abonneeDto abonneeLikeDto;
    /**
     * 
     */
    public likeDto() {
    }
    /**
     * @param dateDto
     * @param postLikeDto
     * @param abonneeLikeDto
     */
    public likeDto(String dateDto, postDto postLikeDto, abonneeDto abonneeLikeDto) {
        this.dateDto = dateDto;
        this.postLikeDto = postLikeDto;
        this.abonneeLikeDto = abonneeLikeDto;
    }
    /**
     * @param idDto
     * @param dateDto
     * @param postLikeDto
     * @param abonneeLikeDto
     */
    public likeDto(Long idDto, String dateDto, postDto postLikeDto, abonneeDto abonneeLikeDto) {
        this.idDto = idDto;
        this.dateDto = dateDto;
        this.postLikeDto = postLikeDto;
        this.abonneeLikeDto = abonneeLikeDto;
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
     * @return the postLikeDto
     */
    public postDto getPostLikeDto() {
        return postLikeDto;
    }
    /**
     * @param postLikeDto the postLikeDto to set
     */
    public void setPostLikeDto(postDto postLikeDto) {
        this.postLikeDto = postLikeDto;
    }
    /**
     * @return the abonneeLikeDto
     */
    public abonneeDto getAbonneeLikeDto() {
        return abonneeLikeDto;
    }
    /**
     * @param abonneeLikeDto the abonneeLikeDto to set
     */
    public void setAbonneeLikeDto(abonneeDto abonneeLikeDto) {
        this.abonneeLikeDto = abonneeLikeDto;
    }

    
}
