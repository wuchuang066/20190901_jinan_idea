package com.zpark.controller;

import com.github.pagehelper.PageInfo;
import com.zpark.entity.Users;
import com.zpark.service.UsersService;
import com.zpark.utils.ResultObject;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author wuc
 * @date 2019/11/26 14:39
 */
@RestController
@RequestMapping("user")
public class UsersController {
    @Resource
    private UsersService usersService;

    /**
     * 功能描述 查询用户信息
     *
     * @param
     * @return com.zpark.utils.ResultObject
     * @author wuc
     * @date 2019/11/26 14:41
     */
    @RequestMapping("selectUsersPage/{pageNumber}")
    public ResultObject selectUserPages(@PathVariable Integer pageNumber, Users users) {
        ResultObject result = new ResultObject();
        try {
            PageInfo<Users> usersPageInfo = this.usersService.selectUserPages(users, pageNumber);
            List<Users> list = usersPageInfo.getList();
            if (list != null && list.size() > 0) {
                Map<String, Object> map = new HashMap<>();
                map.put("users", usersPageInfo);
                result.setCode(0);
                result.setResultData(map);
                return result;
            }

        } catch (Exception e) {
            e.printStackTrace();
            result.setMessage(e.getMessage());
        }
        // 查询用户信息失败
        result.setMessage("没有找到满足条件的数据或查询失败！");
        result.setCode(1);
        return result;
    }
    @RequestMapping("updateUserState")
    @ResponseBody
    public ResultObject updateByPri(Users users) {
        ResultObject result = new ResultObject();
        try {
            Integer integer = this.usersService.updateUser(users);
            if (integer > 0) {
                result.setCode(0);
                return result;
            }
        } catch (Exception e) {

        }
        result.setCode(1);
        result.setMessage("修改用户信息失败！");
        return result;
    }
}
