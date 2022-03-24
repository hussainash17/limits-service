package com.dohatec.limitservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class LimitServiceApplication {
    public static void main(String[] args) {
        // Helper.setRandomPort(5000,5500);
        SpringApplication.run(LimitServiceApplication.class, args);
    }
}
