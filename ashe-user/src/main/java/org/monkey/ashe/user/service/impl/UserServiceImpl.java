package org.monkey.ashe.user.service.impl;

import org.monkey.ashe.user.pojo.User;
import org.monkey.ashe.user.mapper.UserMapper;
import org.monkey.ashe.user.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author cc
 * @since 2024-09-20
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
