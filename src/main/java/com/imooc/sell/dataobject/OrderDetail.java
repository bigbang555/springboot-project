package com.imooc.sell.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Horizon
 * Time: 17:20 2018/6/6
 * Description:
 */
@Entity
@Data
public class OrderDetail {

    @Id
    private String detailId;
    /**
     * 订单id.
     */
    private String orderId;

    /**
     * 商品id.
     */
    private String productId;

    /**
     * 商品名称.
     */
    private String productName;
    /**
     * 商品价格.
     */
    private String productPrice;

    /**
     * 商品数量.
     */
    private Integer productQuantity;

    /**
     * 商品小图
     */
    private String productIcon;

}