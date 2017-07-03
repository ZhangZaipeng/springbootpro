package com.hwz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * SpringbootproApplication类 两个作用：1.配置  2.启动引导
 * @SpringBootApplication --> 开启组件扫描 和 自动配置
 *
 * 实际上@SpringBootApplication = @Configuration + @EnableAutoConfiguration + @ComponentScan
 * 配置类：@Configuration --> 标明该类使用Spring基于Java的配置
 * 		  @EnableAutoConfiguration --> Spring Boot自动配置的魔力
 * 组件扫描：@ComponentScan --> Web控制器类和其他组件才能被自动发现并注册为Spring应用程序上下文里的Bean
 *
 */
@SpringBootApplication
public class SpringbootproApplication {

	public static void main(String[] args) {
		// 负责启动引导应用程序
		SpringApplication.run(SpringbootproApplication.class, args);
	}
}
