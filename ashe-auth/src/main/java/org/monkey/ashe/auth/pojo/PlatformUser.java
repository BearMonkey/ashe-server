package org.monkey.ashe.auth.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDate;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author cc
 * @since 2024-08-30
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("cc_platform_user")
@ApiModel(value="PlatformUser对象", description="")
public class PlatformUser implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField("name")
    private String name;

    @TableField("birth")
    private LocalDate birth;

    @TableField("gender")
    private String gender;

    @TableField("create_time")
    private LocalDateTime createTime;

    @TableField("create_user")
    private String createUser;

    @TableField("update_time")
    private LocalDateTime updateTime;

    @TableField("update_user")
    private String updateUser;

    @TableField("del_flag")
    private String delFlag;


}
