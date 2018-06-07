package com.imooc.sell.repository;

import com.imooc.sell.dataobject.OrderDetail;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Horizon
 * Time: 17:48 2018/6/6
 * Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderDetailReposotoryTest {

    @Autowired
    private OrderDetailReposotory reposotory;

    @Test
    public void saveTest() {
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setDetailId("123456");
        orderDetail.setOrderId("123456");
        orderDetail.setProductIcon("http://xxx.jpg");
        orderDetail.setProductId("111441121");
        orderDetail.setProductName("皮皮虾");
        orderDetail.setProductPrice(new BigDecimal(5.2));
        orderDetail.setProductQuantity(20);

        OrderDetail result = reposotory.save(orderDetail);
        Assert.assertNotNull(result);
    }

    @Test
    public void findByOrOrderId() {
        List<OrderDetail> orderDetailList = reposotory.findByOrOrderId("123456");
        Assert.assertNotEquals(0, orderDetailList);
    }
}