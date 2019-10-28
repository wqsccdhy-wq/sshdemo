package com.service.impl;

import com.common.model.Page;
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
    public Page<BehaviorUnitSystem> getBehaviorUnitSystems(String id, int currentPage, int pageSize) {
        Page<BehaviorUnitSystem> page = new Page<BehaviorUnitSystem>();
        int allRow = behaviorUnitSystemDao.getAllRowCount().intValue();
        int offset = page.countOffset(currentPage, pageSize);
        List<BehaviorUnitSystem> datas = behaviorUnitSystemDao.getBehaviorUnitSystems(id, offset, pageSize);
        page.setPageNo(currentPage);
        page.setPageSize(pageSize);
        page.setTotalRecords(allRow);
        page.setList(datas);
        return page;
    }
}
