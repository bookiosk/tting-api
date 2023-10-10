package com.zouzy.common;

import com.zouzy.constant.CommonConstant;
import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * 分页请求
 *
 * 
 * 
 */
@Data
@Component
public class PageRequest {

    /**
     * 当前页号
     */
    private long current = 1;

    /**
     * 页面大小
     */
    private long pageSize = 10;

    /**
     * 排序字段
     */
    private String sortField;

    /**
     * 排序顺序（默认升序）
     */
    private String sortOrder = CommonConstant.SORT_ORDER_ASC;
}
