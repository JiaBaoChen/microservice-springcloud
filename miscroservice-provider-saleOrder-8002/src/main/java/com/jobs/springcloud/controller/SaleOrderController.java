package com.jobs.springcloud.controller;

import com.jobs.springcloud.entity.SaleOrder;
import com.jobs.springcloud.service.SaleOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Copyright (C), 2019, 深数意识有限公司
 * FileName: SaleOrderController
 * Author:   Jason chenjb1209@163.com
 * Date:     5/13/2019 4:59 PM
 * Description:
 */
@RestController
public class SaleOrderController {

    @Autowired
    private SaleOrderService saleOrderService;

    @Autowired
    private DiscoveryClient discoveryClient;

    @PostMapping(value = "/saleorder")
    public void addSaleOrder(SaleOrder saleOrder) {
        saleOrderService.addSaleOrder(saleOrder);
    }

    @GetMapping(value = "/saleorders")
    public List<SaleOrder> getSaleOrders() {
        List<String> list = discoveryClient.getServices();
        System.out.println("***22222222222222222222222222*******" + list);

        List<ServiceInstance> srvList = discoveryClient.getInstances("MICROSERVICECLOUD-SALEORDER");
        for (ServiceInstance element : srvList) {
            System.out.println(element.getServiceId() + "\t" + element.getHost() + "\t" + element.getPort() + "\t"
                    + element.getUri());
        }
        return saleOrderService.findAll();
    }

    @GetMapping(value = "/saleorder/{id}")
    public SaleOrder getSaleOrderById(@PathVariable Long id) {
        return saleOrderService.findById(id);
    }

}   