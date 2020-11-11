package com.exue.mapper;

import com.exue.entity.LearningPath;
import com.exue.entity.LearningPathStage;

import java.util.List;

/**
 * 学习路径阶段
 * @author 86130
 */
public interface LearningPathStageMapper {

    /**
     * 插入学习路径阶段
     * @param learningPathStage
     */
    void insertLearningPathStage(LearningPathStage learningPathStage);

    /**
     * 修改路径阶段
     * @param learningPathStage
     */
    void updateLearningPathStage(LearningPathStage learningPathStage);

    /**
     * 删除路径阶段
     * @param id
     */
    void deleteLearningPathStage(String id);

    /**
     * 根据学习路径查询学习路径阶段
     * @param id
     * @return
     */
    List<LearningPathStage> selectLearningPathStageByLearningPathId(String id);
}
