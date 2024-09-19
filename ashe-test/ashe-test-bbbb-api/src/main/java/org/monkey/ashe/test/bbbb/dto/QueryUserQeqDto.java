package org.monkey.ashe.test.bbbb.dto;

import com.alibaba.fastjson.JSONObject;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * QueryUserDto
 *
 * @author cc
 * @since 2024/9/19 11:51
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class QueryUserQeqDto extends UserDto{

    @ApiModelProperty(value = "页码")
    private long pageNum;

    @ApiModelProperty(value = "页大小")
    private long pageSize;

    @Override
    public String toString() {
        return JSONObject.toJSONString(this);
    }

}
