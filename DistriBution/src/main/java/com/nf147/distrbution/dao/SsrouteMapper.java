package com.nf147.distrbution.dao;

import com.nf147.distrbution.entity.Ssroute;
import java.util.List;

public interface SsrouteMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ssroute
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String routeId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ssroute
     *
     * @mbg.generated
     */
    int insert(Ssroute record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ssroute
     *
     * @mbg.generated
     */
    Ssroute selectByPrimaryKey(String routeId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ssroute
     *
     * @mbg.generated
     */
    List<Ssroute> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ssroute
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Ssroute record);
}