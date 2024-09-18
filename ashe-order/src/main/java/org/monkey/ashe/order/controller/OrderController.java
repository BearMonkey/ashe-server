package org.monkey.ashe.order.controller;


import org.monkey.ashe.common.dto.Result;
import org.monkey.ashe.order.pojo.Order;
import org.monkey.ashe.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author cc
 * @since 2024-08-30
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/list")
    public Result<List<Order>> getOrders(Order order) {
        return Result.fail(orderService.getOrders(order));
    }
}
