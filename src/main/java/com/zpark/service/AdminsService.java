package com.zpark.service;

import com.github.pagehelper.PageInfo;
import com.zpark.entity.Admins;

public interface AdminsService {
    /**
     * 功能描述 管理员登陆方法
     *
     * @param admins
     * @return com.zpark.entity.Admins
     * @author wuc
     * @date 2019/11/25 14:28
     */
    Admins login(Admins admins);

    /**
     * 功能描述 管理员注册方法
     *
     * @param admins
     * @return int
     * @author wuc
     * @date 2019/11/25 14:28
     */
    int register(Admins admins);

    /**
     * 功能描述 分页查询管理员信息
     *
     * @param admins
     * @param pageNumber
     * @return com.github.pagehelper.PageInfo<com.zpark.entity.Admins>
     * @author wuc
     * @date 2019/11/25 14:28
     */
    PageInfo<Admins> selectPages(Admins admins, Integer pageNumber);

    /**
     * 功能描述 根据主键查询
     *
     * @param adminId
     * @return com.zpark.entity.Admins
     * @author wuc
     * @date 2019/11/25 14:28
     */
    Admins selectByPrimaryKey(Integer adminId);

    /**
     * 功能描述 修改管理员信息
     *
     * @param admins
     * @return java.lang.Integer
     * @author wuc
     * @date 2019/11/25 15:45
     */
    Integer updateAdmin(Admins admins);
}
