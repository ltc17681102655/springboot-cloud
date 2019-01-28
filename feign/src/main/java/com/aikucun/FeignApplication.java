package com.aikucun;

import com.aikucun.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.print.DocFlavor;

/**
 * @Auther: ltc
 * @Date: 2019/1/28 14:10
 * @Description: Feign是一个声明式的伪Http客户端，它使得写Http客户端变得更简单。使用Feign，只需要创建一个接口并注解
 * <p>
 * Feign 采用的是基于接口的注解
 * Feign 整合了ribbon，具有负载均衡的能力
 * 整合了Hystrix，具有熔断的能力
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@RestController
public class FeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeignApplication.class, args);
    }

    @Value("${foo}")
    private String foo;

    @Autowired
    private FeignService feignService;


    @GetMapping("/test")
    public String demo() {
        return foo;
    }

    @GetMapping("/test2")
    public String feign() {
        String test1 = feignService.getTest1();
        System.out.println(test1);
        return test1;
    }


}

