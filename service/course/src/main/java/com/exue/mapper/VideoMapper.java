package com.exue.mapper;

import com.exue.entity.Video;

import java.util.List;

/**
 * 视频
 * @author 86130
 */
public interface VideoMapper {

    /**
     * 添加视频信息
     * @param video
     */
    void insertVideo(Video video);

    /**
     * 修改视频信息
     * @param video
     */
    void updateVideo(Video video);

    /**
     * 根据id删除视频信息
     * @param id
     */
    void deleteVideById(String id);

    /**
     * 根据课程id查询视频信息
     * @param id
     * @return
     */
    List<Video> selectVideByCourseId(String id);
}
