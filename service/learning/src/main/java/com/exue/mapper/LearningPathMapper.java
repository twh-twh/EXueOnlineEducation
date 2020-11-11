package com.exue.mapper;

import com.exue.entity.LearningPath;

import java.util.List;

/**
 * @author 86130
 */
public interface LearningPathMapper {

    /**
     * 插入学习路径
     * @param learningPath
     */
    void insertLearningPath(LearningPath learningPath);

    /**
     * 修改学习路径
     * @param learningPath
     */
    void updateLearningPath(LearningPath learningPath);


    /**
     * 删除学习路径
     * @param learningPath
     */
    void deleteLearningPath(LearningPath learningPath);

    /**
     * 查询全部学习路径
     * @param learningPath
     * @return
     */
    List<LearningPath> selectAllLearningPath(LearningPath learningPath);


}
