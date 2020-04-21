package com.springboot.config.pojo;


import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class ConfigProperties {
    @Value("${spring.config.name}")
    private String name;

    @Value("${spring.config.title}")
    private String title;
}
