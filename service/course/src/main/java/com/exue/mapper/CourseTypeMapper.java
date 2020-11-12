package com.exue.mapper;

import com.exue.entity.CourseType;

import java.util.List;

/**
 * 课程类型
 * @author 86130
 */
public interface CourseTypeMapper {

    /**
     * 查询全部
     * @return
     */
    List<CourseType> selectAll();

    /**
     * 插入类型
     * @param courseType
     */
    void insertCourseType(CourseType courseType);

    /**
     * 修改类型
     * @param courseType
     */
    void updateCourseType(CourseType courseType);

    /**
     * 删除类型
     * @param courseType
     */
    void deleteCourseTypeById(CourseType courseType);
}
