package com.zouzy.model.to;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;
import org.springframework.beans.BeanUtils;

import java.util.Date;

@Data
public class UserInfoTO {

    /**
     * 用户昵称
     */
    @ExcelProperty("用户昵称")
    private String username;

    /**
     * 账号
     */
    @ExcelProperty("账号")
    private String userAccount;

    /**
     * 用户头像
     */
    @ExcelProperty("用户头像")
    private String avatarUrl;

    /**
     * 性别
     */
    @ExcelProperty("性别")
    private Integer gender;

    /**
     * 密码
     */
    @ExcelProperty("密码")
    private String userPassword;

    /**
     * 电话
     */
    @ExcelProperty("电话")
    private String phone;

    /**
     * 邮箱
     */
    @ExcelProperty("邮箱")
    private String email;

    /**
     * 创建时间
     */
    @ExcelProperty("创建时间")
    private Date createTime;

    /**
     * 星球编号
     */
    @ExcelProperty("星球编号")
    private String planetCode;

    /**
     * 标签 json 列表
     */
    @ExcelProperty("标签")
    private String tags;


    public User getUser() {
        User user = new User();
        BeanUtils.copyProperties(this, user);
        return user;
    }
}
