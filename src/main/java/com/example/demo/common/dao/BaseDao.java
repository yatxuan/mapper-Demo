package com.example.demo.common.dao;

import com.example.demo.common.entity.BaseEntity;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * <p>Description: 通用Mapper </p>
 *
 * @Created with IDEA
 * @author: Yi-Xuan
 * @Date: 2019/1/8 0008
 * @Time: 19:02
 */
public interface BaseDao<T extends BaseEntity> extends Mapper<T>, MySqlMapper<T> {
}
