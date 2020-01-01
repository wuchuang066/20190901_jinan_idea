package com.zpark.service.impl;

import com.zpark.entity.Address;
import com.zpark.mapper.AddressMapper;
import com.zpark.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {

    private AddressMapper addressMapper;

    @Autowired
    public void setAddressMapper(AddressMapper addressMapper) {
        this.addressMapper = addressMapper;
    }

    @Override
    public List<Address> selectByUserId(Integer userId) {
        Example example = new Example(Address.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("userId",userId);
        List<Address> addresses = addressMapper.selectByExample(example);
        return addresses;
    }

    @Override
    public Integer insert(Address address) {
        return this.addressMapper.insertSelective(address);
    }

    @Override
    public Integer update(Address address) {
        return this.addressMapper.updateByPrimaryKeySelective(address);
    }

    @Override
    public Integer delete(Integer addressId) {
        return this.addressMapper.deleteByPrimaryKey(addressId);
    }
}
