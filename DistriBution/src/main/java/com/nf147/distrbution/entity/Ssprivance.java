package com.nf147.distrbution.entity;

public class Ssprivance {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ssprivance.province_id
     *
     * @mbg.generated
     */
    private String provinceId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ssprivance.province_name
     *
     * @mbg.generated
     */
    private String provinceName;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ssprivance.province_id
     *
     * @return the value of ssprivance.province_id
     *
     * @mbg.generated
     */
    public String getProvinceId() {
        return provinceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ssprivance.province_id
     *
     * @param provinceId the value for ssprivance.province_id
     *
     * @mbg.generated
     */
    public void setProvinceId(String provinceId) {
        this.provinceId = provinceId == null ? null : provinceId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ssprivance.province_name
     *
     * @return the value of ssprivance.province_name
     *
     * @mbg.generated
     */
    public String getProvinceName() {
        return provinceName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ssprivance.province_name
     *
     * @param provinceName the value for ssprivance.province_name
     *
     * @mbg.generated
     */
    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName == null ? null : provinceName.trim();
    }
}