package com.zpark.utils;


import com.zpark.entity.Receiver;
import com.zpark.mapper.ReceiverMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.util.List;

/**
 * @ClassName ApplicationListener
 * @Description TODO
 * @Author
 * @Date 2019/12/16 9:08
 * @Version 1.0
 */
public class ApplicationListener implements ServletContextListener{
    @Autowired
    private ReceiverMapper receiverMapper;
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("监听器开启....");
//        WebApplicationContextUtils.getRequiredWebApplicationContext(servletContextEvent.getServletContext())
//                .getAutowireCapableBeanFactory().autowireBean(this);
        // 和上面长的效果是一样滴,解决注入不进去
        SpringBeanAutowiringSupport.processInjectionBasedOnCurrentContext(this);
        List<Receiver> receivers = this.receiverMapper.selectReceiver();
        ServletContext application = servletContextEvent.getServletContext();
        application.setAttribute("receiverList",receivers);
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println("监听器关闭....");
    }
}
