package com.zpark.utils;

import java.util.Date;

/**
 * @author wuc
 * @date 2019/11/19 16:28
 * @return
 */
public class FileUtil {
    /**
     * 功能描述 返回当前时间的字符串
     *
     * @param
     * @return java.lang.String
     * @author wuc
     * @date 2019/11/19 16:30
     */
    public static String getFileName() throws Exception {
        Date date = new Date();
        long time = date.getTime();
        return String.valueOf(time);

    }

    /**
     * 功能描述 获得文件扩展名
     *
     * @param
     * @return java.lang.String
     * @author wuc
     * @date 2019/11/20 9:31
     */
    public static String getExtension(String fileName) {
        // 文件名称为空
        if (fileName == null || "".equals(fileName.trim()))
            return null;
        // 没有找到扩展名
        int index = fileName.lastIndexOf(".");
        if (index == -1) return null;
        // 获得扩展名
        String extension = fileName.substring(index);
        return extension;
    }
}
