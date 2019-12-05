package com.zpark.mapper;

import com.zpark.entity.Goods;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface GoodsMapper extends Mapper<Goods> {

    List<Goods> selectPages(Goods goods);


}