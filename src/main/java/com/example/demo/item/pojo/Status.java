package com.example.demo.item.pojo;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * <p>Description: 测试实体类 </p>
 *
 * @Created with IDEA
 * @author: Yi-Xuan
 * @Date: 2019/1/8 0008
 * @Time: 20:23
 */
@Table
@Data
public class Status {

    @Id
    @KeySql(useGeneratedKeys = true)
    private Long id;

    @Column(name = "statusType")
    private String statusType;
}
