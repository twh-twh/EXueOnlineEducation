package com.exue.service;

import com.exue.entity.Collect;

/**
 * @author 86130
 */
public interface CollectService {

    /**
     * 添加收藏
     * @param collect
     * @return
     */
    String addCollect(Collect collect);

    /**
     * 删除收藏
     * @param id
     */
    void deleteCollectById(String id);


}
