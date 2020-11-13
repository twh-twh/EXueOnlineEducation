package com.exue.service.impl;

import com.exue.entity.Section;
import com.exue.entity.Video;
import com.exue.mapper.SectionMapper;
import com.exue.mapper.VideoMapper;
import com.exue.service.SectionService;
import com.exue.utils.SnowFlake;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 86130
 */
@Service
public class SectionServiceImpl implements SectionService {

    @Autowired
    private SectionMapper sectionMapper;

    @Autowired
    private SnowFlake snowFlake;

    @Autowired
    private VideoMapper videoMapper;


    @Override
    public void addService(Section section) {
        section.setId(snowFlake.toString());
        sectionMapper.insertSection(section);
    }

    @Override
    public void updateService(Section section) {
        sectionMapper.updateSection(section);
    }

    @Override
    public void deleteServiceById(String id) {
        sectionMapper.deleteSectionById(id);
    }

    @Override
    public List<Section> getAllSectionByCourseId(String courseId) {
        //获取课程下所有的章节
        List<Section> sections = sectionMapper.selectAllByCourseId(courseId);

        //获取课程章节后，把视频获取出来
        List<Video> videos = videoMapper.selectVideByCourseId(courseId);

        Map<String, Section> map = new HashMap<>(16);
        for (Section section : sections) {
            section.setVideos(new ArrayList<>());
            map.put(section.getId(), section);
        }

        for (Video video : videos) {
            List<Video> sectionVideos = map.get(video.getSectionId()).getVideos();
            sectionVideos.add(video);
        }

        //返回所有章节
        return sections;
    }
}
