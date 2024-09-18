package org.monkey.ashe.basic.handler;

import lombok.extern.slf4j.Slf4j;
import org.monkey.ashe.common.dto.Result;
import org.monkey.ashe.common.exception.GlobalException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * GlobalExceptionHandler
 *
 * @author cc
 * @since 2024/8/29 14:32
 */
@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {
    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public Result<?> handleException(Exception e) {
        log.info("======================= {}", e.getMessage());
        return Result.fail(500, "服务器内部错误", e.getMessage());
    }
    @ExceptionHandler(GlobalException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public Result<?> handleResourceNotFoundException(GlobalException e) {
        log.error("GlobalExceptionXX: {}", e.getMessage());
        return Result.fail(e.getCode(), e.getMessage(), null);
    }
}
