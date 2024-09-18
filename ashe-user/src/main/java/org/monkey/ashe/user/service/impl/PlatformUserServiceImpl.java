package org.monkey.ashe.user.service.impl;

import cn.hutool.core.collection.CollectionUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.monkey.ashe.common.enums.AsheError;
import org.monkey.ashe.common.exception.GlobalException;
import org.monkey.ashe.user.mapper.PlatformUserMapper;
import org.monkey.ashe.user.pojo.PlatformUser;
import org.monkey.ashe.user.service.PlatformUserService;
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
@Slf4j
public class PlatformUserServiceImpl extends ServiceImpl<PlatformUserMapper, PlatformUser> implements PlatformUserService {
    @Override
    public List<PlatformUser> findUserByName(String name) {
        return checkExistUser(name);
    }

    private List<PlatformUser> checkExistUser(String name) {
        log.info("checkExistUser {}", name);
        LambdaQueryWrapper<PlatformUser> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(PlatformUser::getName, name);
        List<PlatformUser> platformUserList = baseMapper.selectList(queryWrapper);
        if (CollectionUtil.isEmpty(platformUserList)) {
            throw new GlobalException(AsheError.FAIL.getCode(), "用户不存在");
        }
        return platformUserList;
    }
}
