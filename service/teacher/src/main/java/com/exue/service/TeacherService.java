package com.exue.service;

import com.exue.entity.Teacher;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author 86130
 */
public interface TeacherService {

    /**
     * 添加讲师
     * @param teacher
     */
    void addTeacher(Teacher teacher);

    /**
     * 根据id修改讲师
     * @param teacher
     */
    void updateTeacherById(Teacher teacher);

    /**
     * 根据id删除讲师
     * @param id
     */
    void deleteTeacherById(String id);

    /**
     * 获取讲师列表
     * @return
     */
    List<Teacher> getTeachers();

}
