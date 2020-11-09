package com.exue.entity;

import lombok.Data;

import java.util.Date;

/**
 * 学习课程
 * @author 86130
 */
@Data
public class LearningPathCourse {
    private String id;

    /**
     * 阶段
     */
    private String stageId;

    /**
     * 课程
     */
    private Course course;



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
