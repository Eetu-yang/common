package com.single.controller;

import com.single.dto.ResposeDTO;
import com.single.exceptions.ServiceException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * apply order
 */
@RestController
public class ApplyOrderController {

    @PostMapping("/apply/order")
    public ResposeDTO apply() throws ServiceException {
        ResposeDTO resposeDTO = new ResposeDTO();

        if (true) throw new ServiceException("100", "233");
        return resposeDTO;
    }

}
