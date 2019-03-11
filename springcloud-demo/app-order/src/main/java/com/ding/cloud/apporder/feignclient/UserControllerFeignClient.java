package com.ding.cloud.apporder.feignclient;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "app-user", fallback = FeignClientFallBack.class)
public interface UserControllerFeignClient {
    @RequestMapping("/aa")
    String aa();
}
