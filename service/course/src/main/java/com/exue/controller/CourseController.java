package com.exue.controller;

import com.exue.entity.Course;
import com.exue.service.CourseService;
import com.exue.utils.Result;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

/**
 * 课程控制器
 * @author 86130
 */
@RestController
@RequestMapping("/course/info")
public class CourseController {

    @Autowired
    public CourseService courseService;

    @PostMapping("add")
    public Result add(@RequestBody Course course) {
        courseService.addCourse(course);
        return Result.ok();
    }

    @PostMapping("update")
    public Result update(@RequestBody Course course) {
        courseService.updateCourse(course);
        return Result.ok();
    }

    @GetMapping("getHot/{size}")
    public Result getHot(@PathVariable Integer size) {
        List<Course> courses = courseService.getHotCourse(size);

        return Result.ok().data("courses", courses);
    }

    @PostMapping("getAll/{pageNum}/{pageSize}")
    public Result getAll(@PathVariable("pageNum") Integer pageNum, @PathVariable("pageSize") Integer pageSize) {

        List<Course> courses = courseService.getAllCourse(pageNum, pageSize, true);
        PageInfo<Course> pageInfo = new PageInfo<>(courses);
        return Result.ok().data("courses", pageInfo);
    }
}
