package com.jobs.springcloud.controller;

import com.jobs.springcloud.entity.SaleOrder;
import com.jobs.springcloud.service.SaleOrderService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

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


    @GetMapping(value = "/saleorder/{id}")
    //一旦调用服务方法失败并抛出了错误信息后，会自动调用@HystrixCommand标注好的fallbackMethod调用类中的指定方法
    @HystrixCommand(fallbackMethod = "processHystrix_Get")
    public SaleOrder getSaleOrderById(@PathVariable Long id) {
        SaleOrder saleOrder = saleOrderService.findById(id);
        if (saleOrder == null) {
            throw new RuntimeException("该ID：" + id + "没有没有对应的信息");
        }
        return saleOrderService.findById(id);
    }

    public SaleOrder processHystrix_Get(@PathVariable Long id) {
        return new SaleOrder().setAmount(new BigDecimal("889899999"));
    }

}   