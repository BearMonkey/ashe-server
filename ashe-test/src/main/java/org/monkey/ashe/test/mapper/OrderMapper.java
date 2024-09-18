package org.monkey.ashe.test.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.monkey.ashe.test.pojo.Order;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author cc
 * @since 2024-08-30
 */
@Mapper
public interface OrderMapper extends BaseMapper<Order> {

}
