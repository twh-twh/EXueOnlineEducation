package com.exue.controller;

import com.exue.client.CommentClient;
import com.exue.client.CourseClient;
import com.exue.client.LearningPathClient;
import com.exue.entity.frontvo.CourseFrontVo;
import com.exue.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.LinkedHashMap;


/**
 * @author 86130
 */
@Controller
@RequestMapping("/course")
public class CourseController {
    @ModelAttribute("active")
    public String active() {
        return "course";
    }

    @Autowired
    private CourseClient courseClient;

    @Autowired
    private LearningPathClient learningPathClient;

    @Autowired
    private CommentClient commentClient;

    @GetMapping("explore")
    public String explore(CourseFrontVo courseFrontVo, Model model) {
        Result result = courseClient.getAll(courseFrontVo);

        Result courseTypeResult = courseClient.getAllType();

        Result learningPaths = learningPathClient.hot(5);

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
        model.addAttribute("search", courseFrontVo.getSearch());

        model.addAttribute("learningPaths", learningPaths.getData().get("learningPaths"));

        return "course_index";
    }

    @GetMapping("show/{id}")
    public String show(@PathVariable("id") String id, Model model) {
        Result course = courseClient.getCourse(id, "980825");
        LinkedHashMap<String, Object> linkedHashMap = (LinkedHashMap)course.getData().get("course");

        Result commentCount = commentClient.getCount(id);
        Result courses = courseClient.getTeacherOtherCourse(1, 10, ((LinkedHashMap)linkedHashMap.get("teacher")).get("id").toString());

        model.addAttribute("course", course.getData().get("course"));
        model.addAttribute("commentCount", commentCount.getData().get("commentCount"));
        model.addAttribute("courses", courses.getData().get("courses"));

        return "course_show";
    }
}
