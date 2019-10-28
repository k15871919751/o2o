package com.imooc.o2o.dao;


import com.imooc.o2o.entity.Shop;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("shopDao")
public interface ShopDao {
    /*
     * 新增店铺
     *
     * */
    int insert(Shop shop);

    void delete(Long shopId);

    int update(Shop shop);

    /**
     * 通过shop id 查询店铺
     * @param shopId
     * @return shop
     */
    Shop selectForShop(long shopId);

    /**
     * 分页查询店铺 可输入的条件有 : 店铺名(模糊),店铺类别,区域Id,owner
     *
     * @param shopCondition
     * @param rowIndex      从第几行开始取数据
     * @param pageSize      返回的条数
     * @return
     */
    List<Shop> selectForShopList(@Param("shopCondition") Shop shopCondition, @Param("rowIndex") int rowIndex, @Param("pageSize") int pageSize);

    /**
     * 返回查询的总数
     * @param shopCondition
     * @return
     */
    int selectShopCount(@Param("shopCondition") Shop shopCondition);
}
