package com.imooc.sell.dto;

import lombok.Data;

/**
 * Created by Horizon
 * Time: 22:39 2018/6/6
 * Description:
 */
@Data
public class CartDTO {

    private String productId;

    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
