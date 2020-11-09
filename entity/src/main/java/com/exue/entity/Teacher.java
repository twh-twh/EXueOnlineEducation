package com.exue.entity;

import lombok.Data;

import java.util.Date;

/**
 * 讲师
 * @author 86130
 */
@Data
public class Teacher {
    private String id;
    /**
     * 讲师花名
     */
    private String name;

    /**
     * 简介
     */
    private String intro;

    /**
     * 头像地址
     */
    private String avatar;



    /**
     * 逻辑删除
     */
    private Boolean delete;

    /**
     * 创建时间
     */
    private Date creationTime;

    /**
     * 更新时间
     */
    private Date updateTime;
}
