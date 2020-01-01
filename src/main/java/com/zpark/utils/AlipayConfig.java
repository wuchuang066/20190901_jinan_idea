package com.zpark.utils;

import java.io.FileWriter;
import java.io.IOException;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *修改日期：2017-04-05
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */

public class AlipayConfig {
	
//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

	// 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
	public static String app_id = "2016092800618771";
	
	// 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQDNb6cdL4PD1UMa25p5KHbVRmrTWHqdU62kEuiQNVTCeip4oBiUNl2i4AkN8h28Ljg3n/hXDY7mx9fcJp/xjqRSeOrTk7iS6+n0eZOKB0P8y0m3z0QNTFUN2EVSu9oIaVqUT0iB0m/KbWOAQTFPLMYasBoPFKl/JjtxXDLO0OdLoUFFilUL5tqQ9zKhNCQzVcMeLgmSLZMk1mksLHZHYtpptRcKoHodu1YSziWnAjfv734OLq+0f5IWT79s/7II2RerbncJ7WUBuI3TbFdWDYKU4nxvoJ5P8EIKSrsiRkjSiV0I8rwnVXkd2XIMRoxp/vL2M19KdouutoVW4OUV3cfzAgMBAAECggEAZPelOLDrn8om6wJXj4iVrwim5CyuRrijtOoeJxIvEE4epZ55tg5qQuy9Rn9ioeRNePlEgvSE8WPy8Z6CKaSjmm0XbNlDc+JC4AcIvmQHxCzdlFtn5OlJPD65A4qUBGJTRGUbC8MzclgE+ToRVAp7aw52IEdVbsqJmJNp3T/LDd3WqE4+2bTdjaCaT34pLCggDv3HbGW2Ik18WwyghPEDOmC28kAEqi2EQ/EfdG6cin8gRRrBtxp0GO409gEGvjdK6yehJ6cvMD0dnoC52jWQdcYVJf0Kv7Il/xriaqGOt25+7N6m6saytwjmJHMS5Waj7M6SF12oWuFoKDa4eI5MYQKBgQD+Rmq2v/tZKVnEqQzHOJ2NF1R+Tq8LOs5cfDMD6SBsE5MUmOrdRbG5KHXAVr+KszywR/uSatdtTz4/DMEt495qM36SpSobiNF2UqaYKXXHd2Lc6yCA21V9EUSHFIxQukJ3d7kImuGtVNkl06x6GSxZ0yzRp+mTlPDQZE//2fVkywKBgQDO1Gunc+5/8Dy0byUl/mGT7fltbRF/iXvsgqHROJ9K0H+PnzocoLQG7ZO1FOO5W1Dxog+Ed7yv7u6sxVtUQbv1ylHvLTRo7zY80C8+XTDA29xmHiF3XxtBtk2UKavX0ZhX6PUAfQE5VyCm6UG+ks8vnBld2mDYThY99Jf6vyLseQKBgHgX+ATSTbtBzXUVxsQ9GCRwNWbmcMQkBR0nR8z8CWUiJaBfzOWvKg5ibqLmFddDalFz3fy8W3z0JVkQBBlRe1W7dnd6bJXOm+d/h9FsG4WW/GmM37AcZ5cHVc9axB7IqeXU9N58kEQWQ+0auWZ9hzXxiESJQseCW+6Awkv7vGvbAoGBAI1Sf6yPfmtUz2XKe+uWAT5+4GtwlwA6BL76E29N7SnFhSOxfJeLBvek5cRZXbCNQKWaQlgVKIxeCh9rSpgrwi6T66Atlx4MNVcgOOe37VQZ5mKwO9XA2nLwCdovDwgMYrfOqXmH8IopiloCD7YTwhWZ54tFZ97knDYBJsdiSo6hAoGBAJJTL7fccVaCbVf6tXJsfTXsRsee9E4j4fG+X854rlIt2bmDH8eCjEliIf0vYs49c3nzBSLoWWDvegEgUjXJNNxZ2W/prOnWYyXtZYu8xNfJhRjezl81hKlal08jWA7nkXlLAEzuJsQdyA6IW94c89VJ81uJSxI0p1XLBgBqVPHH";
	
	// 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAtHiy5bT6SomN69Q6F85i3ImbXDp/LwPZOH8fVB5IsPk+fECforqu2OduqA4ZT9j1pIkcg+XzLqjTGTUDYRvXrysa+oAuapLR1uKC62ugNyf7xP8S0siKHIwunSkyhWZbvDPTr+C+w0vkHJlp6HUSguF4j5MLbhHh0Pc3d2zWG7BGDCzkP4W3pnLVIbQYyMrlVPQfEPG7I2Syd1h5I+R/DAnMpB4mChA1QuDyKToMkbzhZIhmgTeld0kiG0TkPMxi/AB8UkJ0pOC2jtJ27BZu8w48SGh9cp7aC7ZylpQPFRqeaE+gTLhJO5Gfrl0hUsZoGorkI9GsHXXUuCn4rv2zLQIDAQAB";

	// 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String notify_url = "http://localhost:8080/alipay.trade.page.pay-JAVA-UTF-8/notify_url.jsp";

	// 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String return_url = "http://localhost:8080/alipay.trade.page.pay-JAVA-UTF-8/return_url.jsp";

	// 签名方式
	public static String sign_type = "RSA2";
	
	// 字符编码格式
	public static String charset = "utf-8";
	
	// 支付宝网关  添加dev参数代表为沙箱版
	public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";
	
	// 支付宝网关
	public static String log_path = "C:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /** 
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

