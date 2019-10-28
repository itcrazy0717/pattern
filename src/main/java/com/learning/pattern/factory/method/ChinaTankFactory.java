package com.learning.pattern.factory.method;

/**
 * @author: dengxin.chen
 * @date: 2019-10-28 21:58
 * @description: 具体工厂
 */
public class ChinaTankFactory implements CreateTank {

    @Override
    public Tank getTank() {
        return new ChinaTank();
    }
}
