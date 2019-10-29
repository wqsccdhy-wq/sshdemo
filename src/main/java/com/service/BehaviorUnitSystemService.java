package com.service;

import com.common.model.Page;
import com.entity.BehaviorUnitSystem;

public interface BehaviorUnitSystemService {

    public BehaviorUnitSystem getBehaviorUnitSystemById(String id);

    /**
     * 查询所有的BehaviorUnitSystem
     * 
     * @param id
     * @return
     */
    public Page<BehaviorUnitSystem> getBehaviorUnitSystems(String id, int currentPage, int pageSize);
}
