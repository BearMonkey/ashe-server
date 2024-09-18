package org.monkey.ashe.order.service;

import org.monkey.ashe.order.pojo.Order;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author cc
 * @since 2024-08-30
 */
public interface OrderService extends IService<Order> {
    List<Order> getOrders(Order order);
}
