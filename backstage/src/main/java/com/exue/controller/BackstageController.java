package com.exue.controller;

import com.exue.client.CourseClient;
import com.exue.client.LearningPathClient;
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

    @Autowired
    private LearningPathClient learningClient;

    @GetMapping("index")
    public String index() {
        return "index";
    }

    @GetMapping("homePage")
    public String homePage(Model model) {

        //查询热门课程
        Result courses = courseClient.getHot(8);
        model.addAttribute("courses", courses.getData().get("courses"));
        //查询学习路线
        Result learningPaths = learningClient.hot(8);
        model.addAttribute("learningPaths", learningPaths.getData().get("learningPaths"));
        return "index";
    }

    @GetMapping("explore")
    public String explore() {
        System.out.println("进来了");
        return "course_index";
    }

}
