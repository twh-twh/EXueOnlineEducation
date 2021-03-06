package com.exue.client;

import com.exue.entity.frontvo.CourseFrontVo;
import com.exue.utils.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

/**
 * @author 86130
 */
@FeignClient("exue-course")
@Component
public interface CourseClient {

    /**
     * 获取course模块的getHot方法
     * @param size
     * @return
     */
    @GetMapping("/course/info/getHot/{size}")
    Result getHot(@PathVariable Integer size);

    /**
     * 获取全部课程
     * @param courseFrontVo
     * @return
     */
    @PostMapping("/course/info/getAll")
    Result getAll(@RequestBody CourseFrontVo courseFrontVo) ;

    /**
     * 获取全部课程分类
     * @return
     */
    @GetMapping("/course/type/getAllType")
    Result getAllType();

    /**
     * 获取课程详细信息
     * @param id
     * @param userId
     * @return
     */
    @GetMapping("/course/info/getCourse/{id}/{userId}")
    Result getCourse(@PathVariable("id") String id, @PathVariable("userId") String userId);

    /**
     * 获取讲师其他课程
     * @param pageNum
     * @param pageSize
     * @param teacherId
     * @return
     */
    @GetMapping("/course/info/getTeacherOtherCourse")
    Result getTeacherOtherCourse(@RequestParam("pageNum") Integer pageNum, @RequestParam("pageSize") Integer pageSize, @RequestParam("teacherId") String teacherId);
}
