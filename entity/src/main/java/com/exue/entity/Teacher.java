package com.exue.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 讲师
 * @author 86130
 */
@Data
public class Teacher  implements Serializable {


    private static final long serialVersionUID = 1L;

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
     * 课程
     */
    private List<Course> courses;

    /**
     * 逻辑删除
     */
    private Boolean isDeleted;

    /**
     * 创建时间
     */
    private Date creationTime;

    /**
     * 更新时间
     */
    private Date updateTime;
}
