package com.example.tinymall.dao;

import com.example.tinymall.domain.TinymallGrouponRules;
import com.example.tinymall.domain.TinymallGrouponRulesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TinymallGrouponRulesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_groupon_rules
     *
     * @mbg.generated
     */
    long countByExample(TinymallGrouponRulesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_groupon_rules
     *
     * @mbg.generated
     */
    int deleteByExample(TinymallGrouponRulesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_groupon_rules
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_groupon_rules
     *
     * @mbg.generated
     */
    int insert(TinymallGrouponRules record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_groupon_rules
     *
     * @mbg.generated
     */
    int insertSelective(TinymallGrouponRules record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_groupon_rules
     *
     * @mbg.generated
     */
    TinymallGrouponRules selectOneByExample(TinymallGrouponRulesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_groupon_rules
     *
     * @mbg.generated
     */
    TinymallGrouponRules selectOneByExampleSelective(@Param("example") TinymallGrouponRulesExample example, @Param("selective") TinymallGrouponRules.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_groupon_rules
     *
     * @mbg.generated
     */
    List<TinymallGrouponRules> selectByExampleSelective(@Param("example") TinymallGrouponRulesExample example, @Param("selective") TinymallGrouponRules.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_groupon_rules
     *
     * @mbg.generated
     */
    List<TinymallGrouponRules> selectByExample(TinymallGrouponRulesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_groupon_rules
     *
     * @mbg.generated
     */
    TinymallGrouponRules selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") TinymallGrouponRules.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_groupon_rules
     *
     * @mbg.generated
     */
    TinymallGrouponRules selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_groupon_rules
     *
     * @mbg.generated
     */
    TinymallGrouponRules selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_groupon_rules
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") TinymallGrouponRules record, @Param("example") TinymallGrouponRulesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_groupon_rules
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") TinymallGrouponRules record, @Param("example") TinymallGrouponRulesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_groupon_rules
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TinymallGrouponRules record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_groupon_rules
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TinymallGrouponRules record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_groupon_rules
     *
     * @mbg.generated
     */
    int logicalDeleteByExample(@Param("example") TinymallGrouponRulesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_groupon_rules
     *
     * @mbg.generated
     */
    int logicalDeleteByPrimaryKey(Integer id);
}