package com.zpark.service;

import com.zpark.entity.Level;

import java.util.List;

public interface LevelService {

    List<Level> selectByReceiverId(Integer receiverId);
}
