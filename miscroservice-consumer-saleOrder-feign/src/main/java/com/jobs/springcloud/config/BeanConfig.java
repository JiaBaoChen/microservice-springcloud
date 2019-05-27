package com.jobs.springcloud.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Copyright (C), 2019, 深数意识有限公司
 * FileName: BeanConfig
 * Author:   Jason chenjb1209@163.com
 * Date:     2019/5/15 13:42
 * Description:
 */
@Configuration
public class BeanConfig {

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    @Bean
    public IRule getIRule(){
        return new RandomRule();
    }
}   