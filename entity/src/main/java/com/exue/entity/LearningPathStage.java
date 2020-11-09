package com.exue.entity;

import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * 学习阶段
 * @author 86130
 */
@Data
public class LearningPathStage {
    private String id;
    /**
     * 标题
     */
    private String title;

    /**
     * 学习路线id
     */
    private String learningPathId;

    /**
     * 阶段课程
     */
    private List<LearningPathCourse> learningPathCourses;

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
