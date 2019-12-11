package com.zpark.mapper;

import com.zpark.entity.Receiver;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface ReceiverMapper extends Mapper<Receiver> {

   List<Receiver> selectGroup();
}