package com.exue.entity;

import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * 课程
 * @author 86130
 */
@Data
public class Course {
    private String id;

    /**
     * 讲师
     */
    private Teacher teacher;

    /**
     * 课程类型
     */
    private CourseType courseType;

    /**
     * 标题
     */
    private String title;

    /**
     * 简介
     */
    private String intro;

    /**
     * 价格
     */
    private Integer price;

    /**
     *  预计总课时
     */
    private Integer lesson_num;

    /**
     * 封面路径
     */
    private String cover;

    /**
     * 上架状态
     */
    private Boolean status;

    /**
     * 评论
     */
    private List<Comment> comments;

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
