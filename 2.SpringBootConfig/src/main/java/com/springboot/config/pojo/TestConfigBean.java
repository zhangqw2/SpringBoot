package com.springboot.config.pojo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @author zhangquanwei
 */
@Configuration
@ConfigurationProperties(prefix="person")
@PropertySource("classpath:person.properties")
@Component
@Data
public class TestConfigBean {
    private String name;
    private int age;
}
