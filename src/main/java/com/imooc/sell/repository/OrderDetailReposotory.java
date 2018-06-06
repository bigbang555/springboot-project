package com.imooc.sell.repository;

import com.imooc.sell.dataobject.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Horizon
 * Time: 17:28 2018/6/6
 * Description:
 */
public interface OrderDetailReposotory extends JpaRepository<OrderDetail, String> {

    List<OrderDetail> findByOrOrderId(String orderId);

}
