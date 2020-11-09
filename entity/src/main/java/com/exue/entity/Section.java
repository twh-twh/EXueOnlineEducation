package com.exue.entity;

import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * 章节
 * @author 86130
 */
@Data
public class Section {
    private String id;
    /**
     * 课程
     */
    private String courseId;

    /**
     * 标题
     */
    private String title;

    /**
     * 排序
     */
    private Integer sort;

    /**
     * 小节视频
     */
    private List<Video> videos;

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
