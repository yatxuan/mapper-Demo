package com.example.demo.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * <p>Description: 描述 </p>
 *
 * @Created with IDEA
 * @author: Yi-Xuan
 * @Date: 2019/1/6 0006
 * @Time: 19:27
 */
@Getter
@NoArgsConstructor
@AllArgsConstructor
public enum ExceptionEnum {

    /**
     * 数据新增失败
     */
    ADD_FAILED(400, "添加失败"),
    QUERY_FAILED(404, "查询失败"),
    FAIL_TO_EDIT(404, "修改失败"),
    DELETE_TO_FAILED(404, "删除失败"),
    ;
    private int code;
    private String message;
}
