package com.exue.utils;


import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 86130
 */
@Data
public class Result {

    /**
     * 是否成功
     */
    private Boolean success;

    /**
     * 返回状态码
     */
    private Integer code;

    /**
     * 返回信息
     */
    private String message;

    /**
     * 返回的数据
     */
    private Map<String, Object> data = new HashMap<String, Object>();


    /**
     * 把构造方法私有
     */
    private Result() {}

    /**
     * 成功静态方法
     */
    public static Result ok() {
        Result r = new Result();
        r.setSuccess(true);
        r.setCode(ResultCode.SUCCESS);
        r.setMessage("成功");
        return r;
    }


    /**
     * 失败静态方法
     */
    public static Result error() {
        Result r = new Result();
        r.setSuccess(false);
        r.setCode(ResultCode.ERROR);
        r.setMessage("失败");
        return r;
    }


    public Result success(Boolean success){
        this.setSuccess(success);
        return this;
    }

    public Result message(String message){
        this.setMessage(message);
        return this;
    }

    public Result code(Integer code){
        this.setCode(code);
        return this;
    }

    public Result data(String key, Object value){
        this.data.put(key, value);
        return this;
    }

    public Result data(Map<String, Object> map){
        this.setData(map);
        return this;
    }
}
