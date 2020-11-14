package com.exue.service.impl;

import com.exue.annotation.PageAnnotation;
import com.exue.entity.Comment;
import com.exue.mapper.CommentMapper;
import com.exue.service.CommentService;
import com.exue.utils.SnowFlake;
import nonapi.io.github.classgraph.json.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 评论服务
 * @author 86130
 */
@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentMapper commentMapper;

    @Autowired
    private SnowFlake snowFlake;

    @Override
    public void addComment(Comment comment) {
        comment.setId(snowFlake.toString());
        commentMapper.insertComment(comment);
    }

    @Override
    public void deleteCommentById(String id) {
        commentMapper.deleteCommentById(id);
    }

    @Override
    @PageAnnotation
    public List<Comment> getAllCommentByCourseId(Integer pageNum, Integer pageSize, String courseId) {
        List<Comment> comments = commentMapper.selectAllCommentByCourseId(courseId);

        return comments;
    }

    @Override
    public Integer getCountByCourseId(String courseId) {
        Integer count = commentMapper.selectCountByCourseId(courseId);
        return count;
    }
}
