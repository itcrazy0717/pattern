package com.learning.pattern.strategy;

/**
 * @author: dengxin.chen
 * @date: 2019-11-01 21:01
 * @description: 具体策略角色
 */
public class AliPay extends AbstractPayChannel {

    @Override
    String getChanelName() {
        return "支付宝";
    }

    @Override
    Double queryBalance(Long uid) {
        return 500d;
    }
}
