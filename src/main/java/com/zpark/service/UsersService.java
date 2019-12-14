package com.zpark.service;

import com.github.pagehelper.PageInfo;
import com.zpark.entity.Users;

public interface UsersService {
    /**
     * 功能描述 查询满足条件的用户信息
     * @author wuc
     * @date 2019/11/26 14:05
     * @param users
     * @return com.github.pagehelper.PageInfo<com.zpark.entity.Users>
     */
    PageInfo<Users> selectUserPages(Users users, Integer pageNumber);

    Integer updateUser(Users users);

    Integer insert(Users user);

    Users login(Users users);
}
