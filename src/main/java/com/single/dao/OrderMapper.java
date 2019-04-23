package com.single.dao;


import com.single.domain.SimpleOrder;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderMapper {
    void insert();

    List<SimpleOrder> selectSimpleOrders(@Param(value = "userId") Integer userId,@Param(value = "status") Integer status,@Param(value = "valid") Integer valid);
}
