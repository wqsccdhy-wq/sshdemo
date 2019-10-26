package com.service;

import com.entity.BehaviorUnitSystem;

import java.util.List;

public interface BehaviorUnitSystemService {

    public BehaviorUnitSystem getBehaviorUnitSystemById(String id);

    /**
     * 查询所有的BehaviorUnitSystem
     * @param id
     * @return
     */
    public List<BehaviorUnitSystem> getBehaviorUnitSystems(String id);
}
