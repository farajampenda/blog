package com.malu.blog.dto;

public class visitorPostDto {
    private Long idDto;
    private String ipAddressDto;
    private String paysDto;
    private postDto postViewDto;
    private String dateDto;
    /**
     * 
     */
    public visitorPostDto() {
    }
    /**
     * @param idDto
     * @param ipAddressDto
     * @param paysDto
     * @param postViewDto
     * @param dateDto
     */
    public visitorPostDto(Long idDto, String ipAddressDto, String paysDto, postDto postViewDto, String dateDto) {
        this.idDto = idDto;
        this.ipAddressDto = ipAddressDto;
        this.paysDto = paysDto;
        this.postViewDto = postViewDto;
        this.dateDto = dateDto;
    }
    /**
     * @param ipAddressDto
     * @param paysDto
     * @param postViewDto
     * @param dateDto
     */
    public visitorPostDto(String ipAddressDto, String paysDto, postDto postViewDto, String dateDto) {
        this.ipAddressDto = ipAddressDto;
        this.paysDto = paysDto;
        this.postViewDto = postViewDto;
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
     * @return the ipAddressDto
     */
    public String getIpAddressDto() {
        return ipAddressDto;
    }
    /**
     * @param ipAddressDto the ipAddressDto to set
     */
    public void setIpAddressDto(String ipAddressDto) {
        this.ipAddressDto = ipAddressDto;
    }
    /**
     * @return the paysDto
     */
    public String getPaysDto() {
        return paysDto;
    }
    /**
     * @param paysDto the paysDto to set
     */
    public void setPaysDto(String paysDto) {
        this.paysDto = paysDto;
    }
    /**
     * @return the postViewDto
     */
    public postDto getPostViewDto() {
        return postViewDto;
    }
    /**
     * @param postViewDto the postViewDto to set
     */
    public void setPostViewDto(postDto postViewDto) {
        this.postViewDto = postViewDto;
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
