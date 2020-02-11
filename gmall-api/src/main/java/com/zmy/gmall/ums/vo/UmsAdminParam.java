package com.zmy.gmall.ums.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Email;

/**
 * 用户登录参数
 * Created by atguigu 4/26.
 */
@Getter
@Setter
public class UmsAdminParam {
    @Length(max = 18,min = 6,message = "用户名必须6-18位")
    @ApiModelProperty(value = "用户名", required = true)
    private String username;
    @ApiModelProperty(value = "密码", required = true)

    private String password;
    @ApiModelProperty(value = "用户头像")
    private String icon;
    @Email(message = "邮箱格式不正确")
    @ApiModelProperty(value = "邮箱")
    private String email;
    @ApiModelProperty(value = "用户昵称")
    private String nickName;
    @ApiModelProperty(value = "备注")
    private String note;
}
