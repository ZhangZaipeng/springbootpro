package com.hwz.servlet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by ZhangZaipeng on 2017/11/7 0007.
 *
 * 1.带 @WebServlet注解的Servlet注册需要@ServletComponentScan注解的扫描
 * 2.代码注册Servlet（不需要@ServletComponentScan注解）
 */
@WebServlet(urlPatterns = "/test1/*")
public class TestAnnotationServlet extends HttpServlet {

    private Logger logger = LoggerFactory.getLogger(TestAnnotationServlet.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.info("this is TestAnnotationServlet doposet method");

        PrintWriter pw = resp.getWriter();
        pw.write("hello springboot servlet register by TestAnnotationServlet");
        pw.flush();
        pw.close();
    }

    @Override
    public void init() throws ServletException {
        super.init();
    }
}
