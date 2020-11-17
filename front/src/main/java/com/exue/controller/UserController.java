package com.exue.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 86130
 */
@Controller
@RequestMapping("/user")
public class UserController {


    @GetMapping("vip")
    public String vip(Model model) {
        model.addAttribute("active", "vip");
        return "vip";
    }
}
