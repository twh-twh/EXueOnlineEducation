package com.exue.controller;

import com.exue.entity.LearningPath;
import com.exue.service.LearningPathService;
import com.exue.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author 86130
 */
@RestController
@RequestMapping("/learning/info")
@CrossOrigin
public class LearningPathController {

    @Autowired
    private LearningPathService learningPathService;

    @GetMapping("hot/{size}")
    public Result hot(@PathVariable Integer size) {
        List<LearningPath> learningPaths = learningPathService.getHotLearningPaths(size);
        return Result.ok().data("learningPaths", learningPaths);
    }

    @PostMapping("add")
    public Result add(@RequestBody LearningPath learningPath) {
        learningPathService.addLearningPath(learningPath);
        return Result.ok();
    }

}
