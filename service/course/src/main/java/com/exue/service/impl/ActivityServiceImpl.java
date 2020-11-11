package com.exue.service.impl;

import com.exue.entity.Activity;
import com.exue.mapper.ActivityMapper;
import com.exue.service.ActivityService;
import com.exue.utils.SnowFlake;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 86130
 */
@Service
public class ActivityServiceImpl implements ActivityService {

    @Autowired
    private ActivityMapper activityMapper;

    @Autowired
    private SnowFlake snowFlake;


    @Override
    public List<Activity> getAllActivity() {
        List<Activity> activities = activityMapper.selectAll();
        return activities;
    }

    @Override
    public void addActivity(Activity activity) {
        activity.setId(snowFlake.toString());
        activityMapper.insertActivity(activity);
    }

    @Override
    public void updateActivity(Activity activity) {
        activityMapper.updateActivityById(activity);
    }

    @Override
    public void deleteActivity(String id) {
        activityMapper.deleteActivityById(id);
    }
}
