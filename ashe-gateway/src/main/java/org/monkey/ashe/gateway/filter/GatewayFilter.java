package org.monkey.ashe.gateway.filter;

import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.ThreadContext;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * GatewayFilter
 *
 * @author cc
 * @since 2024/8/22 19:21
 */
@Component
@Slf4j
public class GatewayFilter implements GlobalFilter, Ordered {
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        /*try {
            ServerHttpRequest serverHttpRequest = exchange.getRequest();
            ServerHttpResponse serverHttpResponse = exchange.getResponse();
            LogGlobalFilterUtil.setThreadContext(serverHttpRequest, serverHttpResponse);
            log.info("请求地址：{}", exchange.getRequest().getURI().getPath());
            return chain.filter(exchange);
        } finally {
            ThreadContext.remove(LogGlobalFilterUtil.REQUEST_ID_HEADER);
        }*/
        return chain.filter(exchange);
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
