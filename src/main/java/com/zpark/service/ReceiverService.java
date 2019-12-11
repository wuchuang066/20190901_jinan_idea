package com.zpark.service;

import com.zpark.entity.Receiver;

import java.util.List;

/**
 * 功能描述 一级类别接口
 * @author wuc
 * @date 2019/11/28 9:43
 * @param null
 * @return
 */
public interface ReceiverService {
    List<Receiver> selectAll();

    List<Receiver> selectGroup();
}
