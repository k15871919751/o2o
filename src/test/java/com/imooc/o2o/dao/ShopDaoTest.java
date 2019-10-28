/*
package com.imooc.o2o.dao;


import com.imooc.o2o.BaseTest;
import com.imooc.o2o.entity.Area;
import com.imooc.o2o.entity.PersonInfo;
import com.imooc.o2o.entity.Shop;
import com.imooc.o2o.entity.ShopCategory;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ShopDaoTest extends BaseTest {
    @Autowired
    private ShopDao shopDao;

    @Test
    public void testInsertShop() {
      Shop shop = shopDao.selectForShop(2L);
        System.out.println(shop);

    }

    @Test
    public void test() {
        Shop shopCondition = new Shop();
        ShopCategory sc = new ShopCategory();
        sc.setShopCategoryId(1L);
        shopCondition.setShopCategory(sc);
        List<Shop> list = shopDao.selectForShopList(shopCondition, 0, 2);
        System.out.println(list.size());
        System.out.println(shopDao.selectShopCount(shopCondition));
    }

    @Test
    public void test1() {
        int total = 0;
        for (int i = 0; i < 4; i++) {
            if (i==1) continue;
            if (i==2) break;
            total += i;
        }
        System.out.println(total);
    }
}
*/
