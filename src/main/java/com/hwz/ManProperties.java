package com.hwz;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by Zhangzaipeng on 2017/7/2.
 */
@Component
@ConfigurationProperties(prefix = "man")
public class ManProperties {

    private String telephone;
    private String realName;

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
