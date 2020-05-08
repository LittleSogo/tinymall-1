package com.example.tinymall.mapper;

import org.apache.ibatis.annotations.Param;

/**
 * @ClassName GoodsProductMapper
 * @Description
 * @Author jzf
 * @Date 2020-5-8 17:21
 */
public interface GoodsProductMapper {
    int addStock(@Param("id") Integer id, @Param("num") Short num);

    int reduceStock(@Param("id") Integer id, @Param("num") Short num);
}
