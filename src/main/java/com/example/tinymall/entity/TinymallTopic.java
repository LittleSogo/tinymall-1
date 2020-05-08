package com.example.tinymall.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Table(name = "tinymall_topic")
public class TinymallTopic {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 专题标题
     */
    @Column(name = "title")
    private String title;

    /**
     * 专题子标题
     */
    @Column(name = "subtitle")
    private String subtitle;

    /**
     * 专题相关商品最低价
     */
    @Column(name = "price")
    private BigDecimal price;

    /**
     * 专题阅读量
     */
    @Column(name = "read_count")
    private String readCount;

    /**
     * 专题图片
     */
    @Column(name = "pic_url")
    private String picUrl;

    /**
     * 排序
     */
    @Column(name = "sort_order")
    private Integer sortOrder;

    /**
     * 专题相关商品，采用JSON数组格式
     */
    //@Column(name = "goods")
    //private Integer[] goods;

    /**
     * 创建时间
     */
    @Column(name = "add_time")
    private LocalDateTime addTime;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private LocalDateTime updateTime;

    /**
     * 逻辑删除
     */
    @Column(name = "deleted")
    private Boolean deleted;

    /**
     * 专题内容，富文本格式
     */
    @Column(name = "content")
    private String content;
}