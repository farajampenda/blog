package com.malu.blog.dto;
 

public class partageDto {
    private Long idDto;
    private  String dateDto;
    private  String plateformeDto;
    private  postDto postLikeDto;
    private  abonneeDto abonneeLikeDto;
    /**
     * 
     */
    public partageDto() {
    }
    /**
     * @param idDto
     * @param dateDto
     * @param plateformeDto
     * @param postLikeDto
     * @param abonneeLikeDto
     */
    public partageDto(Long idDto, String dateDto, String plateformeDto, postDto postLikeDto,
            abonneeDto abonneeLikeDto) {
        this.idDto = idDto;
        this.dateDto = dateDto;
        this.plateformeDto = plateformeDto;
        this.postLikeDto = postLikeDto;
        this.abonneeLikeDto = abonneeLikeDto;
    }
    /**
     * @param dateDto
     * @param plateformeDto
     * @param postLikeDto
     * @param abonneeLikeDto
     */
    public partageDto(String dateDto, String plateformeDto, postDto postLikeDto, abonneeDto abonneeLikeDto) {
        this.dateDto = dateDto;
        this.plateformeDto = plateformeDto;
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
     * @return the plateformeDto
     */
    public String getPlateformeDto() {
        return plateformeDto;
    }
    /**
     * @param plateformeDto the plateformeDto to set
     */
    public void setPlateformeDto(String plateformeDto) {
        this.plateformeDto = plateformeDto;
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
