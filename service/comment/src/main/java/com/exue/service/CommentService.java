package com.exue.service;

import com.exue.entity.Comment;

import java.util.List;

/**
 * @author 86130
 */
public interface CommentService {

    /**
     * 添加评论
     * @param comment
     */
    void addComment(Comment comment);

    /**
     * 删除评论
     * @param id
     */
    void deleteCommentById(String id);

    /**
     * 根据课程id获取全部评论
     * @param pageNum
     * @param pageSize
     * @param courseId
     * @return
     */
    List<Comment> getAllCommentByCourseId(Integer pageNum, Integer pageSize, String courseId);

    /**
     * 根据课程id统计数量
     * @param courseId
     * @return
     */
    Integer getCountByCourseId(String courseId);
}
