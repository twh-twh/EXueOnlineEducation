package com.exue.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;

import java.util.Date;

/**
 * 收藏表
 * @author 86130
 */
@Data
public class Collect {

    private String id;

    /**
     * 课程id
     */
    private Course course;

    /**
     * 学员id
     */
    private User user;

    /**
     * 创建时间
     */
    private Date creationTime;

    /**
     * 更新时间
     */
    private Date updateTime;

}
