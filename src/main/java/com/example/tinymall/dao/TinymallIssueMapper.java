package com.example.tinymall.dao;

import com.example.tinymall.domain.TinymallIssue;
import com.example.tinymall.domain.TinymallIssueExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TinymallIssueMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_issue
     *
     * @mbg.generated
     */
    long countByExample(TinymallIssueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_issue
     *
     * @mbg.generated
     */
    int deleteByExample(TinymallIssueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_issue
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_issue
     *
     * @mbg.generated
     */
    int insert(TinymallIssue record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_issue
     *
     * @mbg.generated
     */
    int insertSelective(TinymallIssue record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_issue
     *
     * @mbg.generated
     */
    TinymallIssue selectOneByExample(TinymallIssueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_issue
     *
     * @mbg.generated
     */
    TinymallIssue selectOneByExampleSelective(@Param("example") TinymallIssueExample example, @Param("selective") TinymallIssue.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_issue
     *
     * @mbg.generated
     */
    List<TinymallIssue> selectByExampleSelective(@Param("example") TinymallIssueExample example, @Param("selective") TinymallIssue.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_issue
     *
     * @mbg.generated
     */
    List<TinymallIssue> selectByExample(TinymallIssueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_issue
     *
     * @mbg.generated
     */
    TinymallIssue selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") TinymallIssue.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_issue
     *
     * @mbg.generated
     */
    TinymallIssue selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_issue
     *
     * @mbg.generated
     */
    TinymallIssue selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_issue
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") TinymallIssue record, @Param("example") TinymallIssueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_issue
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") TinymallIssue record, @Param("example") TinymallIssueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_issue
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TinymallIssue record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_issue
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TinymallIssue record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_issue
     *
     * @mbg.generated
     */
    int logicalDeleteByExample(@Param("example") TinymallIssueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_issue
     *
     * @mbg.generated
     */
    int logicalDeleteByPrimaryKey(Integer id);
}