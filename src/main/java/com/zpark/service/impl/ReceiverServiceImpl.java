package com.zpark.service.impl;

import com.zpark.entity.Receiver;
import com.zpark.mapper.ReceiverMapper;
import com.zpark.service.ReceiverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wuc
 * @date 2019/11/28 9:44
 */
@Service
public class ReceiverServiceImpl implements ReceiverService {
    @Autowired
    private ReceiverMapper receiverMapper;

    /**
     * 功能描述: 查询所有一级类别
     *
     * @param
     * @return java.util.List<com.zpark.entity.Receiver>
     * @author wuc
     * @date 2019/11/28 9:54
     */
    @Override
    public List<Receiver> selectAll() {
        return this.receiverMapper.selectAll();
    }
    @Override
    public List<Receiver> selectGroup(){
        return this.receiverMapper.selectGroup();
    }

    @Override
    public List<Receiver> selectReceiver() {
        return this.receiverMapper.selectReceiver();
    }

    @Override
    public Receiver selectGoods(Integer i) {
        return this.receiverMapper.selectGoods(i);
    }
}
