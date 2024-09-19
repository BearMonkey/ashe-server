package org.monkey.ashe.test.bbbb.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDate;

/**
 * UserDto
 *
 * @author cc
 * @since 2024/9/19 14:24
 */
@Data
public class UserDto {

    private Integer id;

    @ApiModelProperty(value = "账号")
    private String account;

    @ApiModelProperty(value = "姓名")
    private String name;

    @ApiModelProperty(value = "出生日期")
    private LocalDate birth;

    @ApiModelProperty(value = "性别 0 女，1男，null：未设置")
    private String gender;
}
