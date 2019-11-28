package com.zpark.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zpark.entity.Users;
import com.zpark.mapper.UsersMapper;
import com.zpark.service.UsersService;
import com.zpark.utils.Page;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author wuc
 * @date 2019/11/26 14:02
 */
@Service
public class UsersServiceImpl implements UsersService {

    @Resource // 根据名字注入
    private UsersMapper usersMapper;
    /**
     * 功能描述 查询满足条件的用户信息
     *
     * @param users
     * @return com.github.pagehelper.PageInfo<com.zpark.entity.Users>
     * @author wuc
     * @date 2019/11/26 14:05
     */
    @Override
    public PageInfo<Users> selectUserPages(Users users, Integer pageNumber) {

        PageHelper.startPage(pageNumber, Integer.parseInt(Page.getName(6)));
        List<Users> users1 = this.usersMapper.selectPages(users);

        return new PageInfo<>(users1);
    }

    @Override
    public Integer updateUser(Users users) {
        return this.usersMapper.updateByPrimaryKeySelective(users);
    }
}
