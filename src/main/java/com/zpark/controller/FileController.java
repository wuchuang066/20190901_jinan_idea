package com.zpark.controller;

import com.zpark.utils.FileUtil;
import com.zpark.utils.ResultObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

/**
 * @author wuc
 * @date 2019/11/20 9:04
 */
@Controller
@RequestMapping("file")
public class FileController {

    private String[] pathArray = new String[3];

    {
        // 管理员头像的路径
        pathArray[0] = "D:/HtmlProjects/new Start/shopping-manage/upload-images/admin-images/";
        // 用户头像的路径
        pathArray[1] = "D:/HtmlProjects/new Start/shopping-manage/upload-images/user-images/";
        // 商品图片的路径
        pathArray[2] = "D:/HtmlProjects/new Start/shopping-manage/upload-images/goods-images/";
    }

    /**
     * 功能描述
     *
     * @param type       上传文件类型 1 为管理员 2 为用户 3 为商品
     * @param uploadFile 上传的文件
     * @return com.zpark.utils.ResultObject
     * @author wuc
     * @date 2019/11/20 9:21
     */
    @RequestMapping("upload/{type}")
    @ResponseBody
    public ResultObject upload(@PathVariable Integer type, @RequestParam("myFile") MultipartFile uploadFile) {
        ResultObject result = new ResultObject();
        try {
            // 文件路径
            String filePath = pathArray[type - 1];
            // 文件名称
            String fileName = FileUtil.getFileName();
            // 文件扩展名
            String fileExtension = FileUtil.getExtension(uploadFile.getOriginalFilename());
            //上传文件
            File file = new File(filePath + fileName + fileExtension);
            uploadFile.transferTo(file);
            result.setCode(0);
            // 返回文件路径、名称、扩展名
            Map<String, Object> map = new HashMap<>();
            map.put("filePath", filePath);
            map.put("fileName", fileName);
            map.put("extension", fileExtension);
            result.setResultData(map);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        // 上传文件失败
        result.setCode(1);
        result.setMessage("文件上传失败！");
        return result;
    }

    /**
     * 功能描述 删除文件类型 1 为管理员 2 为用户 3 为商品
     *
     * @param
     * @return com.zpark.utils.ResultObject
     * @author wuc
     * @date 2019/11/20 14:22
     */
    @RequestMapping("delete/{type}")
    @ResponseBody
    public ResultObject delete(@PathVariable Integer type, @RequestParam String fileName) {
        ResultObject result = new ResultObject();
        // 获得删除文件的路径
        String filePath = pathArray[type - 1];
        File file = new File(filePath + fileName);
        // 如果文件存在 则删除
        if (file.exists()) {
            if (file.delete()) {
                result.setCode(0);
                return result;
            }
        }
        result.setCode(1);
        result.setMessage("删除失败！");
        return result;
    }
}
