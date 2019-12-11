package com.zpark.controller;

import com.zpark.entity.Receiver;
import com.zpark.service.ReceiverService;
import com.zpark.utils.ResultObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author wuc
 * @date 2019/11/28 9:59
 */
@RestController
@RequestMapping("receiver")
public class ReceiverController {
    @Autowired
    private ReceiverService receiverService;

    /**
     * 功能描述 查询所有一级类别
     *
     * @param
     * @return com.zpark.utils.ResultObject
     * @author wuc
     * @date 2019/11/28 10:03
     */
    @RequestMapping("selectAll")
    public ResultObject selectAll() {
        ResultObject result = new ResultObject();
        try {
            List<Receiver> receivers = this.receiverService.selectAll();
            if (receivers != null && receivers.size() > 0) {
                result.setCode(0);
                Map<String, Object> map = new HashMap<>();
                map.put("receivers", receivers);
                result.setResultData(map);
                return result;
            }
        } catch (Exception e) {
            e.printStackTrace();
            result.setMessage(e.getMessage());
        }
        result.setCode(1);
        result.setMessage("查询一级类别失败！");
        return result;
    }

    /**
     * 功能描述 查询根据一级类别的平均价格数据
     *
     * @param
     * @return com.zpark.utils.ResultObject
     * @author
     * @date 2019/12/10 14:36
     */
    @GetMapping("selectGroup")
    public ResultObject selectGroup() {
        ResultObject rs = new ResultObject();
        try {
            List<Receiver> receivers = this.receiverService.selectGroup();
            if (receivers != null && receivers.size() > 0) {
                rs.setCode(0);
                // 声明两个集合用来保存 x轴 y轴数据
                List<String> xData = new ArrayList<>();
                List<Double> yData = new ArrayList<>();
                for (Receiver receiver : receivers) {
                    xData.add(receiver.getReceiverName());
                    yData.add(receiver.getAvgPrice());
                }
                Map<String, Object> map = new HashMap<>();
                map.put("xData", xData);
                map.put("yData", yData);
                rs.setResultData(map);
                return rs;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        rs.setCode(0);
        rs.setMessage("分组查询表格数据失败！");
        return rs;
    }
}
