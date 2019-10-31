package com.learning.pattern.proxy.staticproxy;

import com.learning.pattern.proxy.CallCar;

/**
 * @author: dengxin.chen
 * @date: 2019-10-30 22:02
 * @description:目标对象角色
 */
public class TaxiCar implements CallCar {
    @Override
    public void callCar() {
        System.out.println("叫了一辆出租车");
    }
}
