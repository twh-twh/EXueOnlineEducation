package com.exue.controller;

import com.exue.entity.Course;
import com.exue.entity.frontvo.CourseFrontVo;
import com.exue.service.CourseService;
import com.exue.utils.Result;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.xml.transform.Source;
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

    @PostMapping("getAll")
    public Result getAll(@RequestBody CourseFrontVo courseFrontVo) {
        List<Course> courses = courseService.getAllCourse(courseFrontVo.getPageNum(), courseFrontVo.getPageSize(), courseFrontVo);

        PageInfo<Course> pageInfo = new PageInfo<>(courses);
        return Result.ok().data("courses", pageInfo);
    }

    @GetMapping("getCourse/{id}")
    public Result getCourse(@PathVariable("id") String id) {
        Course course = courseService.getCourseAllMsgById(id);

        return Result.ok().data("course", course);
    }
}
