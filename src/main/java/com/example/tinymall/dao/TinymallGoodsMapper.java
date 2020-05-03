package com.example.tinymall.dao;

import com.example.tinymall.domain.TinymallGoods;
import com.example.tinymall.domain.TinymallGoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TinymallGoodsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_goods
     *
     * @mbg.generated
     */
    long countByExample(TinymallGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_goods
     *
     * @mbg.generated
     */
    int deleteByExample(TinymallGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_goods
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_goods
     *
     * @mbg.generated
     */
    int insert(TinymallGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_goods
     *
     * @mbg.generated
     */
    int insertSelective(TinymallGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_goods
     *
     * @mbg.generated
     */
    TinymallGoods selectOneByExample(TinymallGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_goods
     *
     * @mbg.generated
     */
    TinymallGoods selectOneByExampleSelective(@Param("example") TinymallGoodsExample example, @Param("selective") TinymallGoods.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_goods
     *
     * @mbg.generated
     */
    TinymallGoods selectOneByExampleWithBLOBs(TinymallGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_goods
     *
     * @mbg.generated
     */
    List<TinymallGoods> selectByExampleSelective(@Param("example") TinymallGoodsExample example, @Param("selective") TinymallGoods.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_goods
     *
     * @mbg.generated
     */
    List<TinymallGoods> selectByExampleWithBLOBs(TinymallGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_goods
     *
     * @mbg.generated
     */
    List<TinymallGoods> selectByExample(TinymallGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_goods
     *
     * @mbg.generated
     */
    TinymallGoods selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") TinymallGoods.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_goods
     *
     * @mbg.generated
     */
    TinymallGoods selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_goods
     *
     * @mbg.generated
     */
    TinymallGoods selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_goods
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") TinymallGoods record, @Param("example") TinymallGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_goods
     *
     * @mbg.generated
     */
    int updateByExampleWithBLOBs(@Param("record") TinymallGoods record, @Param("example") TinymallGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_goods
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") TinymallGoods record, @Param("example") TinymallGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_goods
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TinymallGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_goods
     *
     * @mbg.generated
     */
    int updateByPrimaryKeyWithBLOBs(TinymallGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_goods
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TinymallGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_goods
     *
     * @mbg.generated
     */
    int logicalDeleteByExample(@Param("example") TinymallGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_goods
     *
     * @mbg.generated
     */
    int logicalDeleteByPrimaryKey(Integer id);
}