package com.example.demo.common.service;

import org.springframework.lang.Nullable;

import java.util.List;

/**
 * <p>Description: 通用 Service 层 </p>
 *
 * @Created with IDEA
 * @author: Yi-Xuan
 * @Date: 2019/1/8 0008
 * @Time: 18:52
 */
public interface BaseService<T> {

    /**
     *  删除
     * @param t 实体类
     * @return
     */
    int deleteById(T t);

    /**
     * 公共添加 方法
     * @param t 实体类
     * @return
     */
    int save(T t);

    /**
     * 通过id查询
     * @param t 实体类
     * @return
     */
    T findById(T t);

    /**
     * 分页查询所有
     * @param pageNum 当前页面
     * @param pageSize 每页多少数据
     * @return
     */
    @Nullable
    List<T> findAll(int pageNum,int pageSize);

    /**
     * 修改
     * @param t
     * @return
     */
    int update(T t);
}
