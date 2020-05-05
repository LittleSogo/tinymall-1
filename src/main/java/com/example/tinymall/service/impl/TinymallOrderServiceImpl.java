package com.example.tinymall.service.impl;

import com.example.tinymall.common.page.PageVO;
import com.example.tinymall.core.constants.OrderUtil;
import com.example.tinymall.dao.TinymallOrderMapper;
import com.example.tinymall.domain.TinymallOrder;
import com.example.tinymall.domain.TinymallOrderExample;
import com.example.tinymall.service.TinymallOrderService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.example.tinymall.core.util.CharUtil.getRandomNum;

/**
 * @ClassName TinymallOrderServiceImpl
 * @Description
 * @Author jzf
 * @Date 2020-4-11 17:46
 */
@Service
public class TinymallOrderServiceImpl implements TinymallOrderService {

    @Resource
    private TinymallOrderMapper orderMapper;

    @Override
    public Map<Object, Object> orderInfo(Integer userId) {
        TinymallOrderExample example = new TinymallOrderExample();
        example.or().andUserIdEqualTo(userId).andDeletedEqualTo(false);
        List<TinymallOrder> orders = orderMapper.selectByExampleSelective(example, TinymallOrder.Column.orderStatus, TinymallOrder.Column.comments);

        int unpaid = 0;
        int unship = 0;
        int unrecv = 0;
        int uncomment = 0;
        for (TinymallOrder order : orders) {
            if (OrderUtil.isCreateStatus(order)) {
                unpaid++;
            } else if (OrderUtil.isPayStatus(order)) {
                unship++;
            } else if (OrderUtil.isShipStatus(order)) {
                unrecv++;
            } else if (OrderUtil.isConfirmStatus(order) || OrderUtil.isAutoConfirmStatus(order)) {
                uncomment += order.getComments();
            } else {
                // do nothing
            }
        }

        Map<Object, Object> orderInfo = new HashMap<Object, Object>();
        orderInfo.put("unpaid", unpaid);
        orderInfo.put("unship", unship);
        orderInfo.put("unrecv", unrecv);
        orderInfo.put("uncomment", uncomment);
        return orderInfo;

    }

    public int countByOrderSn(Integer userId, String orderSn) {
        TinymallOrderExample example = new TinymallOrderExample();
        example.or().andUserIdEqualTo(userId).andOrderSnEqualTo(orderSn).andDeletedEqualTo(false);
        return (int) orderMapper.countByExample(example);
    }

    @Override
    public String generateOrderSn(Integer userId) {
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyyMMdd");
        String now = df.format(LocalDate.now());
        String orderSn = now + getRandomNum(6);
        while (countByOrderSn(userId, orderSn) != 0) {
            orderSn = now + getRandomNum(6);
        }
        return orderSn;
    }

    @Override
    public int add(TinymallOrder order) {
        order.setAddTime(LocalDateTime.now());
        order.setUpdateTime(LocalDateTime.now());
        return orderMapper.insertSelective(order);
    }

    @Override
    public TinymallOrder findById(Integer userId, Integer orderId) {
        TinymallOrderExample example = new TinymallOrderExample();
        example.or().andIdEqualTo(orderId).andUserIdEqualTo(userId).andDeletedEqualTo(false);
        return orderMapper.selectOneByExample(example);
    }

    @Override
    public TinymallOrder findById(Integer orderId) {
        return orderMapper.selectByPrimaryKey(orderId);
    }

    @Override
    public PageVO<TinymallOrder> queryByOrderStatus(Integer userId, List<Short> orderStatus, Integer pageNum, Integer limit, String orderBy) {
        TinymallOrderExample example = new TinymallOrderExample();
        example.setOrderByClause(TinymallOrder.Column.addTime.desc());
        TinymallOrderExample.Criteria criteria = example.or();
        criteria.andUserIdEqualTo(userId);
        if (orderStatus != null) {
            criteria.andOrderStatusIn(orderStatus);
        }
        criteria.andDeletedEqualTo(false);
        if (!StringUtils.isEmpty(orderBy)) {
            example.setOrderByClause(orderBy);
        }

        Page page = PageHelper.startPage(pageNum, limit);
        orderMapper.selectByExample(example);
        return PageVO.build(page);
    }
}
