package com.exue.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 86130
 */
@Controller
@RequestMapping("/learning")
public class LearningPathController {

    @ModelAttribute("active")
    public String active() {
        return "learning";
    }

    @GetMapping("index")
    public String show() {
        return "paths_index";
    }

}
