package com.nf147.distrbution.dao;

import com.nf147.distrbution.entity.Sscityarea;
import java.util.List;

public interface SscityareaMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sscityarea
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String areaId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sscityarea
     *
     * @mbg.generated
     */
    int insert(Sscityarea record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sscityarea
     *
     * @mbg.generated
     */
    Sscityarea selectByPrimaryKey(String areaId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sscityarea
     *
     * @mbg.generated
     */
    List<Sscityarea> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sscityarea
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Sscityarea record);
}