package com.jobs.springcloud.controller;

import com.jobs.springcloud.entity.SaleOrder;
import com.jobs.springcloud.service.SaleOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Copyright (C), 2019, 深数意识有限公司
 * FileName: ConsumerController
 * Author:   Jason chenjb1209@163.com
 * Date:     2019/5/15 13:48
 * Description:
 */
@RestController
public class ConsumerController {

    @Autowired
    private SaleOrderService saleOrderService;

    @GetMapping(value = "/consumer/saleorders")
    public List<SaleOrder> getSaleOrders() {
        return saleOrderService.getSaleOrders();
    }
}   