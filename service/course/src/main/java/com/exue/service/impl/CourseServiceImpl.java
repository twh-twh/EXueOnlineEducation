package com.exue.service.impl;

import com.exue.annotation.PageAnnotation;
import com.exue.entity.Course;
import com.exue.entity.Section;
import com.exue.entity.frontvo.CourseFrontVo;
import com.exue.mapper.CourseMapper;
import com.exue.mapper.VideoMapper;
import com.exue.service.CourseService;
import com.exue.service.SectionService;
import com.exue.utils.SnowFlake;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.List;
import java.util.Objects;

/**
 * @author 86130
 */
@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseMapper courseMapper;

    @Autowired
    private SnowFlake snowFlake;

    @Autowired
    private SectionService sectionService;


    @Override
    public void addCourse(Course course) {
        course.setId(snowFlake.toString());
        courseMapper.insertCourse(course);
    }

    @Override
    public void updateCourse(Course course) {
        courseMapper.updateCourseById(course);
    }

    @Override
    public void deleteCourse(String id) {
        courseMapper.deleteCourse(id);
    }

    @Override
    public void updateCourseStatus(Boolean status, String id) {
        courseMapper.updateStatusById(status, id);
    }

    @Override
    public List<Course> getHotCourse(int size) {
        PageHelper.startPage(1, size);
        List<Course> courses = courseMapper.selectCourseSort(null, null, null, true);
        return courses;
    }

    @Override
    @PageAnnotation
    public List<Course> getAllCourse(Integer pageNum, Integer pageSize,  CourseFrontVo courseFrontVo) {

        if (!ObjectUtils.isEmpty(courseFrontVo.getSearch())) {
            String search = courseFrontVo.getSearch();
            courseFrontVo.setSearch("%" + search + "%");
        } else {
            courseFrontVo.setSearch(null);
        }
        if (ObjectUtils.isEmpty(courseFrontVo.getClasses())) {
            return courseMapper.selectCourseSort(null, courseFrontVo.getCourseTypeId(), courseFrontVo.getSearch(), courseFrontVo.getIsTime());
        } else {
            switch (courseFrontVo.getClasses()) {
                case CourseFrontVo.CLASSES_SALE:
                    return courseMapper.selectCourseSortBySale(courseFrontVo.getCourseTypeId(), courseFrontVo.getSearch(),  courseFrontVo.getIsTime());
                case CourseFrontVo.CLASSES_FREE:
                    return courseMapper.selectCourseSort(0, courseFrontVo.getCourseTypeId(), courseFrontVo.getSearch(), courseFrontVo.getIsTime());
                case CourseFrontVo.CLASSES_ACTIVITY:
                    return courseMapper.selectCourseSortByActivity(courseFrontVo.getCourseTypeId(), courseFrontVo.getSearch(),  courseFrontVo.getIsTime());
                default:
                    return null;
            }
        }
    }

    @Override
    public Course getCourseAllMsgById(String courseId) {
        //获取课程
        Course course = courseMapper.selectCourseById(courseId);

        //获取课程下的所有章节 章节中会获取下面所有的视频
        List<Section> sections = sectionService.getAllSectionByCourseId(courseId);

        if (sections != null) {
            course.setSections(sections);
        }

        return course;
    }


}
