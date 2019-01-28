package com.aikucun.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "config-client")
public interface FeignService {

    @GetMapping("/test")
    String getTest1();
}
