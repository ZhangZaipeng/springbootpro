package com.hwz.conf.resources;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by ZhangZaipeng on 2017/11/7 0007.
 */
@Configuration
public class ResourcesInterceptor extends WebMvcConfigurerAdapter {
    /*
     * 注册静态文件的自定义映射路径
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        // image/**  这个是url请求路径
        // classpath:/image/ 去这个路径下寻找静态文件
        registry.addResourceHandler("/image/**")
                .addResourceLocations("classpath:/image/");
        registry.addResourceHandler("/picture/**")
                .addResourceLocations("file:F:/");
        super.addResourceHandlers(registry);
    }
}
