package com.hwz.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * Created by ZhangZaipeng on 2017/7/3.
 * @Aspect 切面注解
 * @Component 把该文件加入spring容器中
 */
@Aspect
@Component
public class HttpAspect {

    @Before("execution( * com.hwz.*.*(..))")
    public void log(){
        System.out.println("123213");
    }

    @After("execution( * com.hwz.*.*(..))")
    public void log1(){
        System.out.println("2333333333");
    }
}
