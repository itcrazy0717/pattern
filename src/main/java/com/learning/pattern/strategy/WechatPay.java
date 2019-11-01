package com.learning.pattern.strategy;

/**
 * @author: dengxin.chen
 * @date: 2019-11-01 21:02
 * @description:
 */
public class WechatPay extends AbstractPayChannel {

    @Override
    String getChanelName() {
        return "微信支付";
    }

    @Override
    Double queryBalance(Long uid) {
        return 200d;
    }
}
