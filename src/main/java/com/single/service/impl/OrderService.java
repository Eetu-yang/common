package com.single.service.impl;

import com.single.dao.OrderMapper;
import com.single.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * order service implement
 */
public class OrderService implements IOrderService {
    @Autowired
    private OrderMapper orderMapper;

    @Override
    public void applyOrder() {
        orderMapper.insert();
    }
}
