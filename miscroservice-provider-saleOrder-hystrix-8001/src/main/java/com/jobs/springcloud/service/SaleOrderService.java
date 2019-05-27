package com.jobs.springcloud.service;

import com.jobs.springcloud.entity.SaleOrder;

import java.util.List;

/**
 * @author DataSense
 * @since 2019-05-13 17:01
 */
public interface SaleOrderService {

    public boolean addSaleOrder(SaleOrder saleOrder);

    public SaleOrder findById(Long id);

    public List<SaleOrder> findAll();
}
