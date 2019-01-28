package com.aikucun;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.sleuth.Sampler;
import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Auther: ltc
 * @Date: 2019/1/28 19:55
 * @Description: http://localhost:8090/zipkin-client-test
 */
@SpringBootApplication
@RestController
public class ZipkinClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZipkinClientApplication.class, args);
    }

    @Autowired
    private RestTemplate restTemplate;

    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    @Bean
    public AlwaysSampler defaultSampler() {
        return new AlwaysSampler();
    }

    @GetMapping("zipkin-client")
    public String demo() {
//        return "success";
        return restTemplate.getForObject("http://localhost:8090/test", String.class);
    }

    @GetMapping("zipkin-client2")
    public String demo2() {
        return restTemplate.getForObject("http://localhost:8090/test", String.class);
    }

}

