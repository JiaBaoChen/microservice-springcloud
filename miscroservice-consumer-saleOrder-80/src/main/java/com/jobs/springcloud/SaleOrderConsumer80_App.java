package com.jobs.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Copyright (C), 2019, 深数意识有限公司
 * FileName: SaleOrderConsumer80_App
 * Author:   Jason chenjb1209@163.com
 * Date:     2019/5/15 13:32
 * Description:
 */
@SpringBootApplication
@EnableEurekaClient
public class SaleOrderConsumer80_App {

    public static void main(String[] args) {
        SpringApplication.run(SaleOrderConsumer80_App.class, args);
    }

}