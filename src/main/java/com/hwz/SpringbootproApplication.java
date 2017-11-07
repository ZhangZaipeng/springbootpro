package com.hwz;

import com.hwz.servlet.TestServlet;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * SpringbootproApplication类 两个作用：1.配置  2.启动引导
 * @SpringBootApplication --> 开启组件扫描 和 自动配置
 * 实际上@SpringBootApplication = @Configuration + @EnableAutoConfiguration + @ComponentScan
 * 1.配置类：@Configuration --> 标明该类使用Spring基于Java的配置
 * 		  @EnableAutoConfiguration --> Spring Boot自动配置的魔力
 * 2.组件扫描：@ComponentScan --> Web控制器类和其他组件才能被自动发现并注册为Spring应用程序上下文里的Bean
 *
 *  scanBasePackages (作用范围)
 *  exclude (排除特定的类名的自动配置)
 */
@SpringBootApplication(scanBasePackages = {"com.hwz"}, exclude = {})

// 扫描工程中的Servlet、Filter、Listener
@ServletComponentScan(basePackages = {"com.hwz"})

// mybatis框架中的dao扫描
//@MapperScan("com.hwz.staff.mapper")

// 启注解事务管理，等同于xml配置方式的 <tx:annotation-driven />
@EnableTransactionManagement
public class SpringbootproApplication {

	public static void main(String[] args) {
		// 负责启动引导应用程序
		SpringApplication.run(SpringbootproApplication.class, args);
	}

	// 这里是通过代码的形式注册一个Servlet，这种形式不需要@ServletComponentScan注解
	@Bean
	public ServletRegistrationBean servletRegistrationBean() {
		return new ServletRegistrationBean(new TestServlet(), "/test/*");
	}
}
