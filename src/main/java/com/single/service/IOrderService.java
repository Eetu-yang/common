package com.single.service;

import com.single.domain.SimpleOrder;

import java.util.List;

/**
 * order service interface
 */
public interface IOrderService {
    /**
     * apply order
     */
    void applyOrder();

    /**
     * query orders
     * @return
     */
    List<SimpleOrder> getSimplerOrders();
}
