package com.zpark.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zpark.entity.Admins;
import com.zpark.mapper.AdminsMapper;
import com.zpark.service.AdminsService;
import com.zpark.utils.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wuc
 * @date 2019/11/18 10:11
 */
@Service
public class AdminsServiceImpl implements AdminsService {
    @Autowired
    private AdminsMapper adminsMapper;

    @Override
    public Admins login(Admins admins) {
        return adminsMapper.login(admins);
    }

    @Override
    public int register(Admins admins) {
        return this.adminsMapper.insert(admins);
    }

    @Override
    public PageInfo<Admins> selectPages(Admins admins, Integer pageNumber) {
        String adminName = admins.getAdminName();

        PageHelper.startPage(pageNumber, Integer.parseInt(Page.getName(6)));
        List<Admins> adminsPages = this.adminsMapper.selectPages(admins);
        return new PageInfo<>(adminsPages);
    }

    @Override
    public Admins selectByPrimaryKey(Integer adminId) {
        return this.adminsMapper.selectByPrimaryKey(adminId);
    }

    @Override
    public Integer updateAdmin(Admins admins) {
        return this.adminsMapper.updateByPrimaryKeySelective(admins);
    }

}
