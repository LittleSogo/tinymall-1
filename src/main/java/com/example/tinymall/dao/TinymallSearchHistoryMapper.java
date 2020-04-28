package com.example.tinymall.dao;

import com.example.tinymall.domain.TinymallSearchHistory;
import com.example.tinymall.domain.TinymallSearchHistoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TinymallSearchHistoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_search_history
     *
     * @mbg.generated
     */
    long countByExample(TinymallSearchHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_search_history
     *
     * @mbg.generated
     */
    int deleteByExample(TinymallSearchHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_search_history
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_search_history
     *
     * @mbg.generated
     */
    int insert(TinymallSearchHistory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_search_history
     *
     * @mbg.generated
     */
    int insertSelective(TinymallSearchHistory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_search_history
     *
     * @mbg.generated
     */
    TinymallSearchHistory selectOneByExample(TinymallSearchHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_search_history
     *
     * @mbg.generated
     */
    TinymallSearchHistory selectOneByExampleSelective(@Param("example") TinymallSearchHistoryExample example, @Param("selective") TinymallSearchHistory.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_search_history
     *
     * @mbg.generated
     */
    List<TinymallSearchHistory> selectByExampleSelective(@Param("example") TinymallSearchHistoryExample example, @Param("selective") TinymallSearchHistory.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_search_history
     *
     * @mbg.generated
     */
    List<TinymallSearchHistory> selectByExample(TinymallSearchHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_search_history
     *
     * @mbg.generated
     */
    TinymallSearchHistory selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") TinymallSearchHistory.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_search_history
     *
     * @mbg.generated
     */
    TinymallSearchHistory selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_search_history
     *
     * @mbg.generated
     */
    TinymallSearchHistory selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_search_history
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") TinymallSearchHistory record, @Param("example") TinymallSearchHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_search_history
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") TinymallSearchHistory record, @Param("example") TinymallSearchHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_search_history
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TinymallSearchHistory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_search_history
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TinymallSearchHistory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_search_history
     *
     * @mbg.generated
     */
    int logicalDeleteByExample(@Param("example") TinymallSearchHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_search_history
     *
     * @mbg.generated
     */
    int logicalDeleteByPrimaryKey(Integer id);
}