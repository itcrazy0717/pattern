package com.learning.pattern.factory.simple;

/**
 * @author: dengxin.chen
 * @date: 2019-10-28 21:36
 * @description: 奥迪
 */
public class AudiCar implements CreateCar {

    @Override
    public void productionCar() {
        System.out.println("生产奥迪A4");
    }
}
