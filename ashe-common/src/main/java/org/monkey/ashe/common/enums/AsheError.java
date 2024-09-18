package org.monkey.ashe.common.enums;

import lombok.Getter;

/**
 * GweError
 *
 * @author cc
 * @since 2024/8/20 9:25
 */
@Getter
public enum AsheError {

    OK(0, "success"),
    FAIL(-1, "fail"),
    UNKNOWN(99, "Unknown error"),
    ERR_PARAM(1000, "Invalid param"),
    ;

    private int code = 200;
    private String msg;
    AsheError(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
