package com.exue.service;

import com.exue.entity.Section;

import javax.xml.ws.Service;
import java.util.List;

/**
 * 章节服务
 * @author 86130
 */
public interface SectionService {

    /**
     * 添加章节
     * @param section
     */
    void addService(Section section);

    /**
     * 修改章节
     * @param section
     */
    void updateService(Section section);

    /**
     * 删除id
     * @param id
     */
    void deleteServiceById(String id);

    /**
     * 根据课程id查询所有章节
     * @param courseId
     * @return
     */
    List<Section> getAllSectionByCourseId(String courseId);
}
