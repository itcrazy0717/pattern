package com.learning.pattern.proxy.staticproxy;

import com.learning.pattern.proxy.CallCar;

/**
 * @author: dengxin.chen
 * @date: 2019-10-30 22:02
 * @description:代理对象角色
 */
public class StaticProxy implements CallCar {

    private CallCar callCar;

    public StaticProxy(CallCar callCar) {
        this.callCar = callCar;
    }

    @Override
    public void callCar() {
        callCar.callCar();
    }
}
