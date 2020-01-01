package com.zpark.service;

import com.zpark.entity.Address;

import java.util.List;

public interface AddressService {
    List<Address> selectByUserId(Integer userId);

    Integer insert(Address address);

    Integer update(Address address);

    Integer delete(Integer addressId);
}
