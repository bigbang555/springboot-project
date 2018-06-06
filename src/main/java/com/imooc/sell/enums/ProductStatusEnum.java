package com.imooc.sell.enums;

import lombok.Getter;

/**
 * Created by Horizon
 * Time: 14:55 2018/6/6
 * Description: 商品状态
 */
@Getter
public enum ProductStatusEnum {
    UP(0, "在架"),
    DOWN(1, "下架"),;

    private Integer code;

    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
