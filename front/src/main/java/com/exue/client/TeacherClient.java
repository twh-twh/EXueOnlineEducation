package com.exue.client;

import com.exue.utils.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author 86130
 */
@FeignClient("exue-teacher")
@Component
public interface TeacherClient {

    /**
     * 获取讲师信息
     * @param pageNum
     * @param pageSize
     * @param teacherId
     * @return
     */
    @GetMapping("/teacher/info/getTeacher")
    Result getTeacher(@RequestParam("pageNum") Integer pageNum, @RequestParam("pageSize") Integer pageSize, @RequestParam("teacherId") String teacherId);
}
