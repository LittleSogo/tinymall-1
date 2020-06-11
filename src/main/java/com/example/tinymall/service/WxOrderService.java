package com.example.tinymall.service;

import com.example.tinymall.common.page.PageQO;
import com.example.tinymall.common.page.PageVO;
import com.example.tinymall.entity.TinymallOrder;
import com.example.tinymall.model.bo.OrderInfo;
import com.example.tinymall.model.bo.UserCartInfo;
import com.example.tinymall.model.dto.UserOrderParam;

import javax.servlet.http.HttpServletRequest;

/**
 * @ClassName WxOrderService
 * @Description
 * @Author jzf
 * @Date 2020-4-23 11:02
 */
public interface WxOrderService {
    Object submit(Integer userId, UserCartInfo userCartInfo);

    Object prepay(Integer userId, OrderInfo orderInfo, HttpServletRequest request);

    PageVO<TinymallOrder> list(PageQO pageQO, UserOrderParam condition);

    Object detail(Integer userId, Integer orderId);
}
