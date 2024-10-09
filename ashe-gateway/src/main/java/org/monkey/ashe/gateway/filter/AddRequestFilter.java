package org.monkey.ashe.gateway.filter;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.MDC;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.util.UUID;

/**
 * GatewayFilter
 *
 * @author cc
 * @since 2024/8/22 19:21
 */
@Component
@Slf4j
public class AddRequestFilter implements GlobalFilter, Ordered {
    private static final String REQUEST_ID = "requestId";
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        try {
            String requestId = UUID.randomUUID().toString().replaceAll("-", "");
            MDC.put(REQUEST_ID, requestId);
            exchange.getRequest().mutate().headers(httpHeaders -> httpHeaders.add(REQUEST_ID, requestId));
            //log.info("请求地址：{}", exchange.getRequest().getURI().getPath());
        } finally {
            MDC.remove(REQUEST_ID);
        }
        return chain.filter(exchange);
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
