package com.springboot.config;

import com.springboot.config.pojo.ConfigBean;
import com.springboot.config.pojo.TestConfigBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * @author zhangquanwei
 */
@SpringBootApplication
@EnableConfigurationProperties({ConfigBean.class, TestConfigBean.class})
public class ConfigApplication {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(ConfigApplication.class);
        application.setAddCommandLineProperties(false);
        application.run(args);
    }

}
