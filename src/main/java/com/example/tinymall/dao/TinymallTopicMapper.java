package com.example.tinymall.dao;

import com.example.tinymall.domain.TinymallTopic;
import com.example.tinymall.domain.TinymallTopicExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TinymallTopicMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_topic
     *
     * @mbg.generated
     */
    long countByExample(TinymallTopicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_topic
     *
     * @mbg.generated
     */
    int deleteByExample(TinymallTopicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_topic
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_topic
     *
     * @mbg.generated
     */
    int insert(TinymallTopic record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_topic
     *
     * @mbg.generated
     */
    int insertSelective(TinymallTopic record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_topic
     *
     * @mbg.generated
     */
    TinymallTopic selectOneByExample(TinymallTopicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_topic
     *
     * @mbg.generated
     */
    TinymallTopic selectOneByExampleSelective(@Param("example") TinymallTopicExample example, @Param("selective") TinymallTopic.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_topic
     *
     * @mbg.generated
     */
    TinymallTopic selectOneByExampleWithBLOBs(TinymallTopicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_topic
     *
     * @mbg.generated
     */
    List<TinymallTopic> selectByExampleSelective(@Param("example") TinymallTopicExample example, @Param("selective") TinymallTopic.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_topic
     *
     * @mbg.generated
     */
    List<TinymallTopic> selectByExampleWithBLOBs(TinymallTopicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_topic
     *
     * @mbg.generated
     */
    List<TinymallTopic> selectByExample(TinymallTopicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_topic
     *
     * @mbg.generated
     */
    TinymallTopic selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") TinymallTopic.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_topic
     *
     * @mbg.generated
     */
    TinymallTopic selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_topic
     *
     * @mbg.generated
     */
    TinymallTopic selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_topic
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") TinymallTopic record, @Param("example") TinymallTopicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_topic
     *
     * @mbg.generated
     */
    int updateByExampleWithBLOBs(@Param("record") TinymallTopic record, @Param("example") TinymallTopicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_topic
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") TinymallTopic record, @Param("example") TinymallTopicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_topic
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TinymallTopic record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_topic
     *
     * @mbg.generated
     */
    int updateByPrimaryKeyWithBLOBs(TinymallTopic record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_topic
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TinymallTopic record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_topic
     *
     * @mbg.generated
     */
    int logicalDeleteByExample(@Param("example") TinymallTopicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_topic
     *
     * @mbg.generated
     */
    int logicalDeleteByPrimaryKey(Integer id);
}