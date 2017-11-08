package com.hwz.interceptor;

import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by ZhangZaipeng on 2017/11/8 0008.
 */
public class SpringInterceptorRegister extends WebMvcConfigurerAdapter {

    // 添加spring中的拦截器
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 添加拦截器
        registry.addInterceptor(new TestInterceptors()).addPathPatterns("/**");

        super.addInterceptors(registry);
    }
}
