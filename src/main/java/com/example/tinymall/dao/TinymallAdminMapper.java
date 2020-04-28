package com.example.tinymall.dao;

import com.example.tinymall.domain.TinymallAdmin;
import com.example.tinymall.domain.TinymallAdminExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TinymallAdminMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_admin
     *
     * @mbg.generated
     */
    long countByExample(TinymallAdminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_admin
     *
     * @mbg.generated
     */
    int deleteByExample(TinymallAdminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_admin
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_admin
     *
     * @mbg.generated
     */
    int insert(TinymallAdmin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_admin
     *
     * @mbg.generated
     */
    int insertSelective(TinymallAdmin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_admin
     *
     * @mbg.generated
     */
    TinymallAdmin selectOneByExample(TinymallAdminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_admin
     *
     * @mbg.generated
     */
    TinymallAdmin selectOneByExampleSelective(@Param("example") TinymallAdminExample example, @Param("selective") TinymallAdmin.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_admin
     *
     * @mbg.generated
     */
    List<TinymallAdmin> selectByExampleSelective(@Param("example") TinymallAdminExample example, @Param("selective") TinymallAdmin.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_admin
     *
     * @mbg.generated
     */
    List<TinymallAdmin> selectByExample(TinymallAdminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_admin
     *
     * @mbg.generated
     */
    TinymallAdmin selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") TinymallAdmin.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_admin
     *
     * @mbg.generated
     */
    TinymallAdmin selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_admin
     *
     * @mbg.generated
     */
    TinymallAdmin selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_admin
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") TinymallAdmin record, @Param("example") TinymallAdminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_admin
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") TinymallAdmin record, @Param("example") TinymallAdminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_admin
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TinymallAdmin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_admin
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TinymallAdmin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_admin
     *
     * @mbg.generated
     */
    int logicalDeleteByExample(@Param("example") TinymallAdminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_admin
     *
     * @mbg.generated
     */
    int logicalDeleteByPrimaryKey(Integer id);
}