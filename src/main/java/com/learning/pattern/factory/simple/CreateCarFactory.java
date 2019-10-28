package com.learning.pattern.factory.simple;

import java.util.Objects;

/**
 * @author: dengxin.chen
 * @date: 2019-10-28 21:35
 * @description: 工厂对象
 */
public class CreateCarFactory {

    /**
     * 简单工厂模式主要核心在于工厂对象，含有抽象产品、具体产品、工厂对象三个角色
     * 通过工厂对象生产不同的产品
     *
     * @param type
     */
    public static void createCar(Integer type) {
        CreateCar car = null;
        if (Objects.isNull(type)) {
            System.out.println("汽车品牌不能为空");
            return;
        } else if (1 == type) {
            car = new AudiCar();
        } else if (2 == type) {
            car = new VolkswagenCar();
        } else {
            System.out.println("没有该汽车品牌");
            return;
        }
        car.productionCar();
    }


}
