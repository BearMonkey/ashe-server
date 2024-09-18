package org.monkey.ashe.test.controller;


import org.monkey.ashe.test.pojo.PlatformUser;
import org.monkey.ashe.test.service.PlatformUserService;
import org.monkey.ashe.common.dto.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author cc
 * @since 2024-08-30
 */
@RestController
@RequestMapping("/platform-user")
public class PlatformUserController {

    @Autowired
    private PlatformUserService platformUserService;

    @GetMapping("/list")
    public Result<List<PlatformUser>> userList(@RequestBody PlatformUser platformUser) {
        return Result.ok(platformUserService.findUserByName(platformUser.getName()));
    }
}
