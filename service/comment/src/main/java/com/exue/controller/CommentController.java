package com.exue.controller;

import com.exue.entity.Comment;
import com.exue.entity.frontvo.CommentFrontVo;
import com.exue.service.CommentService;
import com.exue.utils.Result;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author 86130
 */
@RestController
@CrossOrigin
@RequestMapping("/comment/info")
public class CommentController {

    @Autowired
    private CommentService commentService;

    @PostMapping("getAll")
    public Result getAll(CommentFrontVo commentFrontVo) {
        List<Comment> comments = commentService.getAllCommentByCourseId(commentFrontVo.getPageNum(), commentFrontVo.getPageSize(), commentFrontVo.getCourseId());
        PageInfo<Comment> pageInfo = new PageInfo<>(comments);
        return Result.ok().data("comments", pageInfo.getList())
                .data("pageNum", pageInfo.getPageNum())
                .data("pageSize", pageInfo.getSize())
                .data("isFirstPage", pageInfo.isIsFirstPage())
                .data("isLastPage", pageInfo.isIsLastPage())
                .data("pageNums", pageInfo.getNavigatepageNums());
    }

    @PostMapping("add")
    public Result add(@RequestBody Comment comment) {
        commentService.addComment(comment);
        return Result.ok();
    }

    @PostMapping("delete")
    public Result delete(String id) {
        commentService.deleteCommentById(id);
        return Result.ok();
    }

    @GetMapping("getCount/{courseId}")
    public Result getCount(@PathVariable String courseId) {
        Integer count = commentService.getCountByCourseId(courseId);
        return Result.ok().data("commentCount", count);
    }
}
