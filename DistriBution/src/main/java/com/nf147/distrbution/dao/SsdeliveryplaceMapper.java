package com.nf147.distrbution.dao;

import com.nf147.distrbution.entity.Ssdeliveryplace;
import java.util.List;

public interface SsdeliveryplaceMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ssdeliveryplace
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String depId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ssdeliveryplace
     *
     * @mbg.generated
     */
    int insert(Ssdeliveryplace record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ssdeliveryplace
     *
     * @mbg.generated
     */
    Ssdeliveryplace selectByPrimaryKey(String depId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ssdeliveryplace
     *
     * @mbg.generated
     */
    List<Ssdeliveryplace> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ssdeliveryplace
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Ssdeliveryplace record);
}