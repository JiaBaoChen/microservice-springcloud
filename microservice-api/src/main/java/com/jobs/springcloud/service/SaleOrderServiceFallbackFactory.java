package com.jobs.springcloud.service;

import com.jobs.springcloud.entity.SaleOrder;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

/**
 * Copyright (C), 2019, 深数意识有限公司
 * FileName: SaleOrderServiceFallbackFactory
 * Author:   Jason chenjb1209@163.com
 * Date:     2019/5/16 15:56
 * Description:
 */
@Component
public class SaleOrderServiceFallbackFactory implements FallbackFactory<SaleOrderService> {

    @Override
    public SaleOrderService create(Throwable throwable) {
        return new SaleOrderService() {
            @Override
            public List<SaleOrder> getSaleOrders() {
                return Arrays.asList(new SaleOrder().setAmount(new BigDecimal(999999)));
            }
        };
    }
}