package com.springboot.config.controller;

import com.springboot.config.pojo.ConfigProperties;
import com.springboot.config.pojo.ConfigBean;
import com.springboot.config.pojo.TestConfigBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangquanwei
 */
@RestController
public class DemoController {

    @Autowired
    private ConfigProperties blogProperties;
    @Autowired
    private ConfigBean configBean;
    @Autowired
    private TestConfigBean testConfigBean;

    @RequestMapping("/")
    String index() {
        return testConfigBean.getName()+"，"+testConfigBean.getAge();
    }

    @RequestMapping("/getConfigBean")
    String getConfigBean() {
        return configBean.getName()+"，"+configBean.getTitle()+"\n"+configBean.getWholeTitle();
    }
    @RequestMapping("/getBlogProperties")
    String getBlogProperties() {
        return blogProperties.getName()+"，"+blogProperties.getTitle();
    }
}
