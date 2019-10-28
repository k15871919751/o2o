package com.imooc.o2o.dao;

import com.imooc.o2o.entity.Area;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("areaDao")
public interface AreaDao {
    /*
    * 列出区域列表
    *
    * */
    void insert(Area area);

    void delete(Integer id);

    void update(Area area);

    Area select(Integer id);

    List<Area> selectAll();
}
