package com.zpark.mapper;

import com.zpark.entity.Users;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface UsersMapper extends Mapper<Users> {

    List<Users> selectPages(Users users);

    int insertSelectiveKey(Users user);

    /*根据用户的登录信息判断用户登录是否成功*/
    Users login(Users users);
}