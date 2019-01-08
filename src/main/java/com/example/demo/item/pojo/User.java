package com.example.demo.item.pojo;

import com.example.demo.common.entity.BaseEntity;
import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * <p>Description: 描述 </p>
 *
 * @Created with IDEA
 * @author: Yi-Xuan
 * @Date: 2019/1/8 0008
 * @Time: 22:21
 */
@Table(name = "user")
@Data
public class User extends BaseEntity implements Serializable {

    @Column(name = "userName")
    private String userName;

    @Column(name = "passWord")
    private String passWord;

    @Column(name = "sex")
    private Integer sex;

    @Column(name = "age")
    private Integer age;


}
