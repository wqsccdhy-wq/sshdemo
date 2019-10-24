package com.service.impl;

import com.dao.BehaviorUnitSystemDao;
import com.entity.BehaviorUnitSystem;
import com.service.BehaviorUnitSystemService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class BehaviorUnitSystemServiceImpl implements BehaviorUnitSystemService {

    @Resource
    private BehaviorUnitSystemDao behaviorUnitSystemDao;

    @Override
    public BehaviorUnitSystem getBehaviorUnitSystemById(String id) {
        return behaviorUnitSystemDao.getBehaviorUnitSystemById(id);
    }
}
