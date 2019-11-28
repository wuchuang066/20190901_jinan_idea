package com.zpark.service.impl;

import com.zpark.entity.Level;
import com.zpark.mapper.LevelMapper;
import com.zpark.service.LevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * @author wuc
 * @date 2019/11/28 9:39
 */
@Service
public class LevelServiceImpl implements LevelService {
    @Autowired
    private LevelMapper levelMapper;
    @Override
    public List<Level> selectByReceiverId(Integer receiverId) {
        // 根据一级类别id查询
        Example example = new Example(Level.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("receiverId",receiverId);
        return this.levelMapper.selectByExample(example);
    }
}
