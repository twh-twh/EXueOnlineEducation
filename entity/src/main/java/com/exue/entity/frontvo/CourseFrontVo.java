package com.exue.entity.frontvo;

import lombok.Data;

/**
 * @author 86130
 */
@Data
public class CourseFrontVo {
    public static final String CLASSES_FREE = "free";
    public static final String CLASSES_SALE = "sale";
    public static final String CLASSES_ACTIVITY = "activity";

    /**
     * 课程级别，免费，限免，特价
     */
    private String classes;

    /**
     * 商品类型id
     */
    private String courseTypeId;

    /**
     * 排序方式
     */
    private Boolean isTime;

    /**
     * 搜索内容
     */
    private String search;

    /**
     * 当前页面
     */
    private Integer pageNum;

    /**
     * 页面大小
     */
    private Integer pageSize;
}
