package com.exue.mapper;

import com.exue.entity.Activity;

import java.util.List;

/**
 * 活动课程表
 * @author 86130
 */
public interface ActivityMapper {

    /**
     * 查询出全部活动课程
     * @return
     */
    List<Activity> selectAll();

    /**
     * 插入
     * @param activity
     */
    void insertActivity(Activity activity);

    /**
     * 根据id修改值
     * @param activity
     */
    void updateActivityById(Activity activity);

    /**
     * 根据id删除
     * @param id
     */
    void deleteActivityById(String id);
}
