package com.exue.service;

import com.exue.entity.LearningPath;

import java.util.List;

/**
 * 学习路径服务
 * @author 86130
 */
public interface LearningPathService {

    /**
     * 添加学习路径
     * @param learningPath
     */
    void addLearningPath(LearningPath learningPath);

    /**
     * 修改学习路径
     * @param learningPath
     */
    void updateLearningPath(LearningPath learningPath);

    /**
     * 删除学习路径
     * @param id
     */
    void deleteLearningPathById(String id);

    /**
     * 获取热门的学习路径
     * @param size
     */
    List<LearningPath> getHotLearningPaths(Integer size);

}
