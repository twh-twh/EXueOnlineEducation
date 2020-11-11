package com.exue.mapper;

import com.exue.entity.Course;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 课程
 * @author 86130
 */
public interface CourseMapper {

    /**
     * 查询全部的课程包含未上回
     * @return
     */
    List<Course> selectAllCourses();

    /**
     * 查询课程只有已上架
     * @return
     */
    List<Course> selectCourses();

    /**
     * 根据观看数排序
     * @param sort true 是升序  false 是降序
     * @return
     */
    List<Course> selectCourseSortByViewCount(Boolean sort);

    /**
     * 根据价格排序
     * @param sort
     * @return
     */
    List<Course> selectCourseSortByPrice(Boolean sort);

    /**
     * 根据老师id查询课程
     * @param id
     * @return
     */
    List<Course> selectCourseByTeacher(String id);

    /**
     * 根据课程类型id查课程
     * @param id
     * @return
     */
    List<Course> selectCourseByCourseType(String id);

    /**
     * 根据模糊标题查询课程
     * @param title
     * @return
     */
    List<Course> selectCourseByLikeTitle(String title);

    /**
     * 插入课程
     * @param course
     */
    void insertCourse(Course course);

    /**
     * 根据id修改课程
     * @param course
     */
    void updateCourseById(Course course);

    /**
     * 根据id修改课程上架状态
     * @param status
     * @param id
     */
    void updateStatusById(@Param("status") Boolean status, @Param("id") String id);

    /**
     * 删除课程
     * @param id
     */
    void deleteCourse(String id);

}
