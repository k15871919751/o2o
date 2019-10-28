package com.imooc.o2o.service;

import com.imooc.o2o.entity.Area;

import java.util.List;

public interface AreaService {

    void add(Area area);

    void remove(Integer id);

    void edit(Area area);

    Area get(Integer id);

    List<Area> getAll();
}
