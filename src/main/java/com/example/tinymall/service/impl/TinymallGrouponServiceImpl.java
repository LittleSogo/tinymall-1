package com.example.tinymall.service.impl;

import com.example.tinymall.core.constants.GrouponConstant;
import com.example.tinymall.dao.TinymallGrouponMapper;
import com.example.tinymall.domain.TinymallGroupon;
import com.example.tinymall.domain.TinymallGrouponExample;
import com.example.tinymall.service.TinymallGrouponService;
import com.github.pagehelper.PageHelper;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.List;

/**
 * @ClassName TinymallGrouponServiceImpl
 * @Description
 * @Author jzf
 * @Date 2020-4-23 11:11
 */
@Service
public class TinymallGrouponServiceImpl implements TinymallGrouponService {
    @Resource
    private TinymallGrouponMapper mapper;

    @Override
    public List<TinymallGroupon> queryMyGroupon(Integer userId) {
        TinymallGrouponExample example = new TinymallGrouponExample();
        example.or().andUserIdEqualTo(userId).andCreatorUserIdEqualTo(userId).andGrouponIdEqualTo(0).andStatusNotEqualTo(GrouponConstant.STATUS_NONE).andDeletedEqualTo(false);
        example.orderBy("add_time desc");
        return mapper.selectByExample(example);
    }

    @Override
    public List<TinymallGroupon> queryMyJoinGroupon(Integer userId) {
        TinymallGrouponExample example = new TinymallGrouponExample();
        example.or().andUserIdEqualTo(userId).andGrouponIdNotEqualTo(0).andStatusNotEqualTo(GrouponConstant.STATUS_NONE).andDeletedEqualTo(false);
        example.orderBy("add_time desc");
        return mapper.selectByExample(example);
    }

    @Override
    public TinymallGroupon queryByOrderId(Integer orderId) {
        TinymallGrouponExample example = new TinymallGrouponExample();
        example.or().andOrderIdEqualTo(orderId).andDeletedEqualTo(false);
        return mapper.selectOneByExample(example);
    }

    @Override
    public List<TinymallGroupon> queryJoinRecord(Integer id) {
        TinymallGrouponExample example = new TinymallGrouponExample();
        example.or().andGrouponIdEqualTo(id).andStatusNotEqualTo(GrouponConstant.STATUS_NONE).andDeletedEqualTo(false);
        example.orderBy("add_time desc");
        return mapper.selectByExample(example);
    }

    @Override
    public TinymallGroupon queryById(Integer id) {
        TinymallGrouponExample example = new TinymallGrouponExample();
        example.or().andIdEqualTo(id).andDeletedEqualTo(false);
        return mapper.selectOneByExample(example);
    }

    @Override
    public TinymallGroupon queryById(Integer userId, Integer id) {
        TinymallGrouponExample example = new TinymallGrouponExample();
        example.or().andIdEqualTo(id).andUserIdEqualTo(id).andDeletedEqualTo(false);
        return mapper.selectOneByExample(example);
    }

    @Override
    public int countGroupon(Integer grouponId) {
        TinymallGrouponExample example = new TinymallGrouponExample();
        example.or().andGrouponIdEqualTo(grouponId).andStatusNotEqualTo(GrouponConstant.STATUS_NONE).andDeletedEqualTo(false);
        return (int) mapper.countByExample(example);
    }

    @Override
    public boolean hasJoin(Integer userId, Integer grouponId) {
        TinymallGrouponExample example = new TinymallGrouponExample();
        example.or().andUserIdEqualTo(userId).andGrouponIdEqualTo(grouponId).andStatusNotEqualTo(GrouponConstant.STATUS_NONE).andDeletedEqualTo(false);
        return mapper.countByExample(example) != 0;
    }

    @Override
    public int updateById(TinymallGroupon groupon) {
        groupon.setUpdateTime(LocalDateTime.now());
        return mapper.updateByPrimaryKeySelective(groupon);
    }

    @Override
    public int createGroupon(TinymallGroupon groupon) {
        groupon.setAddTime(LocalDateTime.now());
        groupon.setUpdateTime(LocalDateTime.now());
        return mapper.insertSelective(groupon);
    }

    @Override
    public List<TinymallGroupon> querySelective(String rulesId, Integer page, Integer size, String sort, String order) {
        TinymallGrouponExample example = new TinymallGrouponExample();
        TinymallGrouponExample.Criteria criteria = example.createCriteria();

        if (!StringUtils.isEmpty(rulesId)) {
            criteria.andRulesIdEqualTo(Integer.parseInt(rulesId));
        }
        criteria.andDeletedEqualTo(false);
        criteria.andStatusNotEqualTo(GrouponConstant.STATUS_NONE);
        criteria.andGrouponIdEqualTo(0);

        PageHelper.startPage(page, size);
        return mapper.selectByExample(example);
    }

    @Override
    public List<TinymallGroupon> queryByRuleId(int grouponRuleId) {
        TinymallGrouponExample example = new TinymallGrouponExample();
        example.or().andRulesIdEqualTo(grouponRuleId).andDeletedEqualTo(false);
        return mapper.selectByExample(example);
    }
}