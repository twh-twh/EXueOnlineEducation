package com.exue.client;

import com.exue.utils.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

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

}
