package com.exue.entity;

import lombok.Data;

import java.util.Date;

/**
 * 活动课程
 * @author 86130
 */
@Data
public class Activity {
    private String id;

    /**
     * 课程
     */
    private Course course;

    /**
     * 标题
     */
    private String title;

    /**
     * 简介
     */
    private String intro;

    /**
     * 活动价
     */
    private Integer price;


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
