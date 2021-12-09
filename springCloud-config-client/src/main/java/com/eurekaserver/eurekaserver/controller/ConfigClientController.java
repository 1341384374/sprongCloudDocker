package com.eurekaserver.eurekaserver.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：JiuXu
 * @date ：Created in 2021/12/7 16:21
 */
@RestController
public class ConfigClientController {
    @Value("${profile}")
    private String profile;

    @GetMapping("/profile")
    public String hello() {
        return this.profile;
    }

    @Value("${name}")
    private String name;

    @GetMapping("/name")
    public String hello1() {
        return this.name;
    }
}
