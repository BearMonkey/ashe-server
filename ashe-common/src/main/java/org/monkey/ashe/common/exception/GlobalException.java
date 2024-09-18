package org.monkey.ashe.common.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * GlobalException
 *
 * @author cc
 * @since 2024/8/20 9:18
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class GlobalException extends RuntimeException {
    private int code;
    private String msg;
    private Throwable cause = null;

    public GlobalException(final int code, final String msg, final Throwable cause) {
        super(msg, cause);
        this.code = code;
        this.msg = msg;
        this.cause = cause;
    }

    public GlobalException(final int code, final String msg) {
        super(msg);
        this.code = code;
        this.msg = msg;
    }
}
