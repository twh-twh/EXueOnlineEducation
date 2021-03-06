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
     * @param id
     */
    void deleteLearningPath(String id);

    /**
     * 查询全部学习路径
     * @return
     */
    List<LearningPath> selectAllLearningPath();


}
