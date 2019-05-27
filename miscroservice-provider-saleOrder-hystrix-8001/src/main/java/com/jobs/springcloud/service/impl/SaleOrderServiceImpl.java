package com.jobs.springcloud.service.impl;

import com.jobs.springcloud.dao.SaleOrderDao;
import com.jobs.springcloud.entity.SaleOrder;
import com.jobs.springcloud.service.SaleOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Copyright (C), 2019, 深数意识有限公司
 * FileName: SaleOrderServiceImpl
 * Author:   Jason chenjb1209@163.com
 * Date:     5/13/2019 5:01 PM
 * Description:
 */
@Service
public class SaleOrderServiceImpl implements SaleOrderService {

    @Autowired
    private SaleOrderDao saleOrderDao;

    @Override
    public boolean addSaleOrder(SaleOrder saleOrder) {
        return saleOrderDao.addSaleOrder(saleOrder);
    }

    @Override
    public SaleOrder findById(Long id) {
        return saleOrderDao.findById(id);
    }

    @Override
    public List<SaleOrder> findAll() {
        return saleOrderDao.findAll();
    }
}