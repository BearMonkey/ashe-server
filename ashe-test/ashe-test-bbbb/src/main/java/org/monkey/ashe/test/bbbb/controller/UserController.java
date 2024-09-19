package org.monkey.ashe.test.bbbb.controller;


import org.monkey.ashe.common.dto.Result;
import org.monkey.ashe.common.page.PageBean;
import org.monkey.ashe.test.bbbb.dto.QueryUserQeqDto;
import org.monkey.ashe.test.bbbb.dto.UserDto;
import org.monkey.ashe.test.bbbb.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author cc
 * @since 2024-09-19
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @PostMapping("/list")
    public Result<PageBean<UserDto>> listPage(@RequestBody QueryUserQeqDto dto) {
        return Result.ok(userService.queryUser(dto));
    }
}
