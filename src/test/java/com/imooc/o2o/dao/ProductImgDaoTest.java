/*
package com.imooc.o2o.dao;

import com.imooc.o2o.BaseTest;
import com.imooc.o2o.entity.ProductImg;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ProductImgDaoTest extends BaseTest {
    @Autowired
    private ProductImgDao productImgDao;

    @Test
    public void testBatchInsertProductImg() throws Exception {
        //productId为1的商品里添加两个详情图片记录
        ProductImg productImg1 = new ProductImg();
        productImg1.setImgAddr("图片1");
        productImg1.setImgDesc("测试图片1");
        productImg1.setCreateTime(new Date());
        productImg1.setPriority(1);
        productImg1.setProductId(2L);

        ProductImg productImg2 = new ProductImg();
        productImg2.setImgAddr("图片2");
        productImg2.setImgDesc("测试图片2");
        productImg2.setCreateTime(new Date());
        productImg2.setPriority(1);
        productImg2.setProductId(2L);
        List<ProductImg> productImgList = new ArrayList<ProductImg>();
        productImgList.add(productImg1);
        productImgList.add(productImg2);
        int num = productImgDao.batchInsertProductImg(productImgList);
        assertEquals(2, num);
    }

    @Test
    public void testDeleteProductImgByProductId() throws Exception {
        //删除新增的商品详细图片记录
        long productId = 2L;
        int effectedNum = productImgDao.deleteProductImgByProductId(productId);
        assertEquals(4, effectedNum);
    }
}
*/
