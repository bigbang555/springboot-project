package com.imooc.sell.service;

import com.imooc.sell.dto.OrderDTO;

/**
 * @author: Horizon
 * @time: 22:29 2018/6/7
 * Description:
 */
public interface BuyerService {

    OrderDTO findOrderOne(String openid, String orderId);

    OrderDTO cancelOrder(String openid, String orderId);


}
