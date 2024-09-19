package org.monkey.ashe.basic.interceptor;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.util.WebUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.UUID;

/**
 * RequestIdInterceptor
 *
 * @author cc
 * @since 2024/9/18 17:17
 */
@Component
@Slf4j
public class RequestIdInterceptor implements HandlerInterceptor {
    private static final String REQUEST_ID = "requestId";
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        log.info("1111111111111111111111");
        String requestId = request.getHeader(REQUEST_ID);
        if (requestId == null) {
            requestId = UUID.randomUUID().toString().replaceAll("-", "");
            log.info("1111111111111111111111 generate:{}", requestId);
        }
        MDC.put(REQUEST_ID, requestId);
        WebUtils.setSessionAttribute(request, REQUEST_ID, requestId);
        return true;
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

        log.info("2222222222222222222222222222");
        MDC.remove(REQUEST_ID);
        WebUtils.setSessionAttribute(request, REQUEST_ID, null);
    }
}
