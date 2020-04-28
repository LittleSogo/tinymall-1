package com.example.tinymall.dao;

import com.example.tinymall.domain.TinymallBrand;
import com.example.tinymall.domain.TinymallBrandExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TinymallBrandMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_brand
     *
     * @mbg.generated
     */
    long countByExample(TinymallBrandExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_brand
     *
     * @mbg.generated
     */
    int deleteByExample(TinymallBrandExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_brand
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_brand
     *
     * @mbg.generated
     */
    int insert(TinymallBrand record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_brand
     *
     * @mbg.generated
     */
    int insertSelective(TinymallBrand record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_brand
     *
     * @mbg.generated
     */
    TinymallBrand selectOneByExample(TinymallBrandExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_brand
     *
     * @mbg.generated
     */
    TinymallBrand selectOneByExampleSelective(@Param("example") TinymallBrandExample example, @Param("selective") TinymallBrand.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_brand
     *
     * @mbg.generated
     */
    List<TinymallBrand> selectByExampleSelective(@Param("example") TinymallBrandExample example, @Param("selective") TinymallBrand.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_brand
     *
     * @mbg.generated
     */
    List<TinymallBrand> selectByExample(TinymallBrandExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_brand
     *
     * @mbg.generated
     */
    TinymallBrand selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") TinymallBrand.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_brand
     *
     * @mbg.generated
     */
    TinymallBrand selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_brand
     *
     * @mbg.generated
     */
    TinymallBrand selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_brand
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") TinymallBrand record, @Param("example") TinymallBrandExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_brand
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") TinymallBrand record, @Param("example") TinymallBrandExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_brand
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TinymallBrand record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_brand
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TinymallBrand record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_brand
     *
     * @mbg.generated
     */
    int logicalDeleteByExample(@Param("example") TinymallBrandExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_brand
     *
     * @mbg.generated
     */
    int logicalDeleteByPrimaryKey(Integer id);
}