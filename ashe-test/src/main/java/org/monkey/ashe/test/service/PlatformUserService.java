package org.monkey.ashe.test.service;

import org.monkey.ashe.test.pojo.PlatformUser;
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
public interface PlatformUserService extends IService<PlatformUser> {

    /**
     * 根据名称查找用户
     * @param name 名称
     * @return List<PlatformUser>
     */
    List<PlatformUser> findUserByName(String name);

}
