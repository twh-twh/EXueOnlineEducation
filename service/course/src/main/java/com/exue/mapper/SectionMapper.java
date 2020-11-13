package com.exue.mapper;

import com.exue.entity.Section;

import java.util.List;

/**
 * 章节
 * @author 86130
 */
public interface SectionMapper {

    /**
     * 插入章节
     * @param section
     */
    void insertSection(Section section);

    /**
     * 修改章节
     * @param section
     */
    void updateSection(Section section);


    /**
     * 根据id删除章节
     * @param id
     */
    void deleteSectionById(String id);

    /**
     * 根据课程id查询全部
     * @param courseId
     * @return
     */
    List<Section> selectAllByCourseId(String courseId);
}
