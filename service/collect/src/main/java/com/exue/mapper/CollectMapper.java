package com.exue.mapper;

import com.exue.entity.Collect;

import java.util.List;

/**
 * @author 86130
 */
public interface CollectMapper {

    /**
     * 插入收藏
     * @param collect
     */
    void insertCollect(Collect collect);


    /**
     *  删除收藏
     * @param id
     */
    void deleteCollectById(String id);

    /**
     * 根据用户id查找全部收藏
     * @param userId
     * @return
     */
    List<Collect> selectAllCollectByUserId(String userId);

}
