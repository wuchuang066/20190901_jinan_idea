package com.zpark.utils;

import lombok.Data;

import java.io.Serializable;
import java.util.Map;

/**
 * @author wuc
 * @date 2019/11/18 10:53
 */
@Data
public class ResultObject implements Serializable {
    private static final long serialVersionUID = 7708301943655982622L;
    /**
     * 功能描述 保存调用状态  0 是成功 1 是失败
     */
    private Integer code;
    /**
     * 功能描述 保存调用调用信息
     */
    private String message;
    /**
     * 功能描述 用来保存返回的数据
     */
    private Map<String, Object> resultData;

}
