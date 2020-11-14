package com.exue.client;

import com.exue.entity.frontvo.CommentFrontVo;
import com.exue.utils.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author 86130
 */
@FeignClient("exue-comment")
@Component
public interface CommentClient {

    /**
     * 获取评论
     * @param commentFrontVo
     * @return
     */
    @PostMapping("/comment/info/getAll")
    Result getAll(@RequestBody CommentFrontVo commentFrontVo);

    /**
     * 获取评论数
     * @param courseId
     * @return
     */
    @GetMapping("/comment/info/getCount/{courseId}")
    Result getCount(@PathVariable String courseId);
}
