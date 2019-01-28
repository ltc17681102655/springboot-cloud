package com.aikucun.remote;

import com.aikucun.remote.fallback.FeignFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;


@FeignClient(value = "feign", fallbackFactory = FeignFallBack.class)
public interface IFeignRemote {

    @GetMapping("factory")
    String get();
}
