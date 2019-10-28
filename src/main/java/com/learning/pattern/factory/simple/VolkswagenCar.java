package com.learning.pattern.factory.simple;

/**
 * @author: dengxin.chen
 * @date: 2019-10-28 21:37
 * @description:
 */
public class VolkswagenCar implements CreateCar {

    @Override
    public void productionCar() {
        System.out.println("生产大众GTR");
    }
}
