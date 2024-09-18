package org.monkey.ashe.test.controller;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.monkey.ashe.common.dto.Result;
import org.monkey.ashe.test.dto.RegionQueryDto;
import org.monkey.ashe.test.pojo.Region;
import org.monkey.ashe.test.service.IRegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author cc
 * @since 2024-09-18
 */
@RestController
@RequestMapping("/region")
public class RegionController {

    @Autowired
    private IRegionService regionService;

    @PostMapping("/list")
    public Result<Page<Region>> list(@RequestBody RegionQueryDto dto) {
        Page<Region> list = regionService.listPage(dto);
        return Result.ok(list);
    }
}
