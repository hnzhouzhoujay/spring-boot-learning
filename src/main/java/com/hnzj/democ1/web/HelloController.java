package com.hnzj.democ1.web;

import com.hnzj.democ1.config.ConfigBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 周杰 on 2018/4/2.
 */
@RestController
public class HelloController {
    @Autowired
    ConfigBean configBean;

    @RequestMapping("/hello")
    public String hello(){
        return "Hello BOOt";
    }

    @RequestMapping("/profile")
    public String profile(){
        return configBean.getUserName();
    }
}
