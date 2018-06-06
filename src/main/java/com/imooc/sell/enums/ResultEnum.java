package com.imooc.sell.enums;

import lombok.Getter;

/**
 * Created by Horizon
 * Time: 16:25 2018/6/6
 * Description:
 */
@Getter
public enum ResultEnum {
    SUCCESS(0,"成功"),
    FAILURE(1,"失败")
    ;
    private Integer code;
    private String msg;

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }


}
