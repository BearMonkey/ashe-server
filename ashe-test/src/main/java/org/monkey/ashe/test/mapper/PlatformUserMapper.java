package org.monkey.ashe.test.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.monkey.ashe.test.pojo.PlatformUser;
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
public interface PlatformUserMapper extends BaseMapper<PlatformUser> {

}
