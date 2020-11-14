package com.exue.service.impl;

import com.exue.entity.Collect;
import com.exue.mapper.CollectMapper;
import com.exue.service.CollectService;
import com.exue.utils.SnowFlake;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 收藏服务
 * @author 86130
 */
@Service
public class CollectServiceImpl implements CollectService {

    @Autowired
    private CollectMapper collectMapper;

    @Autowired
    private SnowFlake snowFlake;

    @Override
    public String addCollect(Collect collect) {
        String id = snowFlake.toString();
        collect.setId(id);
        collectMapper.insertCollect(collect);
        return id;
    }

    @Override
    public void deleteCollectById(String id) {
        collectMapper.deleteCollectById(id);
    }
}
