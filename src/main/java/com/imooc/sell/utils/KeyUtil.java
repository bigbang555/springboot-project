package com.imooc.sell.utils;

import java.util.Random;

/**
 * Created by Horizon
 * Time: 22:27 2018/6/6
 * Description:
 */
public class KeyUtil {

    /**
     * 生成唯一的主键
     * 格式：时间+随机数
     *
     * @return
     */
    public static synchronized String genPrimaryKey() {
        Random random = new Random();
        Integer number = random.nextInt(900000) + 100000;
        return System.currentTimeMillis() + String.valueOf(number);

    }
}
