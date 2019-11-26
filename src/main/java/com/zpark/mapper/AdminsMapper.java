package com.zpark.mapper;

import com.zpark.entity.Admins;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface AdminsMapper extends Mapper<Admins> {

    int insertAdmins(Admins record);

    Admins login(Admins admins);

    List<Admins> selectPages(Admins admins);

}