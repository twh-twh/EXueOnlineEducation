package com.exue.service.impl;

import com.exue.annotation.PageAnnotation;
import com.exue.entity.Teacher;
import com.exue.mapper.TeacherMapper;
import com.exue.service.TeacherService;
import com.exue.utils.SnowFlake;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
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

}
