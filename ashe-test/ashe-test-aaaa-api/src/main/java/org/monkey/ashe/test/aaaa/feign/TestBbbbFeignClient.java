package org.monkey.ashe.test.aaaa.feign;

import org.springframework.cloud.openfeign.FeignClient;

/**
 * TestAaaaFeignClient
 *
 * @author cc
 * @since 2024/9/19 9:38
 */
@FeignClient(name = "test-aaaa", path = "/test-aaaa/region")
public interface TestBbbbFeignClient {

//    @PostMapping("/list")
//    Result<Page<Region>> list(@RequestBody RegionQueryDto dto);
}
