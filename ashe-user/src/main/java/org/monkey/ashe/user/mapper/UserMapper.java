package org.monkey.ashe.user.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.monkey.ashe.user.pojo.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author cc
 * @since 2024-09-20
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
