package com.imooc.sell.utils;

import com.imooc.sell.VO.ResultVO;
import com.imooc.sell.enums.ResultEnum;

/**
 * Created by Horizon
 * Time: 16:21 2018/6/6
 * Description:
 */
public class ResultVOUtil {

    public static ResultVO success(Object object) {
        ResultVO resultVO = new ResultVO();
        resultVO.setData(object);
        resultVO.setCode(ResultEnum.SUCCESS.getCode());
        resultVO.setMsg(ResultEnum.SUCCESS.getMsg());
        return resultVO;
    }

    public static ResultVO success() {
        return success(null);
    }

    public static ResultVO failure() {
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(ResultEnum.FAILURE.getCode());
        resultVO.setMsg(ResultEnum.FAILURE.getMsg());
        return resultVO;
    }
}
