package com.example.tinymall.service;

import com.example.tinymall.domain.TinymallCouponUser;

import java.util.List;

/**
 * @ClassName TinymallCouponUserService
 * @Description
 * @Author jzf
 * @Date 2020-4-14 20:14
 */
public interface TinymallCouponUserService {
    Integer countCoupon(Integer couponId);

    Integer countUserAndCoupon(Integer userId, Integer couponId);

    void add(TinymallCouponUser couponUser);

    List<TinymallCouponUser> queryList(Integer userId, Integer couponId, Short status, Integer page, Integer size, String sort, String order);

    List<TinymallCouponUser> queryAll(Integer userId, Integer couponId);
    List<TinymallCouponUser> queryAll(Integer userId);
    TinymallCouponUser queryOne(Integer userId, Integer couponId);

    TinymallCouponUser findById(Integer id);

    int update(TinymallCouponUser couponUser);

    List<TinymallCouponUser> queryExpired();
}
