package com.ding.cloud.appuser.controller;

import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableFeignClients
public class UserController {
    @RequestMapping("/aa")
    public String aa() {
        return "asdfghjkk";
    }
}
