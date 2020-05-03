package com.example.tinymall.dao;

import com.example.tinymall.domain.TinymallFeedback;
import com.example.tinymall.domain.TinymallFeedbackExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TinymallFeedbackMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_feedback
     *
     * @mbg.generated
     */
    long countByExample(TinymallFeedbackExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_feedback
     *
     * @mbg.generated
     */
    int deleteByExample(TinymallFeedbackExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_feedback
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_feedback
     *
     * @mbg.generated
     */
    int insert(TinymallFeedback record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_feedback
     *
     * @mbg.generated
     */
    int insertSelective(TinymallFeedback record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_feedback
     *
     * @mbg.generated
     */
    TinymallFeedback selectOneByExample(TinymallFeedbackExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_feedback
     *
     * @mbg.generated
     */
    TinymallFeedback selectOneByExampleSelective(@Param("example") TinymallFeedbackExample example, @Param("selective") TinymallFeedback.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_feedback
     *
     * @mbg.generated
     */
    List<TinymallFeedback> selectByExampleSelective(@Param("example") TinymallFeedbackExample example, @Param("selective") TinymallFeedback.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_feedback
     *
     * @mbg.generated
     */
    List<TinymallFeedback> selectByExample(TinymallFeedbackExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_feedback
     *
     * @mbg.generated
     */
    TinymallFeedback selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") TinymallFeedback.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_feedback
     *
     * @mbg.generated
     */
    TinymallFeedback selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_feedback
     *
     * @mbg.generated
     */
    TinymallFeedback selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_feedback
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") TinymallFeedback record, @Param("example") TinymallFeedbackExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_feedback
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") TinymallFeedback record, @Param("example") TinymallFeedbackExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_feedback
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TinymallFeedback record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_feedback
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TinymallFeedback record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_feedback
     *
     * @mbg.generated
     */
    int logicalDeleteByExample(@Param("example") TinymallFeedbackExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_feedback
     *
     * @mbg.generated
     */
    int logicalDeleteByPrimaryKey(Integer id);
}