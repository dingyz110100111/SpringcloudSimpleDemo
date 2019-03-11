package com.ding.cloud.apporder.feignclient;

import org.springframework.stereotype.Component;

@Component
public class FeignClientFallBack implements UserControllerFeignClient {
    @Override
    public String aa() {
        return "fallback";
    }
}
