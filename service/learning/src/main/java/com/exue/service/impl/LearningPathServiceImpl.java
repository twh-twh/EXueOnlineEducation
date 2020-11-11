package com.exue.service.impl;

import com.exue.entity.LearningPath;
import com.exue.mapper.LearningPathMapper;
import com.exue.service.LearningPathService;
import com.exue.utils.SnowFlake;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 86130
 */
@Service
public class LearningPathServiceImpl implements LearningPathService {

    @Autowired
    private LearningPathMapper learningPathMapper;

    @Autowired
    private SnowFlake snowFlake;

    @Override
    public void addLearningPath(LearningPath learningPath) {
        learningPath.setId(snowFlake.toString());
        learningPathMapper.insertLearningPath(learningPath);
    }

    @Override
    public void updateLearningPath(LearningPath learningPath) {
        learningPathMapper.updateLearningPath(learningPath);
    }

    @Override
    public void deleteLearningPathById(String id) {
        learningPathMapper.deleteLearningPath(id);
    }

    @Override
    public List<LearningPath> getHotLearningPaths(Integer size) {
        PageHelper.startPage(1, size);
        List<LearningPath> learningPaths = learningPathMapper.selectAllLearningPath();
        return learningPaths;
    }
}
