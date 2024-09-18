package org.monkey.ashe.order.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import org.monkey.ashe.order.pojo.Order;
import org.monkey.ashe.order.mapper.OrderMapper;
import org.monkey.ashe.order.service.OrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author cc
 * @since 2024-08-30
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {

    @Override
    public List<Order> getOrders(Order order) {
        LambdaQueryWrapper<Order> wrapper = new LambdaQueryWrapper<Order>();
        wrapper.eq(Order::getOrderNo, order.getOrderNo());
        return baseMapper.selectList(wrapper);
    }
}
