package com.imooc.o2o.service.impl;

import com.imooc.o2o.dao.AreaDao;
import com.imooc.o2o.entity.Area;
import com.imooc.o2o.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("areaService")
public class AreaServiceImpl implements AreaService {
    @Autowired
    private AreaDao areaDao;

    @Override
    public void add(Area area) {
        areaDao.insert(area);
    }

    @Override
    public void remove(Integer id) {
        areaDao.delete(id);
    }

    @Override
    public void edit(Area area) {
        areaDao.update(area);
    }

    @Override
    public Area get(Integer id) {
        return areaDao.select(id);
    }

    @Override
    public List<Area> getAll() {
        return areaDao.selectAll();
    }
}
