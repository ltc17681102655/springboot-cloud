package com.aikucun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: ltc
 * @Date: 2019/1/28 16:15
 * @Description: http://localhost:8087/api-b/test
 */
@SpringBootApplication
@EnableEurekaClient
@RestController
public class EurekaClientTest2Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientTest2Application.class, args);
    }

    @GetMapping("test")
    public String service() {
        return "eureka-client-test=====2";
    }

}

