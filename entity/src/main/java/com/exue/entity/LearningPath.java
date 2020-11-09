package com.exue.entity;

import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * 学习路线
 * @author 86130
 */
@Data
public class LearningPath {
    private String id;

    /**
     * 标题
     */
    private String title;

    /**
     * 简介
     */
    private String intro;

    /**
     * 总时长
     */
    private Integer duration;


    /**
     * 阶段
     */
    private List<LearningPathStage> learningPathStages;

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
