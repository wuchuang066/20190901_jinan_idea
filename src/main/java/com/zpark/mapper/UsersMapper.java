package com.zpark.mapper;

import com.zpark.entity.Users;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface UsersMapper extends Mapper<Users> {

    List<Users> selectPages(Users users);
}