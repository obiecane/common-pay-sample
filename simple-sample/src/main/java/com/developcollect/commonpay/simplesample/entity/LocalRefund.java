package com.developcollect.commonpay.simplesample.entity;

import lombok.Data;

/**
 * @author zak
 * @version 1.0
 * @date 2020/8/10 14:29

 */
@Data
public class LocalRefund {

    private String code;

    private Long refundAmount;

    private Integer payType;
}
