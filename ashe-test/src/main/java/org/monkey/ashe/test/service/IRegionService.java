package org.monkey.ashe.test.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.monkey.ashe.test.dto.RegionQueryDto;
import org.monkey.ashe.test.pojo.Region;
import com.baomidou.mybatisplus.extension.service.IService;

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
}
