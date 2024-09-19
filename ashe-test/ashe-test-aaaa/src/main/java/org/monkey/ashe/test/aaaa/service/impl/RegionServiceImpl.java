package org.monkey.ashe.test.aaaa.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.extern.slf4j.Slf4j;
import org.monkey.ashe.common.dto.Result;
import org.monkey.ashe.common.page.PageBean;
import org.monkey.ashe.test.aaaa.dto.RegionQueryDto;
import org.monkey.ashe.test.aaaa.pojo.Region;
import org.monkey.ashe.test.aaaa.mapper.RegionMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.monkey.ashe.test.aaaa.service.IRegionService;
import org.monkey.ashe.test.bbbb.dto.QueryUserQeqDto;
import org.monkey.ashe.test.bbbb.dto.UserDto;
import org.monkey.ashe.test.bbbb.feign.UserFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private UserFeignClient userFeignClient;

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

    @Override
    public PageBean<UserDto> listUser(QueryUserQeqDto dto) {
        Result<PageBean<UserDto>> listUserResult = userFeignClient.listPage(dto);
        if (listUserResult == null) {
            return new PageBean<>();
        }
        return listUserResult.getData();
    }
}
