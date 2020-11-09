package com.exue.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 自定义异常
 * @author 86130
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EXueException extends RuntimeException{

    private Integer code;

    private String msg;
}
