package com.exue.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 86130
 */
@Controller
public class BackstageController {

    @RequestMapping("index")
    public String index() {
        return "index";
    }

}
