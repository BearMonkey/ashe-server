package org.monkey.ashe.test.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.extern.slf4j.Slf4j;
import org.monkey.ashe.test.dto.RegionQueryDto;
import org.monkey.ashe.test.pojo.Region;
import org.monkey.ashe.test.mapper.RegionMapper;
import org.monkey.ashe.test.service.IRegionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author cc
 * @since 2024-09-18
 */
@Service
@Slf4j
public class RegionServiceImpl extends ServiceImpl<RegionMapper, Region> implements IRegionService {

    @Override
    public Page<Region> listPage(RegionQueryDto dto) {
        Page<Region> page = new Page<>();
        page.setCurrent(dto.getPageNum());
        page.setSize(dto.getPageSize());
        LambdaQueryWrapper<Region> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(Region::getType, dto.getType());
        Page<Region> regionPage = baseMapper.selectPage(page, wrapper);
        log.info("RegionServiceImpl listPage regionPage={}", JSONObject.toJSONString(regionPage));
        log.info("RegionServiceImpl listPage page={}", JSONObject.toJSONString(page));
        return regionPage;
    }
}
