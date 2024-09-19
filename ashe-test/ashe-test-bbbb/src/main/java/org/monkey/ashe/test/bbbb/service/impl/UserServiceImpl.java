package org.monkey.ashe.test.bbbb.service.impl;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.collection.CollectionUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.monkey.ashe.common.page.PageBean;
import org.monkey.ashe.test.bbbb.dto.QueryUserQeqDto;
import org.monkey.ashe.test.bbbb.dto.UserDto;
import org.monkey.ashe.test.bbbb.pojo.User;
import org.monkey.ashe.test.bbbb.mapper.UserMapper;
import org.monkey.ashe.test.bbbb.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author cc
 * @since 2024-09-19
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Override
    public PageBean<UserDto> queryUser(QueryUserQeqDto dto) {
        LambdaQueryWrapper<User> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(User::getGender, dto.getGender());
        Page<User> userPage = baseMapper.selectPage(new Page<User>(dto.getPageNum(), dto.getPageSize()), wrapper);
        PageBean<UserDto> pageBean = new PageBean<>();
        pageBean.setPageNum(dto.getPageNum());
        pageBean.setPageSize(dto.getPageSize());
        List<UserDto> list = new ArrayList<>();
        if (CollectionUtil.isNotEmpty(userPage.getRecords())) {
            list = BeanUtil.copyToList(userPage.getRecords(), UserDto.class);
        }
        pageBean.setList(list);
        pageBean.setTotalPage(userPage.getPages());
        pageBean.setTotalCount(userPage.getTotal());
        return pageBean;
    }
}
