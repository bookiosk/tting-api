package com.zouzy.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 用户调用接口关系
 * @TableName user_interface_info
 */
@TableName(value ="user_interface_info")
@Data
public class UserInterfaceInfo implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 调用用户 id
     */
    @TableField(value = "userId")
    private Long userid;

    /**
     * 接口 id
     */
    @TableField(value = "interfaceInfoId")
    private Long interfaceInfoId;

    /**
     * 总调用次数
     */
    @TableField(value = "totalNum")
    private Integer totalNum;

    /**
     * 剩余调用次数
     */
    @TableField(value = "leftNum")
    private Integer leftNum;

    /**
     * 0-正常，1-禁用
     */
    @TableField(value = "status")
    private Integer status;

    /**
     * 创建时间
     */
    @TableField(value = "createTime")
    private Date createTime;

    /**
     * 更新时间
     */
    @TableField(value = "updateTime")
    private Date updateTime;

    /**
     * 是否删除(0-未删, 1-已删)
     */
    @TableField(value = "isDelete")
    private Integer isDelete;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}