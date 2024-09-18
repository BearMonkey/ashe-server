package org.monkey.ashe.common.dto;

import lombok.Data;
import org.monkey.ashe.common.enums.AsheError;

import java.io.Serializable;

/**
 * Result
 *
 * @author cc
 * @since 2024/8/20 9:18
 */
@Data
public class Result<T> implements Serializable {
    private static final long serialVersionUID = 1L;
    private int code;
    private String msg;
    private T data;

    public static <T> Result<T> ok(T data) {
        return ok(AsheError.OK.getCode(), AsheError.OK.getMsg(), data);
    }

    public static <T> Result<T> ok(String msg, T data) {
        return ok(AsheError.OK.getCode(), msg, data);
    }

    public static <T> Result<T> ok(int code, String msg, T data) {
        Result<T> result = new Result<T>();
        result.setCode(code);
        result.setMsg(msg);
        result.setData(data);
        return result;
    }

    public static <T> Result<T> fail(T data) {
        return fail(AsheError.FAIL.getCode(), AsheError.FAIL.getMsg(), data);
    }

    public static <T> Result<T> fail(String msg, T data) {
        return fail(AsheError.FAIL.getCode(), msg, data);
    }

    public static <T> Result<T> fail(int code, String msg, T data) {
        Result<T> result = new Result<T>();
        result.setCode(code);
        result.setMsg(msg);
        result.setData(data);
        return result;
    }
}
