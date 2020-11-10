package com.exue.entity;

import lombok.Data;

import java.util.Date;

/**
 * 限免课程
 * @author 86130
 */
@Data
public class Sale {
    private String id;

    /**
     * 课程
     */
    private Course course;

    /**
     * 到期时间
     */
    private Date expiration_time;

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
