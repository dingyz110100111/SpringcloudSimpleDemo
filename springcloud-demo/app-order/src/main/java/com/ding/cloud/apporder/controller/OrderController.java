package com.ding.cloud.apporder.controller;

import com.ding.cloud.apporder.feignclient.UserControllerFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    @Autowired
    UserControllerFeignClient userControllerFeignClient;

    @RequestMapping("/bb")
    public String bb() {
        String aa = userControllerFeignClient.aa();
        return aa;
    }
}
