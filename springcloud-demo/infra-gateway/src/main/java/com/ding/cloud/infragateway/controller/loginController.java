package com.ding.cloud.infragateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ding
 * @discription
 * @date 2019/2/20 14:52
 */
@RestController
@RequestMapping("/test")
public class loginController {
    @GetMapping("/hello")
    public void test(){
        System.out.println("----------test-----------");
    }
}
