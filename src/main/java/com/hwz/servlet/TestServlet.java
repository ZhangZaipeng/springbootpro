package com.hwz.servlet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by ZhangZaipeng on 2017/11/7 0007.
 * 通过代码的形式注册一个Servlet
 * 注册位置在  springBoot 启动类中
 */
public class TestServlet extends HttpServlet {
    private Logger logger = LoggerFactory.getLogger(TestServlet.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        // TODO Auto-generated method stub
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        // TODO Auto-generated method stub
        logger.info("this is TestServlet doposet method");
        PrintWriter pw = resp.getWriter();
        pw.write("hello springboot servlet register by TestServlet");
        pw.flush();
        pw.close();
    }

    @Override
    public void init() throws ServletException {
        // TODO Auto-generated method stub
        super.init();
    }
}
