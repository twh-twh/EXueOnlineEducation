package com.exue.entity;

import lombok.Data;

import java.util.Date;

/**
 * 订单
 * @author 86130
 */
@Data
public class Order {
    private String id;

    /**
     * 用户
     */
    private User user;

    /**
     * 课程id
     */
    private Course course;

    /**
     * 支付金额
     */
    private Integer paymentAmount;

    /**
     * 支付时间
     */
    private Date parTime;

    /**
     * 逻辑删除
     */
    private Boolean isDeleted;

    /**
     * 创建时间
     */
    private Date creationTime;

    /**
     * 更新时间
     */
    private Date updateTime;
}
