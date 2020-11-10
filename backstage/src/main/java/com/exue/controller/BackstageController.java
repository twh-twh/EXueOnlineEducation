package com.exue.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 86130
 */
@Controller
@RequestMapping("/info")
public class BackstageController {

    @GetMapping("index")
    public String index() {
        return "index";
    }
}
