/*
package com.imooc.o2o.dao;

import com.imooc.o2o.BaseTest;
import com.imooc.o2o.entity.Product;
import com.imooc.o2o.entity.ProductCategory;
import com.imooc.o2o.entity.Shop;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.xml.crypto.Data;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ProductDaoTest extends BaseTest {
    @Autowired
    private ProductDao productDao;
    @Test
    public void testInsertProduct() throws Exception {
        Shop shop1 = new Shop();
        shop1.setShopId(2L);
        ProductCategory pc1 = new ProductCategory();
        pc1.setProductCategoryId(65L);
        //初始化三个商品实例并添加进shopId为1的店铺里,
        //同时商品类别Id也为1
        Product product1 = new Product();
        product1.setProductName("测试1");
        product1.setProductDesc("测试Desc1");
        product1.setImgAddr("test1");
        product1.setPriority(1);
        product1.setEnableStatus(1);
        product1.setCreateTime(new Date());
        product1.setLastEditTime(new Date());
        product1.setShop(shop1);
        product1.setProductCategory(pc1);

        Product product2 = new Product();
        product2.setProductName("测试2");
        product2.setProductDesc("测试Desc2");
        product2.setImgAddr("test2");
        product2.setPriority(2);
        product2.setEnableStatus(0);
        product2.setCreateTime(new Date());
        product2.setLastEditTime(new Date());
        product2.setShop(shop1);
        product2.setProductCategory(pc1);


        Product product3 = new Product();
        product3.setProductName("测试3");
        product3.setProductDesc("测试Desc3");
        product3.setImgAddr("test3");
        product3.setPriority(3);
        product3.setEnableStatus(1);
        product3.setCreateTime(new Date());
        product3.setLastEditTime(new Date());
        product3.setShop(shop1);
        product3.setProductCategory(pc1);

        int effectedNum = productDao.insertProduct(product1);
        assertEquals(1, effectedNum);
        effectedNum = productDao.insertProduct(product2);
        assertEquals(1, effectedNum);
         effectedNum = productDao.insertProduct(product3);
        assertEquals(1, effectedNum);
    }

    @Test
    public void test() {
        long productId = 2L;
        Product product = productDao.queryProductById(productId);
        assertEquals(2, product.getProductImgList().size());
    }

    @Test
    public void testUpdateProduct() throws Exception {
        Product product = new Product();
        ProductCategory pc = new ProductCategory();
        Shop shop = new Shop();
        shop.setShopId(2L);
        pc.setProductCategoryId(65L);
        product.setProductId(2L);
        product.setShop(shop);
        product.setProductName("第二个商品");
        product.setProductCategory(pc);
        assertEquals(1,productDao.updateProduct(product));
    }

    @Test
    public void testQueryProductList() throws Exception {
        Product productCondition = new Product();
        //分页查询,预期返回三条结果
        List<Product> productList = productDao.queryProductList(productCondition, 0, 3);
        assertEquals(3, productList.size());
        //查询商品总数
        int count = productDao.queryProductCount(productCondition);
        assertEquals(7, count);
        //使用商品名称模糊查询
        productCondition.setProductName("测试");
        productList = productDao.queryProductList(productCondition, 0, 3);
        assertEquals(3, productList.size());
        count = productDao.queryProductCount(productCondition);
        assertEquals(6, count);
    }

    @Test
    public void testUpdateProductCategoryToNull() {
        //将productCategoryId为2的商品类别下面的商品类别置为空
        int effectedNum = productDao.updateProductCategoryToNull(65L);
        assertEquals(5, effectedNum);
    }
}
*/
