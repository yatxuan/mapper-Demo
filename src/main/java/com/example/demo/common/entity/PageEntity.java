package com.example.demo.common.entity;

import lombok.Data;

import javax.persistence.Transient;

/**
 * <p>Description: 分页类 </p>
 *
 * @Created with IDEA
 * @author: Yi-Xuan
 * @Date: 2019/1/8 0008
 * @Time: 19:24
 */
@Data

public class PageEntity {

    /**
     * 当前页面
     * @Transient  表明表中没有该字段
     */
    @Transient
    private Integer pageNum = 1;

    /**
     * 当前显示的数据
     * @Transient  表明表中没有该字段
     */
    @Transient
    private Integer pageSize = 5;
}
