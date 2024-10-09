package org.monkey.ashe.gateway.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.core.io.buffer.DataBufferUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.nio.charset.StandardCharsets;

/**
 * AuthFilter
 *
 * @author cc
 * @since 2024/9/20 11:13
 */
@Component
@Slf4j
public class AuthFilter implements GlobalFilter, Ordered {
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        String token = exchange.getRequest().getHeaders().getFirst("Authorization");
        boolean isAuthenticated = "expected-token".equals(token);
        if (isAuthenticated) {
            // 如果验证通过，继续请求
            return chain.filter(exchange);
        } else {
            // 如果未通过验证，返回401 Unauthorized响应
            ServerHttpResponse response = exchange.getResponse();
            response.setStatusCode(HttpStatus.UNAUTHORIZED);
            response.getHeaders().set("Content-Type", "application/json");
            String json = "{\"message\":\"Unauthorized\"}";
            //DataBufferUtils.write(response.bufferFactory().wrap(json.getBytes(StandardCharsets.UTF_8)), response.get);
            return response.setComplete();
        }
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
