package com.learning.pattern.strategy;

import org.junit.jupiter.api.Test;

/**
 * @author: dengxin.chen
 * @date: 2019-11-01 21:16
 * @description: 策略模式主测试类
 */
public class StrategyMainTest {

    @Test
    public void strategyTest() {

        Order order = new Order(123L, "20190101000001", 300d);

        System.out.println(order.pay(PayChannel.ALI_CHANNEL.getCode()));

    }
}
