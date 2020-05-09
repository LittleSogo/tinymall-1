package com.example.tinymall.entity;

import java.time.LocalDateTime;
import javax.persistence.*;

import com.example.tinymall.model.po.BasePO;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Table(name = "tinymall_category")
public class TinymallCategory extends BasePO<Integer> {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 类目名称
     */
    @Column(name = "`name`")
    private String name;

    /**
     * 类目关键字，以JSON数组格式
     */
    @Column(name = "keywords")
    private String keywords;

    /**
     * 类目广告语介绍
     */
    @Column(name = "`desc`")
    private String desc;

    /**
     * 父类目ID
     */
    @Column(name = "pid")
    private Integer pid;

    /**
     * 类目图标
     */
    @Column(name = "icon_url")
    private String iconUrl;

    /**
     * 类目图片
     */
    @Column(name = "pic_url")
    private String picUrl;

    @Column(name = "`level`")
    private String level;

    /**
     * 排序
     */
    @Column(name = "sort_order")
    private Byte sortOrder;
}