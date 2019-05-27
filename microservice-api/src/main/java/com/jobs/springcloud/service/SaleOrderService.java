package com.jobs.springcloud.service;

import com.jobs.springcloud.entity.SaleOrder;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @author DataSense
 * @since 2019-05-15 17:43
 */
//@FeignClient(value = "MICROSERVICECLOUD-SALEORDER")
@FeignClient(value = "MICROSERVICECLOUD-SALEORDER", fallbackFactory = SaleOrderServiceFallbackFactory.class)
public interface SaleOrderService {

    @GetMapping(value = "/saleorders")
    public List<SaleOrder> getSaleOrders();
}
