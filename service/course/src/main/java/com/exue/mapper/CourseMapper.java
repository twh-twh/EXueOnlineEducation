package com.exue.mapper;

import com.exue.entity.Course;
import com.exue.entity.CourseType;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 课程
 * @author 86130
 */
public interface CourseMapper {

    /**
     * 查询全部的课程包含未上架
     * @return
     */
    List<Course> selectAllCourses();

    /**
     * 查询课程只有已上架
     * @return
     */
    List<Course> selectCourses();

    /**
     * 多条件查询带排序
     * @param isTime 是不是时间
     * @param courseTypeId 课程类型id
     * @param price 价格
     * @param search 搜索条件
     * @return
     */
    List<Course> selectCourseSort(@Param("price") Integer price, @Param("courseTypeId") String courseTypeId, @Param("search") String search, @Param("isTime") Boolean isTime);


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

    /**
     * 多条件查询带排序
     * @param isTime 是不是时间
     * @param courseTypeId 课程类型id
     * @param search 搜索条件
     * @return
     */
    List<Course> selectCourseSortByActivity(@Param("courseTypeId") String courseTypeId, @Param("search") String search, @Param("isTime") Boolean isTime);


    /**
     * 多条件查询带排序
     * @param isTime 是不是时间
     * @param courseTypeId 课程类型id
     * @param search 搜索条件
     * @return
     */
    List<Course> selectCourseSortBySale( @Param("courseTypeId") String courseTypeId, @Param("search") String search, @Param("isTime") Boolean isTime);

    /**
     * 根据id查询课程
     * @param id
     * @param userId
     * @return
     */
    Course selectCourseById(@Param("id") String id, @Param("userId") String userId);
}
