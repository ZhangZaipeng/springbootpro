package com.hwz.conf.mybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.TransactionManagementConfigurer;

import javax.sql.DataSource;

/**
 * Created by ZhangZaipeng on 2017/7/3.
 */
@Configuration
@EnableTransactionManagement
public class MyBatisConfig {

}
