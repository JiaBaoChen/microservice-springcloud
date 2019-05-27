package com.jobs.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class SaleOrderProvider8003_App {
    public static void main(String[] args) {
        SpringApplication.run(SaleOrderProvider8003_App.class, args);
    }
}
