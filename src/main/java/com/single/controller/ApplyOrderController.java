package com.single.controller;

import com.single.domain.SimpleOrder;
import com.single.dto.ResposeDTO;
import com.single.exceptions.ServiceException;
import com.single.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * apply order
 */
@RestController
public class ApplyOrderController {

    @Autowired
    private IOrderService orderService;

    @PostMapping("/apply/order")
    public ResposeDTO apply() throws ServiceException {
        ResposeDTO resposeDTO = new ResposeDTO();
        return resposeDTO;
    }


    @GetMapping("/query/order")
    public ResposeDTO queryOrders() throws ServiceException {
        ResposeDTO resposeDTO = new ResposeDTO();
        List<SimpleOrder> orders = orderService.getSimplerOrders();
        resposeDTO.setData(orders);
        return resposeDTO;
    }
}
