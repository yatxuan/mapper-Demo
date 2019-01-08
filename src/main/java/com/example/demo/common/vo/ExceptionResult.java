package com.example.demo.common.vo;

import com.example.demo.common.enums.ExceptionEnum;
import lombok.Data;

/**
 * <p>Description: 描述 </p>
 *
 * @Created with IDEA
 * @author: Yi-Xuan
 * @Date: 2019/1/6 0006
 * @Time: 19:35
 */
@Data
public class ExceptionResult {

    /**
     * 状态码
     */
    private int status;

    /**
     * 报错信息
     */
    private String message;

    /**
     * 报错时间
     */
    private Long timestamp;

    public ExceptionResult(ExceptionEnum em) {
        this.status = em.getCode();
        this.message = em.getMessage();
        this.timestamp = System.currentTimeMillis();
    }
}
