package com.exue.mapper;

import com.exue.entity.Teacher;

import java.util.List;

/**
 * @author 86130
 */
public interface TeacherMapper {


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

    /**
     * 根据id获取讲师
     * @param id
     * @return
     */
    Teacher selectTeacherById(String id);

}
