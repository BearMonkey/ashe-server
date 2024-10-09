package org.monkey.ashe.user.pojo;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDate;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.monkey.ashe.common.pojo.BaseEntity;

/**
 * <p>
 * 
 * </p>
 *
 * @author cc
 * @since 2024-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("cc_user")
@ApiModel(value="User对象", description="")
public class User extends BaseEntity {

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "账号")
    private String account;

    @ApiModelProperty(value = "密码")
    private String password;

    @ApiModelProperty(value = "姓名")
    private String name;

    @ApiModelProperty(value = "出生日期")
    private LocalDate birth;

    @ApiModelProperty(value = "性别 0 女，1男，null：未设置")
    private String gender;

    @Override
    public String toString() {
        return JSONObject.toJSONString(this);
    }
}
