package com.zpark.controller;

import com.zpark.service.AdminsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wuc
 * @date 2019/11/14 13:19
 */
@RestController
public class AddressController {
    @Autowired
    private AdminsService adminsService;

    @RequestMapping("test")
    public String test() {
     //   Address test = service.test();
        System.out.println("12");
        return "success";
    }
}
