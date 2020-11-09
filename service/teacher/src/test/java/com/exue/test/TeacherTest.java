package com.exue.test;

import com.exue.TeacherApplication;
import com.exue.mapper.TeacherMapper;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = TeacherApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class TeacherTest {

    @Autowired
    private TeacherMapper teacherMapper;

     @Test
    public void test1() {
         System.out.println(teacherMapper == null);
         System.out.println(teacherMapper);
         System.out.println("-------------完成了----------------");
    }
}
