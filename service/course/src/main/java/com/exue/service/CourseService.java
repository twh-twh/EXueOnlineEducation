package com.exue.service;

import com.exue.entity.Course;

import java.util.List;

/**
 * 课程服务
 * @author 86130
 */
public interface CourseService {

    /**
     * 添加课程
     * @param course
     */
    void addCourse(Course course);

    /**
     * 修改课程
     * @param course
     */
    void updateCourse(Course course);

    /**
     * 删除课程
     * @param id
     */
    void deleteCourse(String id);

    /**
     * 修改上架状态
     * @param status
     * @param id
     */
    void updateCourseStatus(Boolean status, String id);

    /**
     * 获取热门课程
     * @param size 个数
     * @return
     */
    List<Course> getHotCourse(int size);

    /**
     * 获取课程分页
     * @param pageNum
     * @param pageSize
     * @param isNewest 是以最新时间排序吗
     * @return
     */
    List<Course> getAllCourse(Integer pageNum, Integer pageSize, Boolean isNewest);
}
