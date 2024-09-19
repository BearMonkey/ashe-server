package org.monkey.ashe.basic.config;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.StringUtils;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.UUID;

/**
 * FeignConfig
 *
 * @author cc
 * @since 2024/9/19 16:56
 */
@Configuration
@Slf4j
public class FeignConfig {
    private static final String REQUEST_ID = "requestId";

    @Bean
    public RequestInterceptor requestInterceptor() {
        return new RequestInterceptor() {
            @Override
            public void apply(RequestTemplate template) {
                log.info("FeignConfig RequestInterceptor apply aaaaaaaaaaaaaa");
                // 生成或获取requestId，并添加到header中
                String requestId = null;
                ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
                if (null != attributes) {
                    HttpServletRequest request = attributes.getRequest();
                    requestId = request.getHeader(REQUEST_ID);
                }
                if (requestId == null || requestId.isEmpty()) {
                    requestId = UUID.randomUUID().toString().replaceAll("-", "");
                }
                template.header(REQUEST_ID, requestId);
            }
        };
    }
}
