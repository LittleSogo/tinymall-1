package com.example.tinymall.service.impl;

import com.example.tinymall.common.mineservice.impl.BaseMySqlServiceImpl;
import com.example.tinymall.entity.TinymallCategory;
import com.example.tinymall.mapper.TinymallCategoryMapper;
import com.example.tinymall.service.TinymallCategoryService;
import com.github.pagehelper.PageHelper;
import com.google.common.collect.Lists;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName TinymallCategoryService
 * @Description
 * @Author jzf
 * @Date 2020-4-11 10:34
 */
@Service
public class TinymallCategoryServiceImpl extends BaseMySqlServiceImpl<TinymallCategory,Integer> implements TinymallCategoryService {

    @Resource
    private TinymallCategoryMapper categoryMapper;

    @Override
    public List<TinymallCategory> queryChannel() {
        TinymallCategory tinymallCategory = new TinymallCategory();
        tinymallCategory.setLevel("L1");
        tinymallCategory.setDeleted(0);
        return categoryMapper.select(tinymallCategory);
    }

    @Override
    public List<TinymallCategory> queryByPid(Integer pid) {
        return categoryMapper.selectValidCategory(pid);
    }

    @Override
    public List<TinymallCategory> queryL2ByIds(List<Integer> ids) {
        TinymallCategory tinymallCategory = new TinymallCategory();
        tinymallCategory.setLevel("L2");
        tinymallCategory.setDeleted(0);
        return categoryMapper.select(tinymallCategory);
    }
}
