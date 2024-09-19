package org.monkey.ashe.test.aaaa.controller;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.monkey.ashe.common.dto.Result;
import org.monkey.ashe.common.page.PageBean;
import org.monkey.ashe.test.aaaa.dto.RegionQueryDto;
import org.monkey.ashe.test.aaaa.pojo.Region;
import org.monkey.ashe.test.aaaa.service.IRegionService;
import org.monkey.ashe.test.bbbb.dto.QueryUserQeqDto;
import org.monkey.ashe.test.bbbb.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/userList")
    public Result<PageBean<UserDto>> getUserList(@RequestBody QueryUserQeqDto dto) {
        return Result.ok(regionService.listUser(dto));
    }
}
