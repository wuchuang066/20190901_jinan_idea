package com.zpark.service.impl;

import com.zpark.entity.Level;
import com.zpark.service.LevelService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName TestImpl
 * @Description 为了研究多个接口注入哪个的问题
 * @Author wuc
 * @Date 2019/11/28 15:01
 * @Version 1.0
 */
@Service
public class TestImpl implements LevelService {
    @Override
    public List<Level> selectByReceiverId(Integer receiverId) {
        return null;
    }
}
