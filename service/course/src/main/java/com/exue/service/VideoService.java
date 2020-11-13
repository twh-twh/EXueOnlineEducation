package com.exue.service;

import com.exue.entity.Video;

import java.util.List;

/**
 * 视频服务
 * @author 86130
 */
public interface VideoService {

    /**
     * 添加视频
     * @param video
     */
    void addVideo(Video video);

    /**
     * 修改视频
     * @param video
     */
    void updateVideo(Video video);

    /**
     * 根据删除视频
     * @param id
     */
    void deleteVideoById(String id);

    /**
     * 根据课程id查询所有的视频
     * @param courseId
     * @return
     */
    List<Video> getALlVideoByCourseId(String courseId);
}
