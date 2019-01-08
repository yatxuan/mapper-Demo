package com.example.demo.common.entity;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Column;
import javax.persistence.Id;

/**
 * <p>Description: 把主键id提前出来，作为一个单独的类</p>
 *
 * @Created with IDEA
 * @author: Yi-Xuan
 * @Date: 2019/1/8 0008
 * @Time: 22:31
 */
@Data
public class BaseEntity {

    @Id
    @Column(name = "id")
    @KeySql(useGeneratedKeys = true)
    private String id;
}
