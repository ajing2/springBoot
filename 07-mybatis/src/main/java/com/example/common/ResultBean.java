package com.example.common;

import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName ResultBean
 * @Description TODO
 * @Author lingxiangxiang
 * @Date 5:18 PM
 * @Version 1.0
 **/
@Data
public class ResultBean<T> implements Serializable {
    private Integer code;
    private String msg;
    private T data;

    public static <K> ResultBean<K> result(Integer code, String msg, K data) {
        ResultBean resultBean = new ResultBean();
        resultBean.setCode(code);
        resultBean.setData(data);
        resultBean.setMsg(msg);
        return resultBean;
    }
}
