package com.exue.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 86130
 */
@Controller
@RequestMapping("/activity")
public class ActivityController {

    @ModelAttribute("active")
    public String active() {
        return "activity";
    }

    @GetMapping("show")
    public String show() {
        return "activity";
    }

}
