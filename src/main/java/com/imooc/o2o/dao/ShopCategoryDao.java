package com.imooc.o2o.dao;

import com.imooc.o2o.entity.ShopCategory;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository("shopCategoryDao")
public interface ShopCategoryDao {
    //获取所有分类
    List<ShopCategory> selectAllShopCategory(@Param("shopCategoryCondition") ShopCategory shopCategoryCondition);

    List<ShopCategory> selectAll();


}

