package com.exue.controller;

import com.exue.entity.CourseType;
import com.exue.service.CourseTypeService;
import com.exue.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author 86130
 */
@RestController
@RequestMapping("/course/type")
@CrossOrigin
public class CourseTypeController {

    @Autowired
    private CourseTypeService courseTypeService;

    @GetMapping("getAllType")
    public Result getAllType() {
        List<CourseType> courseTypes = courseTypeService.getAllCourseType();
        return Result.ok().data("courseTypes", courseTypes);
    }

    @PostMapping("add")
    public Result add(@RequestBody CourseType courseType) {
        courseTypeService.addCourseType(courseType);
        return Result.ok();
    }
}
