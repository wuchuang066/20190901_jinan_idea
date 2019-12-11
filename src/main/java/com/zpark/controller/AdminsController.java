package com.zpark.controller;

import com.github.pagehelper.PageInfo;
import com.zpark.entity.Admins;
import com.zpark.entity.Receiver;
import com.zpark.service.AdminsService;
import com.zpark.service.ReceiverService;
import com.zpark.utils.ResultObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author wuc
 * @date 2019/11/18 10:17
 */
@Controller
@RequestMapping("admin")
public class AdminsController {

    private AdminsService adminsService;

    @Autowired
    public void setAdminsService(AdminsService adminsService) {
        this.adminsService = adminsService;
    }

    @Autowired
    private ReceiverService receiverService;

    /**
     * 功能描述 管理员登陆方法
     *
     * @param admins
     * @return com.zpark.entity.Admins
     * @author wuc
     * @date 2019/11/18 10:27
     */
    @RequestMapping("login")
    @ResponseBody
    public ResultObject login(Admins admins) {
        ResultObject ro = new ResultObject();
        try {
            Admins login = this.adminsService.login(admins);
            // 获得所有一级类别的信息
            List<Receiver> receivers = this.receiverService.selectAll();
            if (login != null) {
                ro.setCode(0);
                Map<String, Object> map = new HashMap<>();
                map.put("loginAdmin", login);
                map.put("receivers",receivers);
                ro.setResultData(map);
                return ro;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        //登陆失败
        ro.setCode(1);
        ro.setMessage("用户名或密码错误！");
        return ro;
    }

    /**
     * 功能描述 管理员注册
     *
     * @param admins
     * @return com.zpark.utils.ResultObject
     * @author wuc
     * @date 2019/11/20 15:34
     */
    @RequestMapping("register")
    @ResponseBody
    public ResultObject register(Admins admins) {
        ResultObject ro = new ResultObject();
        try {
            int result = this.adminsService.register(admins);
            if (result > 0) {
                ro.setCode(0);
                Map<String, Object> map = new HashMap<>();
                map.put("adminMsg", admins);
                ro.setResultData(map);
                return ro;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        //注册失败
        ro.setCode(1);
        ro.setMessage("管理员注册失败！");
        return ro;
    }

    @PostMapping("select/{pageNumber}")
    @ResponseBody
    public ResultObject selectPages(@PathVariable Integer pageNumber, Admins admins) {
        ResultObject result = new ResultObject();
        try {
            PageInfo<Admins> adminsInfo = this.adminsService.selectPages(admins, pageNumber);
            //判断查询是否成功
            List<Admins> list = adminsInfo.getList();
            if (list != null && list.size() > 0) {
                result.setCode(0);
                Map<String, Object> map = new HashMap<>();
                map.put("adminsPage", adminsInfo);
                result.setResultData(map);
                return result;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        // 查询失败
        result.setCode(1);
        return result;
    }

    /**
     * 功能描述 根据adminId主键查询
     *
     * @param
     * @return com.zpark.utils.ResultObject
     * @author wuc
     * @date 2019/11/25 14:38
     */
    @RequestMapping("selectByAdminId/{adminId}")
    @ResponseBody
    public ResultObject selectByPriKey(@PathVariable Integer adminId) {
        ResultObject result = new ResultObject();
        try {
            Admins admins = this.adminsService.selectByPrimaryKey(adminId);
            if (admins != null) {
                result.setCode(0);
                Map<String, Object> map = new HashMap<>();
                map.put("admin", admins);
                result.setResultData(map);
                return result;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        result.setMessage("根据主键查询管理员信息失败！");
        result.setCode(1);
        return result;
    }

    @RequestMapping("update")
    @ResponseBody
    public ResultObject updateByPri(Admins admins) {
        ResultObject result = new ResultObject();
        try {
            Integer integer = this.adminsService.updateAdmin(admins);
            if (integer > 0) {
                result.setCode(0);
                return result;
            }
        } catch (Exception e) {

        }
        result.setCode(1);
        result.setMessage("修改管理员信息失败！");
        return result;
    }
}
