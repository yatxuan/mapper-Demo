package com.example.demo.common.exception;

import com.example.demo.common.enums.ExceptionEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * <p>Description: 描述 </p>
 *
 * @Created with IDEA
 * @author: Yi-Xuan
 * @Date: 2019/1/8 0008
 * @Time: 19:39
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class BaseException extends RuntimeException {

    private ExceptionEnum exceptionEnum;

}
