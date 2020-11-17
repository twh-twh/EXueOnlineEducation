package com.exue.service.impl;

import com.exue.annotation.PageAnnotation;
import com.exue.client.CourseClient;
import com.exue.entity.Course;
import com.exue.entity.Teacher;
import com.exue.mapper.TeacherMapper;
import com.exue.service.TeacherService;
import com.exue.utils.Result;
import com.exue.utils.SnowFlake;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import com.google.common.collect.LinkedListMultimap;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 86130
 */
@Service
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    private TeacherMapper teacherMapper;

    @Autowired
    private SnowFlake snowFlake;

    @Autowired
    private CourseClient courseClient;

    @Override
    public void addTeacher(Teacher teacher) {
        teacher.setId(snowFlake.toString());
        teacherMapper.addTeacher(teacher);
    }

    @Override
    public void updateTeacherById(Teacher teacher) {
        System.out.println(teacher);
    }

    @Override
    public void deleteTeacherById(String id) {

    }

    @Override
    @PageAnnotation
    public List<Teacher> getTeachers(Integer pageNum, Integer pageSize) {
        List<Teacher> teachers = teacherMapper.getTeachers();
        return teachers;
    }

    @Override
    @PageAnnotation
    public Teacher getTeacher(Integer pageNum, Integer pageSize, String id) {
        //获取讲师
        Teacher teacher = teacherMapper.selectTeacherById(id);

        //获取讲师下的课程
        Result course = courseClient.getTeacherOtherCourse(pageNum, pageSize, id);
        teacher.setCourses((List<Course>) course.getData().get("courses"));

        return teacher;
    }

}
