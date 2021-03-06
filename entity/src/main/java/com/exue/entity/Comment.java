package com.exue.entity;


import lombok.Data;

import java.util.Date;

/**
 * 评论
 * @author 86130
 */
@Data
public class Comment {
    private String id;

    /**
     * 课程
     */
    private String courseId;

    /**
     * 学员
     */
    private User user;

    /**
     * 评论内容
     */
    private String content;



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
