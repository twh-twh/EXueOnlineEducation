package com.exue.controller;

import com.exue.entity.Teacher;
import com.exue.service.TeacherService;
import com.exue.utils.Result;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author 86130
 */
@RestController
@RequestMapping("/teacher/info")
@CrossOrigin
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @GetMapping("getAll/{pageNum}/{pageSize}")
    public Result getAll(@PathVariable Integer pageNum, @PathVariable Integer pageSize) {
        List<Teacher> teachers = teacherService.getTeachers(pageNum, pageSize);
        return Result.ok().data("teachers", teachers);
    }

    @PostMapping("add")
    public Result add(@RequestBody Teacher teacher) {
        teacherService.addTeacher(teacher);
        return Result.ok();
    }

    @PostMapping("update")
    public Result update(@RequestBody Teacher teacher) {
        teacherService.updateTeacherById(teacher);
        return Result.ok();
    }

    @GetMapping("getTeacher")
    public Result getTeacher(@RequestParam("pageNum") Integer pageNum, @RequestParam("pageSize") Integer pageSize, @RequestParam("teacherId") String teacherId) {
        Teacher teacher = teacherService.getTeacher(pageNum, pageSize, teacherId);
        return Result.ok().data("teacher", teacher);
    }

}
