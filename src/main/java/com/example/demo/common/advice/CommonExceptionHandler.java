package com.example.demo.common.advice;

import com.example.demo.common.exception.BaseException;
import com.example.demo.common.vo.ExceptionResult;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * <p>Description: 通用异常处理类 </p>
 *
 * @Created with IDEA
 * @author: Yi-Xuan
 * @Date: 2019/1/5 0005
 * @Time: 14:10
 */
@ControllerAdvice
public class CommonExceptionHandler {

    @ExceptionHandler(BaseException.class)
    public ResponseEntity<ExceptionResult> handleException(BaseException e) {
        return ResponseEntity.status(e.getExceptionEnum().getCode())
                .body(new ExceptionResult(e.getExceptionEnum()));
    }
}
