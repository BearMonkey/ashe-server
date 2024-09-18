package org.monkey.ashe.user.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.monkey.ashe.user.mapper.OrderMapper;
import org.monkey.ashe.user.pojo.Order;
import org.monkey.ashe.user.service.OrderService;
import org.springframework.stereotype.Service;

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

}
