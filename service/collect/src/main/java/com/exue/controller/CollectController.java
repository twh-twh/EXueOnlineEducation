package com.exue.controller;

import com.exue.entity.Collect;
import com.exue.entity.Course;
import com.exue.service.CollectService;
import com.exue.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author 86130
 */
@RestController
@CrossOrigin
@RequestMapping("/collect/info")
public class CollectController {

    @Autowired
    private CollectService collectService;

    @PostMapping("add/{courseId}/{userId}")
    public Result add(@PathVariable String courseId, @PathVariable String userId) {
        Collect collect = new Collect();
        collect.setUserId(userId);
        Course course = new Course();
        course.setId(courseId);
        collect.setCourse(course);

        String id = collectService.addCollect(collect);

        return Result.ok().data("collectId", id);
    }

    @PostMapping("delete/{id}")
    public Result add(@PathVariable String id) {
        collectService.deleteCollectById(id);
        return Result.ok();
    }

}
