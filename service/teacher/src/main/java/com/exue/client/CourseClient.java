package com.exue.client;

import com.exue.utils.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author 86130
 */
@FeignClient("exue-course")
@Component
public interface CourseClient {

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
