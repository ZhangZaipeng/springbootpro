package com.hwz.conf.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by Zhangzaipeng on 2017/7/2.
 * 操作系统环境变量
 * 1.在.yml文件中配置
 * 2.使用 @Value("${cupSize}")
 * 3.使用 @ConfigurationProperties 读取yml中的值
 *          @Component 将ManProperties 放到spring 容器中
 *          @Autowired 放到要是要使用的类中
 *
 */
@Component
@ConfigurationProperties(prefix = "man")
public class ManBean {

    private String telephone;
    private String realName;
    private String[] servers;

    public String[] getServers() {
        return servers;
    }

    public void setServers(String[] servers) {
        this.servers = servers;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }
}
