package com.learning.pattern.strategy;

import com.sun.org.apache.regexp.internal.REUtil;

/**
 * @author: dengxin.chen
 * @date: 2019-11-01 21:04
 * @description:
 */
public class Order {

    private Long uid;
    private String orderNo;
    private Double amount;

    public Order(Long uid, String orderNo, Double amount) {
        this.uid = uid;
        this.orderNo = orderNo;
        this.amount = amount;
    }

    public Result pay(Integer channelCode) {
        AbstractPayChannel payChannel = PayChannelStrategy.get(channelCode);
        System.out.println("本次使用的支付方式：" + payChannel.getChanelName());
        System.out.println("本次交易金额，amount=" + this.amount + "，开始扣款......");
        return payChannel.pay(this.uid, this.amount);
    }
}
