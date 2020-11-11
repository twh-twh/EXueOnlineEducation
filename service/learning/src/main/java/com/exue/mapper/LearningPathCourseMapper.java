package com.exue.mapper;

import com.exue.entity.LearningPathCourse;

import java.util.List;

/**
 * 学习课程
 * @author 86130
 */
public interface LearningPathCourseMapper {

    /**
     * 插入学习路径课程
     * @param learningPathCourse
     */
    void insertLearningPathCourse(LearningPathCourse learningPathCourse);

    /**
     * 修改学习路径课程
     * @param learningPathCourse
     */
    void updateLearningPathCourse(LearningPathCourse learningPathCourse);

    /**
     * 删除学习路径课程
     * @param learningPathCourse
     */
    void deleteLearningPathCourse(LearningPathCourse learningPathCourse);

    /**
     * 根据所有的学习阶段查询学习路径课程
     * @param ids
     * @return
     */
    List<LearningPathCourse> selectAllByLearningPathStageIds(List<Integer> ids);
}
