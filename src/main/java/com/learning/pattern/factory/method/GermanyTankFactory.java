package com.learning.pattern.factory.method;

/**
 * @author: dengxin.chen
 * @date: 2019-10-28 21:59
 * @description:
 */
public class GermanyTankFactory implements CreateTank {

    @Override
    public Tank getTank() {
        return new GermanyTank();
    }
}
