package com.exue.service;

import com.exue.entity.CourseType;

import java.util.List;

/**
 * 课程类型服务
 * @author 86130
 */
public interface CourseTypeService {

    /**
     * 查询所有查询类型
     * @return
     */
    List<CourseType> getAllCourseType();

    /**
     * 添加课程类型
     * @param courseType
     */
    void addCourseType(CourseType courseType);
}
