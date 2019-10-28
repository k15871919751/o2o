/*
package com.imooc.o2o.dao;

import com.imooc.o2o.BaseTest;
import com.imooc.o2o.entity.ProductCategory;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.assertEquals;


public class ProductCategoryDaoTest extends BaseTest {
    @Autowired
    private ProductCategoryDao productCategoryDao;

    @Test
    public void test() {
        ProductCategory productCategory1 = new ProductCategory();
        productCategory1.setProductCategoryName("商品测试1");
        productCategory1.setCreateTime(new Date());
        productCategory1.setPriority(20);
        productCategory1.setShopId(2L);

        ProductCategory productCategory2 = new ProductCategory();
        productCategory2.setProductCategoryName("商品测试2");
        productCategory2.setCreateTime(new Date());
        productCategory2.setPriority(30);
        productCategory2.setShopId(2L);
        List<ProductCategory> list = new ArrayList<ProductCategory>();
        list.add(productCategory1);
        list.add(productCategory2);
        int num = productCategoryDao.batchInsertProductCategory(list);
        assertEquals(2,num);
   }

   @Test
    public void testCDeleteProductCategory() throws Exception {
       long shopId = 2;
       List<ProductCategory> productCategoryList = productCategoryDao.queryProductCategoryList(shopId);
       for (ProductCategory pc : productCategoryList) {
           if ("商品测试1".equals(pc.getProductCategoryName()) || "商品测试2".equals(pc.getProductCategoryName())) {
               int effectedNum = productCategoryDao.delete(pc.getProductCategoryId(), shopId);
               assertEquals(1, effectedNum);
           }
       }
   }
}
*/
