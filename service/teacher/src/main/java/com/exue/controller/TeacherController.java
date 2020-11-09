package com.exue.controller;

import com.exue.entity.Teacher;
import com.exue.service.TeacherService;
import com.exue.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author 86130
 */
@RestController
@RequestMapping("/teacher/info")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @GetMapping("getAll")
    public Result getAll() {
        List<Teacher> teachers = teacherService.getTeachers();
        return Result.ok().data("teachers", teachers);
    }

    @PostMapping("add")
    public Result add() {
        teacherService.addTeacher(null);
        return Result.ok();
    }

}
