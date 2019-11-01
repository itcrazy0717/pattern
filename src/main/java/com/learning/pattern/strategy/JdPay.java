package com.learning.pattern.strategy;

/**
 * @author: dengxin.chen
 * @date: 2019-11-01 21:04
 * @description:
 */
public class JdPay extends AbstractPayChannel {

    @Override
    String getChanelName() {
        return "京东白条";
    }

    @Override
    Double queryBalance(Long uid) {
        return 100d;
    }
}
