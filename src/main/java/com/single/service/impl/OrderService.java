package com.single.service.impl;

import com.single.dao.OrderMapper;
import com.single.domain.SimpleOrder;
import com.single.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * order service implement
 */
@Service
public class OrderService implements IOrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Override
    public void applyOrder() {
        orderMapper.insert();
    }

    @Override
    public List<SimpleOrder> getSimplerOrders() {
        return orderMapper.selectSimpleOrders(13233333,2,1);
    }
}
