package com.exue.controller;

import com.exue.entity.Activity;
import com.exue.service.ActivityService;
import com.exue.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author 86130
 */
@RestController
@CrossOrigin
@RequestMapping("/course/activity")
public class ActivityController {

    @Autowired
    private ActivityService activityService;

    @GetMapping("getAll")
    public Result getAll() {
        List<Activity> activities = activityService.getAllActivity();
        return Result.ok().data("activities", activities);
    }

    @PostMapping("add")
    public Result add(@RequestBody Activity activity) {
        activityService.addActivity(activity);
        return Result.ok();
    }

    @PostMapping("update")
    public Result update(@RequestBody Activity activity) {
        activityService.updateActivity(activity);
        return Result.ok();
    }

    @PostMapping("delete/{id}")
    public Result delete(@PathVariable String id) {
        activityService.deleteActivity(id);
        return Result.ok();
    }


}
