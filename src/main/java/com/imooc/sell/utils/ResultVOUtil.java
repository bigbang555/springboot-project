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
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        return resultVO;
    }

    public static ResultVO success() {
        return success(null);
    }

    public static ResultVO failure(Integer code, String msg) {
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(code);
        resultVO.setMsg(msg );
        return resultVO;
    }
}
