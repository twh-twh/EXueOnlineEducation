package com.exue.service.impl;

import com.exue.entity.CourseType;
import com.exue.mapper.CourseTypeMapper;
import com.exue.service.CourseTypeService;
import com.exue.utils.SnowFlake;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 86130
 */
@Service
public class CourseTypeServiceImpl implements CourseTypeService {

    @Autowired
    private CourseTypeMapper courseTypeMapper;

    @Autowired
    private SnowFlake snowFlake;

    @Override
    public List<CourseType> getAllCourseType() {
        List<CourseType> courseTypes = courseTypeMapper.selectAll();
        return courseTypes;
    }

    @Override
    public void addCourseType(CourseType courseType) {
        courseType.setId(snowFlake.toString());
        courseTypeMapper.insertCourseType(courseType);
    }
}
