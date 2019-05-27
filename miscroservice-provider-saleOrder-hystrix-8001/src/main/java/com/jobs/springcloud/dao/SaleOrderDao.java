package com.jobs.springcloud.dao;

import com.jobs.springcloud.entity.SaleOrder;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author DataSense
 * @since 2019-05-13 17:02
 */
@Mapper
public interface SaleOrderDao {

    public boolean addSaleOrder(SaleOrder saleOrder);

    public SaleOrder findById(Long id);

    public List<SaleOrder> findAll();
}
