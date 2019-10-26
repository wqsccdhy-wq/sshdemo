package com.dao;

import com.entity.BehaviorUnitSystem;

import java.util.List;

public interface BehaviorUnitSystemDao {

    public BehaviorUnitSystem getBehaviorUnitSystemById(String id);

    public List<BehaviorUnitSystem> getBehaviorUnitSystems(String id);
}
