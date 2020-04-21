package com.springboot.start.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangquanwei
 */
@RestController
public class DemoController {

    @RequestMapping("/")
    public String index(){
        return "Hello SpringBoot!";
    }
}
