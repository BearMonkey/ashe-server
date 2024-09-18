package org.monkey.ashe.test.service.impl;

import org.monkey.ashe.test.mapper.OrderMapper;
import org.monkey.ashe.test.pojo.Order;
import org.monkey.ashe.test.service.OrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
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
