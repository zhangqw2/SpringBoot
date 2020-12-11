package com.springboot.config.pojo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author zhangquanwei
 */
@ConfigurationProperties(prefix="spring.config")
@Data
public class ConfigBean {
    private String name;
    private String title;
    private String wholeTitle;
}
