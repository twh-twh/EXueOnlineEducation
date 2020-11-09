package com.exue.entity;

import lombok.Data;

import java.util.Date;

/**
 * 视频
 * @author 86130
 */
@Data
public class Video {
    private String id;
    /**
     * 章节
     */
    private String sectionId;

    /**
     * 名称
     */
    private String title;

    /**
     * 视频路径
     */
    private String path;

    /**
     * 排序
     */
    private Integer sort;



    /**
     * 创建时间
     */
    private Date creationTime;

    /**
     * 更新时间
     */
    private Date updateTime;
}
