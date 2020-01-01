package com.zpark.controller;

import com.alibaba.fastjson.JSONObject;
import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayTradePagePayRequest;
import com.zpark.entity.AlipayMessage;
import com.zpark.entity.ExtendParams;
import com.zpark.utils.AlipayConfig;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @ClassName AlipayController
 * @Description TODO
 * @Author
 * @Date 2019/12/21 17:36
 * @Version 1.0
 */
@RestController()
@RequestMapping("pay")
public class AlipayController {

    /**
     * 功能描述 阿里支付宝沙箱版支付
     *
     * @param httpResponse
     * @return void
     * @author
     * @date 2019/12/21 17:59
     */
    @RequestMapping("alipay")
    public void doPost(Double price, @RequestParam String goodsMessage, HttpServletResponse httpResponse) throws IOException {
//        byte[] b = goodsMessage.getBytes("ISO-8859-1");//用tomcat的格式（iso-8859-1）方式去读。
//        String str = new String(b, "utf-8");//采用utf-8去接string
        // 修改为alipaydev  沙箱版 正式版为alipay
        AlipayClient alipayClient = new DefaultAlipayClient("https://openapi.alipaydev.com/gateway.do",
                AlipayConfig.app_id, AlipayConfig.merchant_private_key, "JSON", AlipayConfig.charset,
                AlipayConfig.alipay_public_key, AlipayConfig.sign_type); //获得初始化的AlipayClient
        AlipayTradePagePayRequest alipayRequest = new AlipayTradePagePayRequest();//创建API对应的request
        alipayRequest.setReturnUrl("http://127.0.0.1:5500/home/success.html");
        alipayRequest.setNotifyUrl("http://domain.com/CallBack/notify_url.jsp");//在公共参数中设置回跳和通知地址
        AlipayMessage alipayMessage = new AlipayMessage();
        ExtendParams extendParams = new ExtendParams();
        extendParams.setSys_service_provider_id("2088511833207846");
        alipayMessage.setOut_trade_no(System.currentTimeMillis());
        alipayMessage.setProduct_code("FAST_INSTANT_TRADE_PAY");
        alipayMessage.setTotal_amount(price);
        alipayMessage.setSubject(goodsMessage);
        alipayMessage.setBody("body");
        alipayMessage.setPassback_params("merchantBizType%3d3C%26merchantBizNo%3d2016010101111");
        alipayMessage.setExtend_params(extendParams);
        String bizContext = JSONObject.toJSONString(alipayMessage);
        alipayRequest.setBizContent(bizContext);
        String form = "";
        try {
            form = alipayClient.pageExecute(alipayRequest).getBody(); //调用SDK生成表单
        } catch (AlipayApiException e) {
            e.printStackTrace();
        }
        httpResponse.setContentType("text/html;charset=" + AlipayConfig.charset);
        httpResponse.getWriter().write(form);//直接将完整的表单html输出到页面
        httpResponse.getWriter().flush();
        httpResponse.getWriter().close();
    }
}
