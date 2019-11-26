package com.zpark.service.impl;

import com.zpark.entity.Address;
import com.zpark.mapper.AddressMapper;
import com.zpark.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author wuc
 * @date 2019/11/13 13:50
 */
@Service
public class TestServiceImpl implements TestService {
    @Override
    public Address test() {
        return null;
    }
    @Autowired
    private AddressMapper addressMapper;
//    public Address test(){
//        Address address = addressMapper.selectByPrimaryKey(1);
//        return address;
//    }
}
