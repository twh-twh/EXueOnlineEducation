package com.exue.client;


import com.exue.utils.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author 86130
 */
@FeignClient("exue-learning")
@Component
public interface LearningPathClient {

    @GetMapping("/learning/info/hot/{size}")
    Result hot(@PathVariable Integer size);

}
