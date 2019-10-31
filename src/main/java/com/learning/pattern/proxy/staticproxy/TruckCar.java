package com.learning.pattern.proxy.staticproxy;

import com.learning.pattern.proxy.CallCar;

/**
 * @author: dengxin.chen
 * @date: 2019-10-30 22:19
 * @description:
 */
public class TruckCar implements CallCar {
    @Override
    public void callCar() {
        System.out.println("这是一辆货车");
    }
}
