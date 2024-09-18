package org.monkey.ashe.common.holder;

/**
 * RequestIdHolder
 *
 * @author cc
 * @since 2024/9/18 16:41
 */
public class RequestIdHolder {
    private static final ThreadLocal<String> requestIdThreadLocal = new ThreadLocal<>();

    public static void setRequestId(String requestId) {
        requestIdThreadLocal.set(requestId);
    }

    public static String getRequestId() {
        return requestIdThreadLocal.get();
    }

    public static void clearRequestId() {
        requestIdThreadLocal.remove();
    }
}
