package com.exue.controller;

import com.exue.client.CourseClient;
import com.exue.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 86130
 */
@Controller
@RequestMapping("/info")
public class BackstageController {

    @Autowired
    private CourseClient courseClient;

    @GetMapping("index")
    public String index() {
        return "index";
    }

    @GetMapping("homePage")
    public String homePage(Model model) {

        //查询热门课程
        Result hot = courseClient.getHot(8);
        model.addAttribute("courses", hot.getData().get("courses"));
        //查询学习路线

        return "index";
    }

}
