package com.nf147.distrbution.dao;

import com.nf147.distrbution.entity.Ssorder;
import java.util.List;

public interface SsorderMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ssorder
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String orderId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ssorder
     *
     * @mbg.generated
     */
    int insert(Ssorder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ssorder
     *
     * @mbg.generated
     */
    Ssorder selectByPrimaryKey(String orderId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ssorder
     *
     * @mbg.generated
     */
    List<Ssorder> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ssorder
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Ssorder record);
}