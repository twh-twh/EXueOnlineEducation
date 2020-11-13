package com.exue.controller;

import org.springframework.stereotype.Controller;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author 86130
 */
@Controller
public class SearchController {
    
    @GetMapping("/search")
    public String search(String search) {
        return "forward:course/explore?pageNum=1&pageSize=12&isTime=true";
    }
    
}
