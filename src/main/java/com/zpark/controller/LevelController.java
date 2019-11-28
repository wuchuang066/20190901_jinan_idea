package com.zpark.controller;

import com.zpark.entity.Level;
import com.zpark.service.LevelService;
import com.zpark.utils.ResultObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName LevelController
 * @Author wuc
 * @Date 2019/11/28 14:51
 * @Version 1.0
 */
@RestController
@RequestMapping("level")
public class LevelController {
    @Autowired
    @Qualifier("levelServiceImpl")
    private LevelService levelService;

    /**
     * 功能描述
     *
     * @param receiverId
     * @return com.zpark.utils.ResultObject
     * @author wuc
     * @date 2019/11/28 14:58
     */
    @GetMapping("selectByReceiverId/{receiverId}")
    public ResultObject selectByReceiverId(@PathVariable Integer receiverId) {
        ResultObject result = new ResultObject();
        try {
            List<Level> levels = this.levelService.selectByReceiverId(receiverId);
            if (levels != null && levels.size() > 0) {
                result.setCode(0);
                Map<String, Object> map = new HashMap<>();
                map.put("levels", levels);
                result.setResultData(map);
                return result;
            }
        } catch (Exception e) {
            e.printStackTrace();
            result.setMessage(e.getMessage());
        }
        result.setCode(1);
        result.setMessage("查询二级类别失败！");
        return result;
    }
}
