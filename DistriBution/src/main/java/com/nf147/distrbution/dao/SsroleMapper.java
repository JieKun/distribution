package com.nf147.distrbution.dao;

import com.nf147.distrbution.entity.Ssrole;
import java.util.List;

public interface SsroleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ssrole
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String roleId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ssrole
     *
     * @mbg.generated
     */
    int insert(Ssrole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ssrole
     *
     * @mbg.generated
     */
    Ssrole selectByPrimaryKey(String roleId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ssrole
     *
     * @mbg.generated
     */
    List<Ssrole> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ssrole
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Ssrole record);
}