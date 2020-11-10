package com.exue.service;

import com.exue.entity.Activity;

import java.util.List;

/**
 * 活动课程服务
 * @author 86130
 */
public interface ActivityService {

    /**
     * 获取全部的活动课程
     * @return
     */
    List<Activity> getAllActivity();

    /**
     * 添加活动课程
     * @param activity
     */
    void addActivity(Activity activity);

    /**
     * 修改活动课程
     * @param activity
     */
    void updateActivity(Activity activity);

    /**
     * 删除活动课程
     * @param id
     */
    void deleteActivity(String id);
}
