package org.monkey.ashe.test.bbbb.feign;

import org.monkey.ashe.common.dto.Result;
import org.monkey.ashe.common.page.PageBean;
import org.monkey.ashe.test.bbbb.dto.QueryUserQeqDto;
import org.monkey.ashe.test.bbbb.dto.UserDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * UserFeignClient
 *
 * @author cc
 * @since 2024/9/19 14:10
 */
@FeignClient(name = "ashe-test-bbbb", path = "/test-bbbb/user")
public interface UserFeignClient {
    @PostMapping("/list")
    Result<PageBean<UserDto>> listPage(@RequestBody QueryUserQeqDto dto);
}
