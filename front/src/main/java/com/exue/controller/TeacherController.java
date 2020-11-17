package com.exue.controller;

import com.exue.client.TeacherClient;
import com.exue.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 86130
 */
@Controller
@RequestMapping("/teacher")
public class TeacherController {

    @ModelAttribute("active")
    public String active() {
        return "teacher";
    }

    @Autowired
    private TeacherClient teacherClient;

    @GetMapping("getTeacher")
    public String getTeacher(Integer pageNum, Integer pageSize, String teacherId, Model model) {
        Result teacher = teacherClient.getTeacher(pageNum, pageSize, teacherId);

        model.addAttribute("teacher", teacher.getData().get("teacher"));
        return "teacher";
    }

    @GetMapping("index")
    public String index() {
        return "teacher_index";
    }

}
