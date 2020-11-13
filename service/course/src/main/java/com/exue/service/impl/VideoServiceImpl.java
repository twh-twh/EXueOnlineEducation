package com.exue.service.impl;

import com.exue.entity.Video;
import com.exue.mapper.VideoMapper;
import com.exue.service.VideoService;
import com.exue.utils.SnowFlake;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 * @author 86130
 */
@Service
public class VideoServiceImpl implements VideoService {

    @Autowired
    private VideoMapper videoMapper;

    @Autowired
    private SnowFlake snowFlake;

    @Override
    public void addVideo(Video video) {
        video.setId(snowFlake.toString());

        videoMapper.insertVideo(video);
    }

    @Override
    public void updateVideo(Video video) {
        videoMapper.updateVideo(video);
    }

    @Override
    public void deleteVideoById(String id) {
        videoMapper.deleteVideById(id);
    }

    @Override
    public List<Video> getALlVideoByCourseId(String courseId) {
        List<Video> videos = videoMapper.selectVideByCourseId(courseId);
        return videos;
    }
}
