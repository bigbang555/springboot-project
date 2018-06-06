package com.imooc.sell.enums;

import lombok.Getter;

/**
 * Created by Horizon
 * Time: 17:16 2018/6/6
 * Description:
 */
@Getter
public enum PayStatusEnum {
    WAIT(0, "等待支付"),
    SUCCESS(1, "支付成功");

    private Integer code;
    private String message;

    PayStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
