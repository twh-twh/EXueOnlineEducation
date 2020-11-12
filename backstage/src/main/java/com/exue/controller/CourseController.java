package com.exue.controller;

import com.exue.client.CourseClient;
import com.exue.entity.frontvo.CourseFrontVo;
import com.exue.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.LinkedHashMap;


/**
 * @author 86130
 */
@Controller
@RequestMapping("/course")
public class CourseController {

    @Autowired
    private CourseClient courseClient;

    @GetMapping("explore")
    public String explore(CourseFrontVo courseFrontVo, Model model) {

        Result result = courseClient.getAll(courseFrontVo);

        Result courseTypeResult = courseClient.getAllType();

        Object courses = result.getData().get("courses");
        LinkedHashMap<String, Object> pageInfo = (LinkedHashMap)courses;

        model.addAttribute("courses", pageInfo.get("list"));
        model.addAttribute("pageNum", pageInfo.get("pageNum"));
        model.addAttribute("pages", pageInfo.get("pages"));
        model.addAttribute("isFirstPage", pageInfo.get("isFirstPage"));
        model.addAttribute("isLastPage", pageInfo.get("isLastPage"));
        model.addAttribute("pageNums", pageInfo.get("navigatepageNums"));

        model.addAttribute("courseTypes", courseTypeResult.getData().get("courseTypes"));
        model.addAttribute("classes", courseFrontVo.getClasses());
        model.addAttribute("courseTypeId", courseFrontVo.getCourseTypeId());
        model.addAttribute("isTime", courseFrontVo.getIsTime());


        return "course_index";
    }

}
