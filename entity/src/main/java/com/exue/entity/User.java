package com.exue.entity;

import lombok.Data;

import java.util.Date;

/**
 * 学员
 * @author 86130
 */
@Data
public class User {
    private String id;

    /**
     * 微信号
     */
    private String openId;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 密码
     */
    private String password;

    /**
     * 昵称
     */
    private String nickname;

    /**
     * 性别
     */
    private Boolean sex;

    /**
     * 生日
     */
    private Date birthday;

    /**
     * 头像
     */
    private String avatar;

    /**
     * 是否禁用
     */
    private Boolean disabled;



    /**
     * 逻辑删除
     */
    private Boolean delete;

    /**
     * 创建时间
     */
    private Date creationTime;

    /**
     * 更新时间
     */
    private Date updateTime;
}
