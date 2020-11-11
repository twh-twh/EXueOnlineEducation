package com.exue.service.impl;

import com.exue.annotation.PageAnnotation;
import com.exue.entity.Course;
import com.exue.mapper.CourseMapper;
import com.exue.service.CourseService;
import com.exue.utils.SnowFlake;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 86130
 */
@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseMapper courseMapper;

    @Autowired
    private SnowFlake snowFlake;

    @Override
    public void addCourse(Course course) {
        course.setId(snowFlake.toString());
        courseMapper.insertCourse(course);
    }

    @Override
    public void updateCourse(Course course) {
        courseMapper.updateCourseById(course);
    }

    @Override
    public void deleteCourse(String id) {
        courseMapper.deleteCourse(id);
    }

    @Override
    public void updateCourseStatus(Boolean status, String id) {
        courseMapper.updateStatusById(status, id);
    }

    @Override
    public List<Course> getHotCourse(int size) {
        PageHelper.startPage(1, size);
        List<Course> courses = courseMapper.selectCourseSortByViewCount(false);
        return courses;
    }

    @Override
    @PageAnnotation
    public List<Course> getAllCourse(Integer pageNum, Integer pageSize, Boolean isNewest) {
        if (isNewest) {
            return courseMapper.selectCourseSortByTime(false);
        }

        return courseMapper.selectCourseSortByViewCount(false);
    }
}
