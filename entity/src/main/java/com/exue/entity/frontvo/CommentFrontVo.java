package com.exue.entity.frontvo;


import lombok.Data;

/**
 * 评论条件类
 * @author 86130
 */
@Data
public class CommentFrontVo {
    private String courseId;
    private Integer pageNum;
    private Integer pageSize;
}
