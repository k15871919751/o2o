package com.imooc.o2o.service;

import com.imooc.o2o.dto.ImageHolder;
import com.imooc.o2o.dto.ShopExecution;
import com.imooc.o2o.entity.Shop;
import com.imooc.o2o.exceptions.ShopOperationException;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import java.io.File;
import java.io.InputStream;
import java.util.List;

public interface ShopService {
    ShopExecution add(Shop shop, ImageHolder thumbnail) throws ShopOperationException;

    void remove(Long shopId);
//更新店铺信息,包括图片的处理
    ShopExecution edit(Shop shop, ImageHolder thumbnail) throws ShopOperationException;
//通过店铺id获取店铺信息
    Shop get(Long shopId);
     //根据ShopCondition分页返回相应列表数据
    ShopExecution getAll(Shop shopCondition, int pageIndex, int pageSize);
}
