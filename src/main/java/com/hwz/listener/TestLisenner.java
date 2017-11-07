package com.hwz.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Created by ZhangZaipeng on 2017/11/7 0007.
 */
@WebListener
public class TestLisenner implements ServletContextListener {

    private Logger logger = LoggerFactory.getLogger(TestLisenner.class);

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        logger.info("ServletContext 初始化");
        logger.info("--> " + sce.getServletContext().getServerInfo());
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        logger.info("ServletContext 销毁");
    }
}
