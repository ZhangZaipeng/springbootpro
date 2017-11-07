package com.hwz.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * Created by ZhangZaipeng on 2017/11/7 0007.
 *
 * 自定义Servlet过滤器 使用 @WebFilter
 */
@WebFilter(filterName = "testFilter",urlPatterns = "/*")
public class TestFilter implements Filter {

    private Logger logger = LoggerFactory.getLogger(TestFilter.class);

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest)request;
        logger.info(req.getRequestURL() + " ------> doFilter");
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {

    }
}
