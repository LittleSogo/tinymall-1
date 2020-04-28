package com.example.tinymall.dao;

import com.example.tinymall.domain.TinymallOrderGoods;
import com.example.tinymall.domain.TinymallOrderGoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TinymallOrderGoodsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_order_goods
     *
     * @mbg.generated
     */
    long countByExample(TinymallOrderGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_order_goods
     *
     * @mbg.generated
     */
    int deleteByExample(TinymallOrderGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_order_goods
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_order_goods
     *
     * @mbg.generated
     */
    int insert(TinymallOrderGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_order_goods
     *
     * @mbg.generated
     */
    int insertSelective(TinymallOrderGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_order_goods
     *
     * @mbg.generated
     */
    TinymallOrderGoods selectOneByExample(TinymallOrderGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_order_goods
     *
     * @mbg.generated
     */
    TinymallOrderGoods selectOneByExampleSelective(@Param("example") TinymallOrderGoodsExample example, @Param("selective") TinymallOrderGoods.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_order_goods
     *
     * @mbg.generated
     */
    List<TinymallOrderGoods> selectByExampleSelective(@Param("example") TinymallOrderGoodsExample example, @Param("selective") TinymallOrderGoods.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_order_goods
     *
     * @mbg.generated
     */
    List<TinymallOrderGoods> selectByExample(TinymallOrderGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_order_goods
     *
     * @mbg.generated
     */
    TinymallOrderGoods selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") TinymallOrderGoods.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_order_goods
     *
     * @mbg.generated
     */
    TinymallOrderGoods selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_order_goods
     *
     * @mbg.generated
     */
    TinymallOrderGoods selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_order_goods
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") TinymallOrderGoods record, @Param("example") TinymallOrderGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_order_goods
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") TinymallOrderGoods record, @Param("example") TinymallOrderGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_order_goods
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TinymallOrderGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_order_goods
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TinymallOrderGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_order_goods
     *
     * @mbg.generated
     */
    int logicalDeleteByExample(@Param("example") TinymallOrderGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_order_goods
     *
     * @mbg.generated
     */
    int logicalDeleteByPrimaryKey(Integer id);
}