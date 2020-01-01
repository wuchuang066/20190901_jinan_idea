package com.zpark.controller;

import com.zpark.entity.Address;
import com.zpark.service.AddressService;
import com.zpark.utils.ResultObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("address")
public class AddressController {

    private AddressService addressService;

    @Autowired
    public void setAddressService(AddressService addressService) {
        this.addressService = addressService;
    }

    /**
     * 功能描述: 地址的添加
     *
     * @param address
     * @return
     */
    @RequestMapping("insert")
    public ResultObject insert(Address address) {
        System.out.println(address);
        ResultObject rs = new ResultObject();
        try {
            Integer insert = this.addressService.insert(address);
            if (insert > 0) {
                rs.setCode(0);
                return rs;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        rs.setCode(1);
        rs.setMessage("插入地址失败！");
        return rs;
    }

    /**
     * @param address
     * @return com.zpark.utils.ResultObject
     * @author
     * @description 用户地址更新
     * @date 2019/12/24 10:03
     */
    @RequestMapping("update")
    public ResultObject update(Address address) {
        ResultObject rs = new ResultObject();
        try {
            Integer update = this.addressService.update(address);
            if (update > 0) {
                rs.setCode(0);
                return rs;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        rs.setCode(1);
        rs.setMessage("更新地址失败！");
        return rs;
    }

    /**
     * @param addressId
     * @return com.zpark.utils.ResultObject
     * @author
     * @description 删除用户地址
     * @date 2019/12/24 10:05
     */
    @RequestMapping("delete")
    public ResultObject delete(Integer addressId) {
        ResultObject rs = new ResultObject();
        try {
            Integer delete = this.addressService.delete(addressId);
            if (delete > 0) {
                rs.setCode(0);
                return rs;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        rs.setCode(1);
        rs.setMessage("删除地址失败！");
        return rs;
    }

    @RequestMapping("selectByUserId/{userId}")
    public ResultObject selectByUserId(@PathVariable Integer userId) {
        ResultObject rs = new ResultObject();
        try {
            List<Address> addresses = this.addressService.selectByUserId(userId);
            if (addresses!=null &&addresses.size() > 0) {
                rs.setCode(0);
                Map<String, Object> map = new HashMap<>();
                map.put("userAddressList",addresses);
                rs.setResultData(map);
                return rs;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        rs.setCode(1);
        rs.setMessage("查询地址失败！");
        return rs;
    }
}
