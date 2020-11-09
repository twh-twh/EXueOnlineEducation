package com.exue.service.impl;

import com.exue.entity.Teacher;
import com.exue.mapper.TeacherMapper;
import com.exue.service.TeacherService;
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

    @Override
    public void addTeacher(Teacher teacher) {

    }

    @Override
    public void updateTeacherById(Teacher teacher) {

    }

    @Override
    public void deleteTeacherById(String id) {

    }

    @Override
    public List<Teacher> getTeachers() {
        return null;
    }
}
