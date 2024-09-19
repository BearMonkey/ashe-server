package org.monkey.ashe.test.aaaa.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import org.monkey.ashe.common.page.PageBean;
import org.monkey.ashe.test.aaaa.dto.RegionQueryDto;
import org.monkey.ashe.test.aaaa.pojo.Region;
import org.monkey.ashe.test.bbbb.dto.QueryUserQeqDto;
import org.monkey.ashe.test.bbbb.dto.UserDto;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author cc
 * @since 2024-09-18
 */
public interface IRegionService extends IService<Region> {

    /**
     * 地区分页查询
     * @param dto 查询参数
     * @return Page<Region>
     */
    Page<Region> listPage(RegionQueryDto dto);

    /**
     * 获取用户列表
     * @param dto QueryUserQeqDto
     * @return PageBean<UserDto>
     */
    PageBean<UserDto> listUser(QueryUserQeqDto dto);
}
