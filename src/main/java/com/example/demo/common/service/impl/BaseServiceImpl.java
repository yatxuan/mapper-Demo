package com.example.demo.common.service.impl;

import com.example.demo.common.dao.BaseDao;
import com.example.demo.common.entity.BaseEntity;
import com.example.demo.common.service.BaseService;
import com.example.demo.common.utils.IdWorker;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import lombok.Getter;
import lombok.Setter;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>Description: 通用Service </p>
 *
 * @Created with IDEA
 * @author: Yi-Xuan
 * @Date: 2019/1/8 0008
 * @Time: 19:02
 */
@Getter
@Setter
public class BaseServiceImpl<T extends BaseEntity, Mapper extends BaseDao<T>> implements BaseService<T> {

    private Mapper mapper;

    @Resource
    private IdWorker idWorker;

    @Override
    public int deleteById(T t) {
        return this.getMapper().deleteByPrimaryKey(t);
    }

    @Override
    public int save(T t) {
        t.setId(idWorker.nextId() + "");
        return this.getMapper().insert(t);
    }

    @Override
    public T findById(T t) {
        return this.getMapper().selectByPrimaryKey(t);
    }

    @Override
    public List<T> findAll(int pageNum, int pageSize) {

        Page page = new Page();
        page.setPageNum(pageNum);
        page.setPageSize(pageSize);

        PageHelper.startPage(page.getPageNum(), page.getPageSize());
        return this.getMapper().selectAll();
    }

    @Override
    public int update(T t) {
        return this.getMapper().updateByPrimaryKeySelective(t);
    }

}
