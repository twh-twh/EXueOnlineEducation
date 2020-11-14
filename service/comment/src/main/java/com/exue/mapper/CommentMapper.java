package com.exue.mapper;

import com.exue.entity.Comment;

import java.util.List;

/**
 * @author 86130
 */
public interface CommentMapper {

    /**
     * 插入评论
     * @param comment
     */
    void insertComment(Comment comment);

    /**
     * 根据id删除评论
     * @param id
     */
    void deleteCommentById(String id);

    /**
     *
     * @param id
     * @return
     */
    List<Comment> selectAllCommentByCourseId(String id);

    /**
     * 根据课程id查询记录数
     * @param courseId
     * @return
     */
    Integer selectCountByCourseId(String courseId);
}
