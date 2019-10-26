package com.service.impl;

import com.dao.BehaviorUnitSystemDao;
import com.entity.BehaviorUnitSystem;
import com.service.BehaviorUnitSystemService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BehaviorUnitSystemServiceImpl implements BehaviorUnitSystemService {

    @Resource
    private BehaviorUnitSystemDao behaviorUnitSystemDao;

    @Override
    public BehaviorUnitSystem getBehaviorUnitSystemById(String id) {
        return behaviorUnitSystemDao.getBehaviorUnitSystemById(id);
    }

    /**
     * 查询所有的BehaviorUnitSystem
     *
     * @param id
     * @return
     */
    @Override
    public List<BehaviorUnitSystem> getBehaviorUnitSystems(String id) {
        return behaviorUnitSystemDao.getBehaviorUnitSystems(id);
    }
}
