package com.aikucun.service;

import org.springframework.stereotype.Service;

@Service
public class HystrixFallBack implements FeignService {

    @Override
    public String feignServiceName() {
        return "error-500";
    }
}
