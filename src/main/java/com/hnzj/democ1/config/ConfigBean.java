package com.hnzj.democ1.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by 周杰 on 2018/4/5.
 */
@Component
public class ConfigBean {
    @Value("${com.democ1.username}")
    String userName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
