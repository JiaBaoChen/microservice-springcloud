package com.jobs.springcloud.controller;

import com.jobs.springcloud.entity.SaleOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * Copyright (C), 2019, 深数意识有限公司
 * FileName: ConsumerController
 * Author:   Jason chenjb1209@163.com
 * Date:     2019/5/15 13:48
 * Description:
 */
@RestController
@RequestMapping("/consumer")
public class ConsumerController {

    private final static String url = "http://microservicecloud-saleOrder";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(value = "/saleorders")
    public List<SaleOrder> getSaleOrders() {
        return restTemplate.getForObject(url + "/saleorders", List.class);
    }
}   