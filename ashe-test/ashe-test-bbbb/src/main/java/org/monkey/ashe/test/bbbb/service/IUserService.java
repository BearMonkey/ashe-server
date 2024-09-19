package org.monkey.ashe.test.bbbb.service;

import org.monkey.ashe.common.page.PageBean;
import org.monkey.ashe.test.bbbb.dto.QueryUserQeqDto;
import org.monkey.ashe.test.bbbb.dto.UserDto;
import org.monkey.ashe.test.bbbb.pojo.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author cc
 * @since 2024-09-19
 */
public interface IUserService extends IService<User> {

    /**
     * 通用分页查询用户
     * @param dto QueryUserDto
     * @return PageBean<UserDto>
     */
    PageBean<UserDto> queryUser(QueryUserQeqDto dto);
}
