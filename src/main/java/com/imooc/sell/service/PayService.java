package com.imooc.sell.service;

import com.imooc.sell.dto.OrderDTO;
import com.lly835.bestpay.model.PayResponse;

/**
 * @author: Horizon
 * @time: 11:20 2018/6/8
 * Description:
 */
public interface PayService {

    PayResponse create(OrderDTO orderDTO);
}
