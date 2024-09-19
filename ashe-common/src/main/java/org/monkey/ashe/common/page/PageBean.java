package org.monkey.ashe.common.page;

import com.alibaba.fastjson.JSONObject;
import lombok.Data;

import java.util.List;

/**
 * PageBean
 *
 * @author cc
 * @since 2024/9/19 11:07
 */
@Data
public class PageBean<T> {
    private long pageNum;
    private long pageSize;
    private long totalPage;
    private long totalCount;
    private List<T> list;

    @Override
    public String toString() {
        return JSONObject.toJSONString(this);
    }
}
