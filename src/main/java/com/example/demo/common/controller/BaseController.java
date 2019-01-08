package com.example.demo.common.controller;

import com.example.demo.common.entity.BaseEntity;
import com.example.demo.common.enums.ExceptionEnum;
import com.example.demo.common.exception.BaseException;
import com.example.demo.common.service.BaseService;
import com.github.pagehelper.PageInfo;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>Description: 通用Controller </p>
 *
 * @Created with IDEA
 * @author: Yi-Xuan
 * @Date: 2019/1/8 0008
 * @Time: 18:51
 */
@Getter
@Setter
@RestController
public abstract class BaseController<T extends BaseEntity, Service extends BaseService<T>> {

    private Service service;

    /**
     * 添加
     *
     * @param t 实体类
     * @return
     */
    @PostMapping("/save")
    public ResponseEntity<Integer> save(@RequestBody T t) {

        int save = this.getService().save(t);

        if (save <= 0) {
            throw new BaseException(ExceptionEnum.ADD_FAILED);
        }

        return ResponseEntity.ok(save);
    }

    /**
     * 通过 ID 查询数据
     *
     * @param t 实体类
     * @return
     */
    @GetMapping("/findById")
    public ResponseEntity<T> findById(T t) {
        T byId = this.getService().findById(t);

        if (byId == null) {
            throw new BaseException(ExceptionEnum.QUERY_FAILED);
        }

        return ResponseEntity.ok(byId);
    }

    /**
     * 查询所有
     *
     * @param pageNum  当前页面
     * @param pageSize 每页多少数据
     * @return
     */
    @GetMapping("/findAll")
    public ResponseEntity<PageInfo<T>> findAll(@RequestParam(name = "pageNum",required = false,defaultValue = "0") int pageNum,
                                               @RequestParam(name = "pageSize",required = false,defaultValue = "15") int pageSize) {
        List<T> list = this.getService().findAll(pageNum, pageSize);

        if (CollectionUtils.isEmpty(list)) {
            throw new BaseException(ExceptionEnum.QUERY_FAILED);
        }
        return ResponseEntity.ok(new PageInfo<>(list));
    }

    @PutMapping("/update")
    public ResponseEntity<Integer> update(@RequestBody T t) {
        int update = this.getService().update(t);

        if (update <= 0) {
            throw new BaseException(ExceptionEnum.FAIL_TO_EDIT);
        }

        return ResponseEntity.ok(update);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<Integer> deleteById(@RequestBody T t) {
        int delete = this.getService().deleteById(t);

        if (delete <= 0) {
            throw new BaseException(ExceptionEnum.DELETE_TO_FAILED);
        }

        return ResponseEntity.ok(delete);
    }
}
