package com.exue.entity;

import lombok.Data;

import java.util.Date;

/**
 * 节点
 * @author 86130
 */
@Data
public class CourseType {
    private String id;
    /**
     * 类型名称
     */
    private String title;



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
