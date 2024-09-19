package org.monkey.ashe.test.aaaa.dto;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * RegionQueryDto
 *
 * @author cc
 * @since 2024/9/18 14:15
 */
@Data
public class RegionQueryDto {
    @ApiModelProperty(value = "自增主键")
    private Integer id;

    @ApiModelProperty(value = "上一级id")
    private Integer pid;

    @ApiModelProperty(value = "名称")
    private String name;

    @ApiModelProperty(value = "备注")
    private String remark;

    @ApiModelProperty(value = "类型 1 2 3 4 5")
    private Integer type;

    @ApiModelProperty(value = "页码")
    private Integer pageNum;

    @ApiModelProperty(value = "每页大小")
    private Integer pageSize;

    @Override
    public String toString() {
        return JSONObject.toJSONString(this);
    }
}
