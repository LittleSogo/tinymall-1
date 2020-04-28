package com.example.tinymall.dao;

import com.example.tinymall.domain.TinymallFootprint;
import com.example.tinymall.domain.TinymallFootprintExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TinymallFootprintMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_footprint
     *
     * @mbg.generated
     */
    long countByExample(TinymallFootprintExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_footprint
     *
     * @mbg.generated
     */
    int deleteByExample(TinymallFootprintExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_footprint
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_footprint
     *
     * @mbg.generated
     */
    int insert(TinymallFootprint record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_footprint
     *
     * @mbg.generated
     */
    int insertSelective(TinymallFootprint record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_footprint
     *
     * @mbg.generated
     */
    TinymallFootprint selectOneByExample(TinymallFootprintExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_footprint
     *
     * @mbg.generated
     */
    TinymallFootprint selectOneByExampleSelective(@Param("example") TinymallFootprintExample example, @Param("selective") TinymallFootprint.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_footprint
     *
     * @mbg.generated
     */
    List<TinymallFootprint> selectByExampleSelective(@Param("example") TinymallFootprintExample example, @Param("selective") TinymallFootprint.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_footprint
     *
     * @mbg.generated
     */
    List<TinymallFootprint> selectByExample(TinymallFootprintExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_footprint
     *
     * @mbg.generated
     */
    TinymallFootprint selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") TinymallFootprint.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_footprint
     *
     * @mbg.generated
     */
    TinymallFootprint selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_footprint
     *
     * @mbg.generated
     */
    TinymallFootprint selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_footprint
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") TinymallFootprint record, @Param("example") TinymallFootprintExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_footprint
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") TinymallFootprint record, @Param("example") TinymallFootprintExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_footprint
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TinymallFootprint record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_footprint
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TinymallFootprint record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_footprint
     *
     * @mbg.generated
     */
    int logicalDeleteByExample(@Param("example") TinymallFootprintExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_footprint
     *
     * @mbg.generated
     */
    int logicalDeleteByPrimaryKey(Integer id);
}